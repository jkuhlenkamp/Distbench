package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import edu.kit.aifb.eorg.distbench.model.MultiNetworkedEntity;
import edu.kit.aifb.eorg.distbench.model.NetworkedEntity;
import edu.kit.aifb.eorg.distbench.model.ZonedEntity;
import edu.kit.aifb.eorg.distbench.model.enums.AvailabilityZone;
import edu.kit.aifb.eorg.distbench.model.enums.OperatingSystem;

public class VMachine extends Entity implements MultiNetworkedEntity, ZonedEntity {

	private int cores;
	private int ram;
	private OperatingSystem os;
	private Map<UUID, VLink> vLinks;
	private AvailabilityZone zone;
	private final Datacenter datacenter;
	
	public Datacenter getDatacenter() {
		return datacenter;
	}

	public VMachine(Datacenter datacenter) {
		super();
		cores = 0;
		ram = 0;
		os = OperatingSystem.UBUNTU_13_04;
		vLinks = new HashMap<>();
		this.datacenter = datacenter;
	}
	
	public OperatingSystem getOs() {
		return os;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}

	public int getCores() {
		return cores;
	}

	public void setCores(int cores) {
		this.cores = cores;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public AvailabilityZone getZone() {
		return zone;
	}
	@Override
	public void setZone(AvailabilityZone zone) {
		this.zone = zone;
	}

	@Override
	public VLink getVLink(UUID id) {
		if( vLinks.containsKey(id) ) {
			return vLinks.get(id);
		}
		else {
			throw new IllegalArgumentException("This VMachine has no " +
					"registered VLink object with id: " +id);
		}
	}
	
	public List<VLink> getAllVLinks() {
		List<VLink> vlinkList = new ArrayList<>(vLinks.values());
		return vlinkList;
	}
	
	public List<VVolume> getAllVVolumes() {
		List<VVolume> vvolumeList = new ArrayList<>();
		for ( VLink vlink: vLinks.values()) {
			NetworkedEntity end2 = vlink.getEnd2();
			if(end2 instanceof VVolume && !(vvolumeList.contains(end2)) ) {
				vvolumeList.add((VVolume) end2);
			}
		}
		return vvolumeList;
	}
	
	@Override
	public void addVLink(VLink vLink) {
		if( !vLinks.containsKey(vLink.getId()) ) {
			vLinks.put(vLink.getId(), vLink);
		}
		else {
			if( vLinks.get(vLink.getId()).equals(vLink) ) {
				throw new IllegalArgumentException("Another VLink is allready" +
						"registered on this VMachine under the same id: " +vLink.getId());
			}
		}
	}

	@Override
	public void removeVLink(VLink vLink) {
		vLinks.remove(vLink);
	}

	@Override
	public String toString() {
		return "VMachine [uuid=" + getId() + ", cores=" + cores + ", ram=" + ram + ", os=" + os
				+ ", vLinks=" + vLinks + ", zone=" + zone + ", datacenter="
				+ datacenter + "]";
	}
	
}
