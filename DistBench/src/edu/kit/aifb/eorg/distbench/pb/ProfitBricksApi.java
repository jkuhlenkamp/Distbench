package edu.kit.aifb.eorg.distbench.pb;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

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

public class ProfitBricksApi {
	
	private ProfitbricksApiServicePortBindingStub stub;
	
	private static final String UBUNTU_13_04_SERVER_AMD64_05_28_13_IMG = "3e90d37c-c87a-11e2-b188-0025901dfe2a";
	
	public ProfitBricksApi(ProfitbricksApiServicePortBindingStub stub) {
		this.stub = stub;
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
	
	public Storage createStorage(String dataCenterId, String storageName, long size) throws ProfitbricksServiceFault, RemoteException {
		Image[] allImages = stub.getAllImages();
		for (Image image : allImages) {
			System.out.println(image.getImageId() + " | " + image.getImageName());
		}
		CreateStorageRequest request = new CreateStorageRequest();
		request.setDataCenterId(dataCenterId);
		request.setStorageName(storageName);
		request.setSize(size);
		request.setMountImageId(UBUNTU_13_04_SERVER_AMD64_05_28_13_IMG);
		request.setProfitBricksImagePassword("djstbench");
		return stub.getStorage(stub.createStorage(request).getStorageId());
	}
	
	public Server createServer(String dataCenterId, int cores, int ram_mb) throws ProfitbricksServiceFault, RemoteException {
		CreateServerRequest request = new CreateServerRequest();
		request.setCores(cores);
		request.setDataCenterId(dataCenterId);
		request.setOsType(OsType.LINUX);
		request.setRam(ram_mb);
		return stub.getServer(stub.createServer(request).getServerId());
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

	public VersionResponse connectStorageToServer(String storageId, String serverId) throws ProfitbricksServiceFault, RemoteException {
		ConnectStorageRequest request = new ConnectStorageRequest();
		request.setServerId(serverId);
		request.setStorageId(storageId);
		return stub.connectStorageToServer(request);
	}
	
}
