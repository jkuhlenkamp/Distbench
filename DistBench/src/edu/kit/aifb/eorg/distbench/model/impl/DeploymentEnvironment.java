package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DeploymentEnvironment extends Entity {

	Map<UUID, Datacenter> datercenters;
	
	public DeploymentEnvironment() {
		datercenters = new HashMap<>();
	}
	
	public Datacenter getDataCenter(UUID id) {
		if( datercenters.containsKey(id) ) {
			return datercenters.get(id);
		}
		else {
			throw new IllegalArgumentException("This DeploymentEnvironment " +
						"does not contain a Datacenter with id: " +id);
		}
	}
	
	public void addDataCenter(Datacenter dc) {
		if(datercenters.containsKey(dc.getId())) {
			if( !dc.equals(datercenters.get(dc.getId())) ) {
				throw new IllegalArgumentException("This datatercenter" +
						"contains another datacenter object with id: " +dc.getId());
			}
		}
		else {
			datercenters.put(dc.getId(), dc);
		}
	}
	
	public void removeDataCenter(UUID id) {
		if( datercenters.containsKey(id) ) {
			datercenters.remove(id);
		}
	}
	
}
