package edu.kit.aifb.eorg.distbench.model.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.kit.aifb.eorg.distbench.model.enums.CloudProvider;

public class DatacenterTest {

	Datacenter dc;
	
	@Before
	public void setUp() throws Exception {
		CloudProvider provider = CloudProvider.PROFITBRICKS;
		dc = new Datacenter(provider);
	}

	@Test
	public void testDatacenter() {
		assertNotNull(dc);
		assertEquals("Expected Cloud provider: PROFITBRICKS!", CloudProvider.PROFITBRICKS, dc.getProvider());
		assertNotNull("UUID for Entity must not be null!", dc.getId());
		assertNotNull("DatacenterSwitch must not be null!", dc.getDatacenterSwitch());
		assertEquals("Expected number of VMachines in datacenter: 0!", 0, dc.getVMachineNumb());
		assertEquals("Expected number of VVolumes in datacenter: 0!", 0, dc.getVVolumeNumb());
	}

	@Test
	public void testAddVMachine() {
		VMachine vm1 = new VMachine();
		VMachine vm2 = new VMachine();
		
		dc.addVMachine(vm1);
		assertEquals("Expected VMachine for UUID=" +vm1.getId()+ ":" +vm1, vm1, dc.getVMachine(vm1.getId()));		
		dc.addVMachine(vm2);
		assertEquals("Expected VMachine for UUID=" +vm1.getId()+ ":" +vm1, vm1, dc.getVMachine(vm1.getId()));
		assertEquals("Expected VMachine for UUID=" +vm2.getId()+ ":" +vm2, vm2, dc.getVMachine(vm2.getId()));
		dc.addVMachine(vm2);
		dc.addVMachine(vm1);
		assertEquals("Expected VMachine for UUID=" +vm1.getId()+ ":" +vm1, vm1, dc.getVMachine(vm1.getId()));
		assertEquals("Expected VMachine for UUID=" +vm2.getId()+ ":" +vm2, vm2, dc.getVMachine(vm2.getId()));
	}

	@Test
	public void testRemoveVMachine() {
		VMachine vm1 = new VMachine();
		VMachine vm2 = new VMachine();
		VMachine vm3 = new VMachine();
		
		dc.addVMachine(vm1);
		dc.addVMachine(vm2);
		dc.addVMachine(vm3);
		
		assertEquals("Expected number of VMachines in datacenter: 3!", dc.getVMachineNumb(), 3);
		assertEquals("Expected VMachine for UUID=" +vm1.getId()+ ":" +vm1, dc.getVMachine(vm1.getId()), vm1);
		assertEquals("Expected VMachine for UUID=" +vm2.getId()+ ":" +vm2, dc.getVMachine(vm2.getId()), vm2);
		assertEquals("Expected VMachine for UUID=" +vm3.getId()+ ":" +vm3, dc.getVMachine(vm3.getId()), vm3);
		
		dc.removeVMachine(vm1.getId());
		assertEquals("Expected number of VMachines in datacenter: 2!", dc.getVMachineNumb(), 2);
		//assertNotEquals("Expected VMachine for UUID=" +vm1.getId()+ ":" +vm1, dc.getVMachine(vm1.getId()), vm1);
		
		dc.removeVMachine(vm2.getId());
		dc.removeVMachine(vm3.getId());
		assertEquals("Expected number of VMachines in datacenter: 0!", dc.getVMachineNumb(), 0);
	}


	@Test
	public void testAddVVolume() {
		VVolume vv1 = new VVolume();
		VVolume vv2 = new VVolume();
		
		dc.addVVolume(vv1);
		assertEquals("Expected VVolume for UUID=" +vv1.getId()+ ":" +vv1, vv1, dc.getVVolume(vv1.getId()));		
		dc.addVVolume(vv2);
		assertEquals("Expected VVolume for UUID=" +vv1.getId()+ ":" +vv1, vv1, dc.getVVolume(vv1.getId()));
		assertEquals("Expected VVolume for UUID=" +vv2.getId()+ ":" +vv2, vv2, dc.getVVolume(vv2.getId()));
		dc.addVVolume(vv1);
		dc.addVVolume(vv2);
		assertEquals("Expected VVolume for UUID=" +vv1.getId()+ ":" +vv1, vv1, dc.getVVolume(vv1.getId()));
		assertEquals("Expected VVolume for UUID=" +vv2.getId()+ ":" +vv2, vv2, dc.getVVolume(vv2.getId()));
	}

	@Test
	public void testRemoveVVolume() {
		VVolume vv1 = new VVolume();
		VVolume vv2 = new VVolume();
		VVolume vv3 = new VVolume();
		
		dc.addVVolume(vv1);
		dc.addVVolume(vv2);
		dc.addVVolume(vv3);

		assertEquals("Expected number of VVolumes in datacenter: 3!", 3, dc.getVVolumeNumb());
		dc.removeVVolume(vv3.getId());
		assertEquals("Expected number of VVolumes in datacenter: 2!", 2, dc.getVVolumeNumb());
		assertEquals("Expected VVolume for UUID=" +vv1.getId()+ ":" +vv1, dc.getVVolume(vv1.getId()), vv1);
		assertEquals("Expected VVolume for UUID=" +vv2.getId()+ ":" +vv2, dc.getVVolume(vv2.getId()), vv2);
		dc.removeVVolume(vv1.getId());
		assertEquals("Expected number of VVolumes in datacenter: 1!", 1, dc.getVVolumeNumb());
		assertEquals("Expected VVolume for UUID=" +vv2.getId()+ ":" +vv2, dc.getVVolume(vv2.getId()), vv2);
		dc.removeVVolume(vv2.getId());
		assertEquals("Expected number of VVolumes in datacenter: 0!", 0, dc.getVVolumeNumb());
	}

}
