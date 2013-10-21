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
			vm.setCores(2);
			vm.setRam(8);
			vm.setZone(zone);
			for(int j = 0; j < numbVolumesPerServer; j++) {
				VVolume vv = new VVolume(dc);
				vv.setStorageSize(80);
				// Set first volume as mountId
				if( j == 0 ) {
					vm.setMountId(vv.getName().toString());
				}
				networkHandler.createVLink(vm, vv);
			}
			dc.addVMachine(vm);
			vmList.add(vm.getName());
			networkHandler.createVLink(vm, dc.getDatacenterSwitch());
		}
		// Create array to store created links
		boolean[][] hasLinkMatrix = new boolean[vmList.size()][vmList.size()];
		for( int i = 0; i < vmList.size(); i++ ) {
			for( int j = 0; j < vmList.size(); j++ ) {
				if( i == j ) {
					hasLinkMatrix[i][j] = true;
				}
				else {
					hasLinkMatrix[i][j] = false;
				}
			}
		}
		// Connect all VMachines with each other
		for( int i = 0; i < vmList.size(); i++ ) {
			for( int j = 0; j < vmList.size(); j++ ) {
				if(hasLinkMatrix[i][j] == false 
						&& hasLinkMatrix[j][i] == false) {
					UUID id1 = vmList.get(i);
					UUID id2 = vmList.get(j);
					try{
						networkHandler.createVLink(dc.getVMachine(id1), dc.getVMachine(id2));
					}
					catch(IllegalArgumentException e) {
						e.printStackTrace();
					}
					hasLinkMatrix[i][j] = true;
					hasLinkMatrix[j][i] = true;
				}
			}
		}
		/*
		for(UUID id1 : vmList) {
			for(UUID id2 : vmList) {
				try{
					networkHandler.createVLink(dc.getVMachine(id1), dc.getVMachine(id2));
				}
				catch(IllegalArgumentException e) {
					e.printStackTrace();
				}
			}
		}
		*/	
		return result;
	}

}
