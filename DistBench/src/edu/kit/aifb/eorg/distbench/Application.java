package edu.kit.aifb.eorg.distbench;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.apache.axis.AxisFault;

import com.profitbricks.api.ws.DataCenterIdentifier;
import com.profitbricks.api.ws.ProfitbricksApiService;
import com.profitbricks.api.ws.ProfitbricksApiServiceLocator;
import com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub;
import com.profitbricks.api.ws.ProfitbricksServiceFault;
import com.profitbricks.api.ws.Region;

public class Application {

	private static final String DISTBENCH_DATACENTER = "distbenchDatacenter";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ProfitbricksApiService pbApiService = new ProfitbricksApiServiceLocator();
		try {
			ProfitbricksApiServicePortBindingStub stub = new ProfitbricksApiServicePortBindingStub(
					new URL("https://api.profitbricks.com/1.2"), pbApiService);
			stub.setUsername("joern.kuhlenkamp@kit.edu");
			stub.setPassword("distbench");

			Map<String, String> datacenterMap = createDatacenterMap(stub);

			if (!datacenterMap.containsKey(DISTBENCH_DATACENTER)) {
				stub.createDataCenter(DISTBENCH_DATACENTER, Region.EUROPE);
			}
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	private static Map<String, String> createDatacenterMap(
			ProfitbricksApiServicePortBindingStub stub) throws RemoteException,
			ProfitbricksServiceFault {
		Map<String, String> datacenterMap = new HashMap<>();
		DataCenterIdentifier[] dataCenters = stub.getAllDataCenters();
		for (DataCenterIdentifier dataCenterIdentifier : dataCenters) {
			String dataCenterId = dataCenterIdentifier.getDataCenterId();
			String dataCenterName = dataCenterIdentifier.getDataCenterName();
			datacenterMap.put(dataCenterName, dataCenterId);
			System.out.print(dataCenterId);
			System.out.println(" > " + dataCenterName);
		}
		return datacenterMap;
	}

}
