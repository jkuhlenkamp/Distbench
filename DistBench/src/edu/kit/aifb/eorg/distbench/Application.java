package edu.kit.aifb.eorg.distbench;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.AxisFault;

import com.profitbricks.api.ws.DataCenter;
import com.profitbricks.api.ws.ProfitbricksApiService;
import com.profitbricks.api.ws.ProfitbricksApiServiceLocator;
import com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub;
import com.profitbricks.api.ws.Server;
import com.profitbricks.api.ws.Storage;
import com.profitbricks.api.ws.VersionResponse;

import edu.kit.aifb.eorg.distbench.model.fac.DeploymentEnvironmentCreator;
import edu.kit.aifb.eorg.distbench.model.fac.FourNodeDeploymentCreator;
import edu.kit.aifb.eorg.distbench.model.impl.Datacenter;
import edu.kit.aifb.eorg.distbench.model.impl.DeploymentEnvironment;
import edu.kit.aifb.eorg.distbench.model.impl.VLink;
import edu.kit.aifb.eorg.distbench.model.impl.VMachine;
import edu.kit.aifb.eorg.distbench.model.impl.VVolume;
import edu.kit.aifb.eorg.distbench.provisioning.ProfitBricksProvisioningStrategy;
import edu.kit.aifb.eorg.distbench.provisioning.ProvisioningStrategy;

public class Application {

	private static final String DISTBENCH_DATACENTER = "distbenchDatacenter";
	private static final String HTTPS_API_PROFITBRICKS_COM_1_2 = "https://api.profitbricks.com/1.2";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ProfitbricksApiService pbApiService = new ProfitbricksApiServiceLocator();
		try {
			ProfitbricksApiServicePortBindingStub stub = new ProfitbricksApiServicePortBindingStub(
					new URL(HTTPS_API_PROFITBRICKS_COM_1_2), pbApiService);
			stub.setUsername("joern.kuhlenkamp@kit.edu");
			stub.setPassword("distbench");

			DeploymentEnvironmentCreator environmentCreator = new FourNodeDeploymentCreator();
			DeploymentEnvironment deploymentEnvironment = environmentCreator
					.createDeployment();
			List<Datacenter> datacenters = deploymentEnvironment
					.getAllDatacenters();
			for (Datacenter datacenter : datacenters) {
				ProvisioningStrategy strategy = new ProfitBricksProvisioningStrategy(stub);
				strategy.createDatacenter(datacenter);
				List<VMachine> vMachines = datacenter.getAllVMachines();
				instanciateVMachines(strategy, vMachines);
				instanciateVVolumes(strategy, vMachines);
//				instanciateVLinksForVMachines(strategy, vMachines);
			}
			// ProfitBricksApi profitBricksApi = new ProfitBricksApi(stub);
			// DataCenter datacenter =
			// profitBricksApi.createDatacenter(DISTBENCH_DATACENTER);
			// System.out.println("Datacenter " + datacenter.getDataCenterId());
			// Server serverJoern =
			// profitBricksApi.createServer(datacenter.getDataCenterId(), 1,
			// 512);
			// System.out.println("Server " + serverJoern.getServerId());
			// Server serverBugra =
			// profitBricksApi.createServer(datacenter.getDataCenterId(), 1,
			// 512);
			// System.out.println("Server " + serverBugra.getServerId());
			// Storage storage =
			// profitBricksApi.createStorage(datacenter.getDataCenterId(),
			// "MyStorage", 30);
			// System.out.println("Storage " + storage.getStorageId());
			// VersionResponse versionResponse =
			// profitBricksApi.connectStorageToServer(storage.getStorageId(),
			// serverJoern.getServerId());
			// System.out.println("Version Response" +
			// versionResponse.getRequestId());
			// profitBricksApi.createNic(serverJoern.getServerId(), 1, true);
			// profitBricksApi.createNic(serverBugra.getServerId(), 1, true);
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	private static void instanciateVVolumes(ProvisioningStrategy strategy,
			List<VMachine> vMachines) {
		for (VMachine vMachine : vMachines) {
			List<VVolume> vVolumes = vMachine.getAllVVolumes();
			for (VVolume vVolume : vVolumes) {
				strategy.createVVolume(vVolume);
				strategy.connectVVolumeToVMachine(vVolume, vMachine);
			}
		}
	}

	private static void instanciateVLinksForVMachines(ProvisioningStrategy strategy, List<VMachine> vMachines) {
		for (VMachine vMachine : vMachines) {
			List<VLink> allVLinks = vMachine.getAllVLinks();
			List<VLink> visitedVLinks = new ArrayList<>();
			for (VLink vLink : allVLinks) {
				if (!visitedVLinks.contains(vLink)) {
					strategy.createVLink(vLink);
					visitedVLinks.add(vLink);
				}
			}
		}
	}

	private static void instanciateVMachines(ProvisioningStrategy strategy,
			List<VMachine> vMachines) {
		for (VMachine vMachine : vMachines) {
			strategy.createVMachine(vMachine);
		}
	}

}
