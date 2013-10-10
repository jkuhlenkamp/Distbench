package edu.kit.aifb.eorg.distbench.model.impl;

import edu.kit.aifb.eorg.distbench.model.NetworkedEntity;

public class VNetworkLink extends VLink {

	private NetworkedEntity endTarget;
	private String lanId;

	public String getLanId() {
		return lanId;
	}

	public void setLanId(String lanId) {
		this.lanId = lanId;
	}

	public VNetworkLink(VMachine end1, VMachine end2) {
		super(end1);
		setTargetEnd(end2);
	}
	
	public VNetworkLink(VMachine end1, DatacenterSwitch end2) {
		super(end1);
		setTargetEnd(end2);
	}
	
	public NetworkedEntity getTargetEnd() {
		return endTarget;
	}
	public void setTargetEnd(VMachine targetEnd) {
		this.endTarget = targetEnd;
	}
	public void setTargetEnd(DatacenterSwitch targetEnd) {
		this.endTarget = targetEnd;
	}
	@Override
	void setEnd2(NetworkedEntity end2) {
		if( end2 instanceof VMachine ) {
			setTargetEnd( (VMachine) end2 );
		}
		else {
			if( end2 instanceof DatacenterSwitch ) {
				setTargetEnd( (DatacenterSwitch) end2);
			}
			else {
				throw new IllegalArgumentException("A NetworkLink must connect" +
						"a VMachine on end1 with a DatacenterSwitch or another" +
						"VMachine on end2!");
			}
		}
	}
	
	boolean hasDatacenterSwitch() {
		if( endTarget instanceof DatacenterSwitch ) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "VNetworkLink [uuid=" +super.getName()+ ", end2=" + endTarget + "]";
	}

}
