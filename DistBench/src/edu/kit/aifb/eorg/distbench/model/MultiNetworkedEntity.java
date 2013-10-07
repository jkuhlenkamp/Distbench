package edu.kit.aifb.eorg.distbench.model;

import edu.kit.aifb.eorg.distbench.model.impl.VLink;

public interface MultiNetworkedEntity extends NetworkedEntity {

	void addVLink(VLink vLink);
	void removeVLink(VLink vLink);
	
}
