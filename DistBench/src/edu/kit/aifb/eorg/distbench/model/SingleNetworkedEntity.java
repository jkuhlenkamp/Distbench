package edu.kit.aifb.eorg.distbench.model;

import edu.kit.aifb.eorg.distbench.model.impl.VLink;

public interface SingleNetworkedEntity extends NetworkedEntity {

	VLink getVLink ();
	void setVLink(VLink vLink);
	
}
