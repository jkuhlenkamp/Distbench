package edu.kit.aifb.eorg.distbench.model.impl;

import edu.kit.aifb.eorg.distbench.model.NetworkedEntity;

public abstract class VLink extends Entity {

	private VMachine sourceEnd;
	
	public VLink(VMachine sourceEnd) {
		super();
		setSourceEnd(sourceEnd);
	}
	
	public VMachine getSourceEnd() {
		return sourceEnd;
	}
	public void setSourceEnd(VMachine sourceEnd) {
		this.sourceEnd = sourceEnd;
	}
	
	abstract NetworkedEntity getTargetEnd();

	abstract void setEnd2(NetworkedEntity targetEnd);

	@Override
	public String toString() {
		return "VLink [uuid=" + getName() + ", end1=" + sourceEnd + "]";
	}
	
}