package edu.kit.aifb.eorg.distbench.model.impl;

import edu.kit.aifb.eorg.distbench.model.NetworkedEntity;

public abstract class VLink extends Entity {

	private VMachine end1;
	
	public VLink(VMachine end1) {
		super();
		setEnd1(end1);
	}
	
	public VMachine getEnd1() {
		return end1;
	}
	public void setEnd1(VMachine end1) {
		this.end1 = end1;
	}
	
	abstract NetworkedEntity getEnd2();

	abstract void setEnd2(NetworkedEntity end2);

	@Override
	public String toString() {
		return "VLink [uuid=" + getId() + ", end1=" + end1 + "]";
	}
	
}