package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import edu.kit.aifb.eorg.distbench.model.enums.CloudProvider;

public class Datacenter extends Entity {

	private final CloudProvider provider;
	private final DatacenterSwitch dcSwitch;
	private Map<UUID, VMachine> vMachines;
	private Map<UUID, VVolume> vVolumes;
	
	public Datacenter(CloudProvider provider) {
		super();
		this.provider = provider;
		this.dcSwitch = new DatacenterSwitch();
		vMachines = new HashMap<>();
		vVolumes = new HashMap<>();
	}
	
	public CloudProvider getProvider() {
		return provider;
	}

	public DatacenterSwitch getDatacenterSwitch() {
		return dcSwitch;
	}

	public VMachine getVMachine(UUID id) {
		if(vMachines.containsKey(id)) {
			return vMachines.get(id);
		}
		else {
			throw new IllegalArgumentException("This datacenter" +
						"does not contain a VMachine objet with the id: " +id);
		}
	}
	
	public int getVMachineNumb() {
		return vMachines.size();
	}

	public void addVMachine(VMachine vm) {
		if(vMachines.containsKey(vm.getId())) {
			if( !vm.equals(vMachines.get(vm.getId())) ) {
				throw new IllegalArgumentException("This datacenter" +
						"contains another VMachine object with id: " +vm.getId());
			}
		}
		else {
			vMachines.put(vm.getId(), vm);
		}
	}

	public void removeVMachine(UUID id) {
		if(vMachines.containsKey(id)) {
			vMachines.remove(id);
		}
	}

	public VVolume getVVolume(UUID id) {
		if(vVolumes.containsKey(id)) {
			return vVolumes.get(id);
		}
		else {
			throw new IllegalArgumentException("This datacenter" +
						"does not contain a VVolume object with the id: " +id);
		}
	}
	
	public int getVVolumeNumb() {
		return vVolumes.size();
	}

	public void addVVolume(VVolume vv) {
		if(vVolumes.containsKey(vv.getId())) {
			if( !vv.equals(vVolumes.get(vv.getId())) ) {
				throw new IllegalArgumentException("This datacenter" +
						"contains another VVolume object with id: " +vv.getId());
			}
		}
		else {
			vVolumes.put(vv.getId(), vv);
		}
	}

	public void removeVVolume(UUID id) {
		if( vVolumes.containsKey(id) ) {
			vVolumes.remove(id);
		}
	}
	
	public List<VMachine> getAllVMachines() {
		List<VMachine> vMachineList = new ArrayList<>(vMachines.values());
		return vMachineList;
	}

	@Override
	public String toString() {
		return "Datacenter [uuid=" + getId() + ", provider=" + provider + ", dcSwitch=" + dcSwitch
				+ ", vMachines=" + vMachines + ", vVolumes=" + vVolumes + "]";
	}

}
