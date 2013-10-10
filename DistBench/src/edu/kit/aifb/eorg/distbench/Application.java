package edu.kit.aifb.eorg.distbench;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

import com.profitbricks.api.ws.ProfitbricksApiService;
import com.profitbricks.api.ws.ProfitbricksApiServiceLocator;
import com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub;

import edu.kit.aifb.eorg.distbench.model.fac.DeploymentEnvironmentCreator;
import edu.kit.aifb.eorg.distbench.model.fac.FourNodeDeploymentCreator;
import edu.kit.aifb.eorg.distbench.model.impl.Datacenter;
import edu.kit.aifb.eorg.distbench.model.impl.DeploymentEnvironment;
import edu.kit.aifb.eorg.distbench.model.impl.VMachine;
import edu.kit.aifb.eorg.distbench.model.impl.VVolume;
import edu.kit.aifb.eorg.distbench.provisioning.ProfitBricksProvisioningStrategy;
import edu.kit.aifb.eorg.distbench.provisioning.ProvisioningStrategy;

public class Application {

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
			ProvisioningStrategy profitBricksStrategy = new ProfitBricksProvisioningStrategy(
					stub);
			for (Datacenter datacenter : datacenters) {
				provisionDatacenter(profitBricksStrategy, datacenter);
				provisionVMachines(profitBricksStrategy, datacenter.getAllVMachines());
				provisionVVolumes(profitBricksStrategy, datacenter.getAllVMachines());
			}
			for (Datacenter datacenter : datacenters) {
				System.out.println(datacenter.toString());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	private static List<VMachine> provisionDatacenter(
			ProvisioningStrategy strategy, Datacenter datacenter) {
		strategy.createDatacenter(datacenter);
		List<VMachine> vMachines = datacenter.getAllVMachines();
		return vMachines;
	}

	private static void provisionVVolumes(ProvisioningStrategy strategy,
			List<VMachine> vMachines) {
		for (VMachine vMachine : vMachines) {
			List<VVolume> vVolumes = vMachine.getAllVVolumes();
			for (VVolume vVolume : vVolumes) {
				strategy.createVVolume(vVolume);
				strategy.connectVVolumeToVMachine(vVolume, vMachine);
			}
		}
	}

	private static void provisionVMachines(ProvisioningStrategy strategy,
			List<VMachine> vMachines) {
		for (VMachine vMachine : vMachines) {
			strategy.createVMachine(vMachine);
		}
	}

}
