package edu.kit.aifb.eorg.distbench.model.impl;

import edu.kit.aifb.eorg.distbench.model.NetworkedEntity;

public class VStorageLink extends VLink {

	private VVolume end2;
	
	public VStorageLink(VMachine end1, VVolume end2) {
		super(end1);
		setEnd2(end2);
	}
	
	@Override
	NetworkedEntity getEnd2() {
		return end2;
	}
	@Override
	void setEnd2(NetworkedEntity end2) {
		if( end2 instanceof VVolume ) {
			this.end2 = (VVolume) end2;
		}
		else {
			throw new IllegalArgumentException("A VStorageLink must connect a VMachine" +
					"with a VVolume.");
		}
	}
	void setEnd2( VVolume end2 ) {
		this.end2 = end2;
	}

	@Override
	public String toString() {
		return "VStorageLink [end2=" + end2 + "]";
	}
	
}
