package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DeploymentEnvironment extends Entity {

	Map<UUID, Datacenter> datacenters;
	
	public DeploymentEnvironment() {
		datacenters = new HashMap<>();
	}
	
	public Datacenter getDataCenter(UUID id) {
		if( datacenters.containsKey(id) ) {
			return datacenters.get(id);
		}
		else {
			throw new IllegalArgumentException("This DeploymentEnvironment " +
						"does not contain a Datacenter with id: " +id);
		}
	}
	
	public void addDataCenter(Datacenter dc) {
		if(datacenters.containsKey(dc.getId())) {
			if( !dc.equals(datacenters.get(dc.getId())) ) {
				throw new IllegalArgumentException("This datatercenter" +
						"contains another datacenter object with id: " +dc.getId());
			}
		}
		else {
			datacenters.put(dc.getId(), dc);
		}
	}
	
	public void removeDataCenter(UUID id) {
		if( datacenters.containsKey(id) ) {
			datacenters.remove(id);
		}
	}
	
	public List<Datacenter> getAllDatacenters() {
		List<Datacenter> datacenterList = new ArrayList<>(datacenters.values());
		return datacenterList;
	}
	
}
