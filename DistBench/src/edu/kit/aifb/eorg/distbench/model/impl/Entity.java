package edu.kit.aifb.eorg.distbench.model.impl;

import java.util.UUID;

public abstract class Entity {

	private final UUID id;
	
	public Entity() {
		this.id = UUID.randomUUID();
	}
	
	public UUID getId() {
		return id;
	}

}
