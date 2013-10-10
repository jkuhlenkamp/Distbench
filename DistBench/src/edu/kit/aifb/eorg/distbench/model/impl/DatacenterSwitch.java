package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.UUID;

import edu.kit.aifb.eorg.distbench.model.SingleNetworkedEntity;

public class DatacenterSwitch extends Entity implements SingleNetworkedEntity {

	private VLink vLink;
	
	public DatacenterSwitch() {
		super();
	}

	@Override
	public VLink getVLink(UUID id) {
		if( id.equals(vLink.getName()) ) {
			return vLink;
		}
		else {
			throw new IllegalArgumentException("This DatacenterSwitch is connected by " +
					"a VLink with another id than: " +id);
		}
	}

	@Override
	public VLink getVLink() {
		return vLink;
	}

	@Override
	public void setVLink(VLink vLink) {
		this.vLink = vLink;
	}


}
