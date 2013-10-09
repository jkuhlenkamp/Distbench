package edu.kit.aifb.eorg.distbench.model.impl;

import edu.kit.aifb.eorg.distbench.model.NetworkedEntity;

public class VNetworkLink extends VLink {

	private NetworkedEntity end2;

	public VNetworkLink(VMachine end1, VMachine end2) {
		super(end1);
		setEnd2(end2);
	}
	
	public VNetworkLink(VMachine end1, DatacenterSwitch end2) {
		super(end1);
		setEnd2(end2);
	}
	
	public NetworkedEntity getEnd2() {
		return end2;
	}
	public void setEnd2(VMachine end2) {
		this.end2 = end2;
	}
	public void setEnd2(DatacenterSwitch end2) {
		this.end2 = end2;
	}
	@Override
	void setEnd2(NetworkedEntity end2) {
		if( end2 instanceof VMachine ) {
			setEnd2( (VMachine) end2 );
		}
		else {
			if( end2 instanceof DatacenterSwitch ) {
				setEnd2( (DatacenterSwitch) end2);
			}
			else {
				throw new IllegalArgumentException("A NetworkLink must connect" +
						"a VMachine on end1 with a DatacenterSwitch or another" +
						"VMachine on end2!");
			}
		}
	}
	
	boolean hasDatacenterSwitch() {
		if( end2 instanceof DatacenterSwitch ) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "VNetworkLink [end2=" + end2 + "]";
	}

}
