package edu.kit.aifb.eorg.distbench.model.enums;

public enum AvailabilityZone {
	
	PROFITBRICKS_US_1(CloudProvider.PROFITBRICKS, DatacenterLocation.USA, 1),
	PROFITBRICKS_US_2(CloudProvider.PROFITBRICKS, DatacenterLocation.USA, 2),
	PROFITBRICKS_US_3(CloudProvider.PROFITBRICKS, DatacenterLocation.USA, 3),
	PROFITBRICKS_GER_1(CloudProvider.PROFITBRICKS, DatacenterLocation.GERMANY, 1),
	PROFITBRICKS_GER_2(CloudProvider.PROFITBRICKS, DatacenterLocation.GERMANY, 2);
	
	private final CloudProvider provider;
	private final DatacenterLocation location;
	private final int zoneNumber;
	
	private AvailabilityZone(CloudProvider provider, 
			DatacenterLocation location, int zone) {
		this.provider = provider;
		this.location = location;
		this.zoneNumber = zone;
	}
	
	CloudProvider getProvider() {
		return provider;
	}
	
	DatacenterLocation getLocation() {
		return location;
	}
	
	int getZone() {
		return zoneNumber;
	}
}
