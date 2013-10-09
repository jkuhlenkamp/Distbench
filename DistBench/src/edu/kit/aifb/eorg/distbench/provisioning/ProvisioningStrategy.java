package edu.kit.aifb.eorg.distbench.provisioning;

import edu.kit.aifb.eorg.distbench.model.impl.Datacenter;
import edu.kit.aifb.eorg.distbench.model.impl.VLink;
import edu.kit.aifb.eorg.distbench.model.impl.VMachine;
import edu.kit.aifb.eorg.distbench.model.impl.VVolume;

public interface ProvisioningStrategy {

	public Datacenter createDatacenter(Datacenter dc);
	public VMachine createVMachine(VMachine vm);
	public VVolume createVVolume(VVolume vv);
	public VLink createVLink(VLink vl);
	public void connectVVolumeToVMachine(VVolume vVolume, VMachine vMachine);
	
}
