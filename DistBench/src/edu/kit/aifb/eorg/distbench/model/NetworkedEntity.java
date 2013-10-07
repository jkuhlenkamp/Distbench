package edu.kit.aifb.eorg.distbench.model;

import java.util.UUID;

import edu.kit.aifb.eorg.distbench.model.impl.VLink;

public interface NetworkedEntity {

	VLink getVLink(UUID id);
	
}
