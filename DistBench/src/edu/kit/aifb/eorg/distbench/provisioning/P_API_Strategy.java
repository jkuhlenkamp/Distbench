package edu.kit.aifb.eorg.distbench.provisioning;

import edu.kit.aifb.eorg.distbench.model.impl.Datacenter;
import edu.kit.aifb.eorg.distbench.model.impl.VLink;
import edu.kit.aifb.eorg.distbench.model.impl.VMachine;
import edu.kit.aifb.eorg.distbench.model.impl.VVolume;

public interface P_API_Strategy {

	Datacenter createDatacenter(Datacenter dc);
	VMachine createVMachine(VMachine vm);
	VVolume createVVolume(VVolume vv);
	VLink createVLink(VLink vl);
	
}
