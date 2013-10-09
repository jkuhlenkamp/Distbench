package edu.kit.aifb.eorg.distbench.model.fac;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import edu.kit.aifb.eorg.distbench.model.enums.AvailabilityZone;
import edu.kit.aifb.eorg.distbench.model.enums.CloudProvider;
import edu.kit.aifb.eorg.distbench.model.enums.DatacenterLocation;
import edu.kit.aifb.eorg.distbench.model.impl.Datacenter;
import edu.kit.aifb.eorg.distbench.model.impl.DatacenterSwitch;
import edu.kit.aifb.eorg.distbench.model.impl.DeploymentEnvironment;
import edu.kit.aifb.eorg.distbench.model.impl.NetworkHandler;
import edu.kit.aifb.eorg.distbench.model.impl.VMachine;
import edu.kit.aifb.eorg.distbench.model.impl.VVolume;
import edu.kit.aifb.eorg.distbench.provisioning.ProvisioningStrategy;

public class FourNodeDeploymentCreator implements DeploymentEnvironmentCreator {

	private NetworkHandler networkHandler;
	private int numbServer;
	private int numbVolumesPerServer;
	private AvailabilityZone zone;
	
	public FourNodeDeploymentCreator() {
		this.zone = AvailabilityZone.PROFITBRICKS_GER_1;
		this.numbServer = 4;
		this.numbVolumesPerServer = 1;
		this.networkHandler = new NetworkHandler();
	}
	
	public FourNodeDeploymentCreator(AvailabilityZone zone, 
			int numbServer, int numbVolumesPerServer) {
		this.zone = zone;
		this.networkHandler = new NetworkHandler();
		this.numbServer = numbServer;
		this.numbVolumesPerServer = numbVolumesPerServer;
	}
	
	@Override
	public DeploymentEnvironment createDeployment() {
		DeploymentEnvironment result = new DeploymentEnvironment();
		Datacenter dc = new Datacenter(CloudProvider.PROFITBRICKS);
		
		result.addDataCenter(dc);

		List<UUID> vmList = new ArrayList<>();
		
		// Create servers with volumes and network links
		for(int i = 0; i < numbServer; i++) {
			VMachine vm = new VMachine(dc);
			vm.setCores(1);
			vm.setRam(1);
			vm.setZone(zone);
			for(int j = 0; j < numbVolumesPerServer; j++) {
				VVolume vv = new VVolume(dc);
				vv.setStorageSize(10);
				networkHandler.createVLink(vm, vv);
			}
			dc.addVMachine(vm);
			vmList.add(vm.getId());
			networkHandler.createVLink(vm, dc.getDatacenterSwitch());
		}
		for(UUID id1 : vmList) {
			for(UUID id2 : vmList) {
				try{
					networkHandler.createVLink(dc.getVMachine(id1), dc.getVMachine(id2));
				}
				catch(IllegalArgumentException e) {
					System.out.println("Reflexive VLink connection!");
				}
			}
		}		
		return result;
	}

}
