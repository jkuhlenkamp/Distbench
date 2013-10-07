package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.UUID;

import edu.kit.aifb.eorg.distbench.model.SingleNetworkedEntity;
import edu.kit.aifb.eorg.distbench.model.ZonedEntity;
import edu.kit.aifb.eorg.distbench.model.enums.AvailabilityZone;

public class VVolume extends Entity implements SingleNetworkedEntity, ZonedEntity {

	private int storageSize;
	private AvailabilityZone zone;
	private VLink vLink;
	
	public VVolume() {
		super();
		storageSize = 0;
	}
	
	int getStorageSize() {
		return storageSize;
	}
	void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	
	public AvailabilityZone getAvailabilityZone() {
		return zone;
	}
	public void setAvailabilityZone(AvailabilityZone zone) {
		this.zone = zone;
	}
	@Override
	public VLink getVLink(UUID id) {
		if( vLink.getId().equals(id) ) {
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
	
}
