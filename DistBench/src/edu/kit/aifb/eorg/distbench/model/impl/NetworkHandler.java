package edu.kit.aifb.eorg.distbench.model.impl;

import edu.kit.aifb.eorg.distbench.model.MultiNetworkedEntity;
import edu.kit.aifb.eorg.distbench.model.SingleNetworkedEntity;


public class NetworkHandler {
	
	private void addVlinkToEnds(MultiNetworkedEntity end1, SingleNetworkedEntity end2, VLink vLink) {
		end1.addVLink(vLink);
		end2.setVLink(vLink);
	}
	
	private void addVlinkToEnds(MultiNetworkedEntity end1, MultiNetworkedEntity end2, VLink vLink) {
		end1.addVLink(vLink);
		end2.addVLink(vLink);
	}
	
	public VLink createVLink(VMachine end1, VMachine end2) {
		if( !end1.getId().equals(end2.getId()) ) {
			VLink vLink = new VNetworkLink(end1, end2);
			addVlinkToEnds(end1, end2, vLink);
			return vLink;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public VLink createVLink(VMachine end1, VVolume end2) {
		VLink vLink = new VStorageLink(end1, end2);
		addVlinkToEnds(end1, end2, vLink);
		return vLink;
	}
	
	public VLink createVLink(VMachine end1, DatacenterSwitch end2) {
		VLink vLink = new VNetworkLink(end1, end2);
		addVlinkToEnds(end1, end2, vLink);
		return vLink;
	}
	
}
