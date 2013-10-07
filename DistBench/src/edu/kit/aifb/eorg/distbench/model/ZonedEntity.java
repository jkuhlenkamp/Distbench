package edu.kit.aifb.eorg.distbench.model;

import edu.kit.aifb.eorg.distbench.model.enums.AvailabilityZone;

public interface ZonedEntity {

	AvailabilityZone getZone();
	void setZone(AvailabilityZone zone);
}
