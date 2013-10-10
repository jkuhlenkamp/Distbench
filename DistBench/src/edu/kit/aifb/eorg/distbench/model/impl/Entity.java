package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.UUID;

public abstract class Entity {

	private final UUID name;
	private String providersidedEntityId;
	
	public String getProvidersidedEntityId() {
		return providersidedEntityId;
	}

	public void setProvidersidedEntityId(String providersidedEntityId) {
		this.providersidedEntityId = providersidedEntityId;
	}

	public Entity() {
		this.name = UUID.randomUUID();
	}
	
	public UUID getName() {
		return name;
	}

}
