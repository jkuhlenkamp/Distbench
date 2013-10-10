package edu.kit.aifb.eorg.distbench.provisioning;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.profitbricks.api.ws.ConnectStorageRequest;
import com.profitbricks.api.ws.CreateDcResponse;
import com.profitbricks.api.ws.CreateNicRequest;
import com.profitbricks.api.ws.CreateNicResponse;
import com.profitbricks.api.ws.CreateServerRequest;
import com.profitbricks.api.ws.CreateStorageRequest;
import com.profitbricks.api.ws.DataCenter;
import com.profitbricks.api.ws.DataCenterIdentifier;
import com.profitbricks.api.ws.Image;
import com.profitbricks.api.ws.Nic;
import com.profitbricks.api.ws.OsType;
import com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub;
import com.profitbricks.api.ws.ProfitbricksServiceFault;
import com.profitbricks.api.ws.Region;
import com.profitbricks.api.ws.Server;
import com.profitbricks.api.ws.Storage;
import com.profitbricks.api.ws.VersionResponse;

import edu.kit.aifb.eorg.distbench.model.impl.Datacenter;
import edu.kit.aifb.eorg.distbench.model.impl.VLink;
import edu.kit.aifb.eorg.distbench.model.impl.VMachine;
import edu.kit.aifb.eorg.distbench.model.impl.VNetworkLink;
import edu.kit.aifb.eorg.distbench.model.impl.VVolume;

public class ProfitBricksProvisioningStrategy implements ProvisioningStrategy {
	
	private ProfitbricksApiServicePortBindingStub stub;
	
	private static final String UBUNTU_13_04_SERVER_AMD64_05_28_13_IMG = "3e90d37c-c87a-11e2-b188-0025901dfe2a";
	
	public ProfitBricksProvisioningStrategy(ProfitbricksApiServicePortBindingStub stub) {
		this.stub = stub;
	}
	
	public VersionResponse connectStorageToServer(String storageId, String serverId) throws ProfitbricksServiceFault, RemoteException {
		ConnectStorageRequest request = new ConnectStorageRequest();
		request.setServerId(serverId);
		request.setStorageId(storageId);
		return stub.connectStorageToServer(request);
	}
	
	@Override
	public void connectVVolumeToVMachine(VVolume vVolume, VMachine vMachine) {
		try {
			connectStorageToServer(vVolume.getProvidersidedEntityId(), vMachine.getProvidersidedEntityId());
		} catch (ProfitbricksServiceFault profitbricksServiceFault) {
			profitbricksServiceFault.printStackTrace();
		} catch (RemoteException remoteException) {
			remoteException.printStackTrace();
		}
	}

	@Override
	public Datacenter createDatacenter(Datacenter dc) {
		try {
			DataCenter datacenter = createDatacenter(dc.getName().toString());
			dc.setProvidersidedEntityId(datacenter.getDataCenterId());
		} catch (ProfitbricksServiceFault profitbricksServiceFault) {
			profitbricksServiceFault.printStackTrace();
		} catch (RemoteException remoteException) {
			remoteException.printStackTrace();
		}
		return dc;
	}
	
	public DataCenter createDatacenter(String datacenterName) throws RemoteException, ProfitbricksServiceFault {
		Map<String, String> datacenterMap = createDatacenterMap();
		if (!datacenterMap.containsKey(datacenterName)) {
			CreateDcResponse dcResponse = stub.createDataCenter(datacenterName, Region.EUROPE);
			return stub.getDataCenter(dcResponse.getDataCenterId());
		} else {
			return stub.getDataCenter(datacenterMap.get(datacenterName));
		}
	}
	
	private Map<String, String> createDatacenterMap() throws RemoteException, ProfitbricksServiceFault {
		Map<String, String> datacenterMap = new HashMap<>();
		DataCenterIdentifier[] dataCenters = stub.getAllDataCenters();
		for (DataCenterIdentifier dataCenterIdentifier : dataCenters) {
			String dataCenterId = dataCenterIdentifier.getDataCenterId();
			String dataCenterName = dataCenterIdentifier.getDataCenterName();
			datacenterMap.put(dataCenterName, dataCenterId);
		}
		return datacenterMap;
	}
	
