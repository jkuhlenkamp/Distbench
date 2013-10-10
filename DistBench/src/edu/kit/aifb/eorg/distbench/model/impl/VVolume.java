package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.UUID;

import edu.kit.aifb.eorg.distbench.model.SingleNetworkedEntity;
import edu.kit.aifb.eorg.distbench.model.ZonedEntity;
import edu.kit.aifb.eorg.distbench.model.enums.AvailabilityZone;

public class VVolume extends Entity implements SingleNetworkedEntity, ZonedEntity {

	private int storageSize;
	private AvailabilityZone zone;
	private VLink vLink;
	private final Datacenter datacenter;
	
	public VLink getvLink() {
		return vLink;
	}

	public VVolume(Datacenter datacenter) {
		super();
		this.datacenter = datacenter;
		storageSize = 0;
	}
	
	public int getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	
	@Override
	public VLink getVLink(UUID id) {
		if( vLink.getName().equals(id) ) {
			return vLink;
		}
		else {
			throw new IllegalArgumentException("This VVolume is not connected by " +
					"a VLink with id: " +id);
		}
	}
	public void setVLink(VLink vLink) {
		this.vLink = vLink;
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
	public VLink getVLink() {
		return vLink;
	}

	public Datacenter getDatacenter() {
		return this.datacenter;
	}

	@Override
	public String toString() {
		return "VVolume [getId()=" + getName() + "]";
	}

}
