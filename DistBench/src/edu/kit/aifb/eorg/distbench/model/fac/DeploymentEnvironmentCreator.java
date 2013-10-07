package edu.kit.aifb.eorg.distbench.model.fac;

import edu.kit.aifb.eorg.distbench.model.impl.DeploymentEnvironment;

public interface DeploymentEnvironmentCreator {
	
	abstract DeploymentEnvironment createDeployment();

}