	public Nic createNic(String serverId, int lanId, boolean isInternetAccessEnabled) throws ProfitbricksServiceFault, RemoteException {
		CreateNicRequest request = new CreateNicRequest();
		request.setServerId(serverId);
		request.setLanId(lanId);
		CreateNicResponse nicResponse = stub.createNic(request);
		Nic nic = stub.getNic(nicResponse.getNicId());
		nic.setInternetAccess(isInternetAccessEnabled);
		return nic;
	}

	public Server createServer(String dataCenterId, int cores, int ram_mb) throws ProfitbricksServiceFault, RemoteException {
		CreateServerRequest request = new CreateServerRequest();
		request.setCores(cores);
		request.setDataCenterId(dataCenterId);
		request.setOsType(OsType.LINUX);
		request.setRam(ram_mb);
		request.setInternetAccess(true);
		return stub.getServer(stub.createServer(request).getServerId());
	}
	
	public Storage createStorage(String dataCenterId, String storageName, long size) throws ProfitbricksServiceFault, RemoteException {
		CreateStorageRequest request = new CreateStorageRequest();
		request.setDataCenterId(dataCenterId);
		request.setStorageName(storageName);
		request.setSize(size);
		request.setMountImageId(UBUNTU_13_04_SERVER_AMD64_05_28_13_IMG);
		request.setProfitBricksImagePassword("djstbench");
		return stub.getStorage(stub.createStorage(request).getStorageId());
	}

	@Override
	public VLink createVLinks(VLink vLink) {
		VNetworkLink networkLink = (VNetworkLink) vLink;
		try {
			int lanId = Integer.parseInt(networkLink.getLanId());
			Nic nic = createNic(networkLink.getSourceEnd().getProvidersidedEntityId(), lanId, true);
			networkLink.setProvidersidedEntityId(nic.getNicId());
		} catch (ProfitbricksServiceFault profitbricksServiceFault) {
			profitbricksServiceFault.printStackTrace();
		} catch (RemoteException remoteException) {
			remoteException.printStackTrace();
		}
		return networkLink;
	}

	@Override
	public VMachine createVMachine(VMachine vm) {
		try {
			Server server = createServer(getDatacenterIdForName(vm.getDatacenter().getName().toString()), vm.getCores(), vm.getRam() * 1024);
			vm.setProvidersidedEntityId(server.getServerId());
			createNic(server.getServerId(), 1, true);
		} catch (ProfitbricksServiceFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return vm;
	}

	@Override
	public VVolume createVVolume(VVolume vVolume) {
		try {
			Storage storage = createStorage(getDatacenterIdForName(vVolume.getDatacenter().getName().toString()), vVolume.getName().toString(), vVolume.getStorageSize());
			vVolume.setProvidersidedEntityId(storage.getStorageId());
		} catch (ProfitbricksServiceFault profitbricksServiceFault) {
			profitbricksServiceFault.printStackTrace();
		} catch (RemoteException remoteException) {
			remoteException.printStackTrace();
		}
		return vVolume;
	}

	public String getDatacenterIdForName(String datacenterName) {
		Map<String, String> datacenterMap = null;
		try {
			datacenterMap = createDatacenterMap();
		} catch (ProfitbricksServiceFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		Set<String> keySet = datacenterMap.keySet();
		for (String key : keySet) {
			if (key.equals(datacenterName)) {
				return datacenterMap.get(key);
			}
		}
		throw new IllegalArgumentException("The specified datacenter name is not in the list");
	}

	public void printAllProfitBricksImages() throws RemoteException,
			ProfitbricksServiceFault {
		Image[] allImages = stub.getAllImages();
		for (Image image : allImages) {
			System.out.println(image.getImageId() + " | " + image.getImageName());
		}
	}
	
}
