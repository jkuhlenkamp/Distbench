package edu.kit.aifb.eorg.distbench;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import com.profitbricks.api.ws.DataCenter;
import com.profitbricks.api.ws.Nic;
import com.profitbricks.api.ws.ProfitbricksApiService;
import com.profitbricks.api.ws.ProfitbricksApiServiceLocator;
import com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub;
import com.profitbricks.api.ws.Server;
import com.profitbricks.api.ws.Storage;

import edu.kit.aifb.eorg.distbench.pb.ProfitBricksApi;

public class Application {

	private static final String HTTPS_API_PROFITBRICKS_COM_1_2 = "https://api.profitbricks.com/1.2";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ProfitbricksApiService pbApiService = new ProfitbricksApiServiceLocator();
		try {
			ProfitbricksApiServicePortBindingStub stub = new ProfitbricksApiServicePortBindingStub(new URL(HTTPS_API_PROFITBRICKS_COM_1_2), pbApiService);
			stub.setUsername("joern.kuhlenkamp@kit.edu");
			stub.setPassword("distbench");
			ProfitBricksApi profitBricksApi = new ProfitBricksApi(stub);
			DataCenter datacenter = profitBricksApi.createDatacenter("distbenchDatacenter");
			System.out.println(datacenter.getDataCenterId() + " | " + datacenter.getDataCenterName());
			Server server = profitBricksApi.createServer(datacenter.getDataCenterId(), 1, 512);
			System.out.println("Server " + server.getServerId() + " in " + server.getDataCenterId());
			Storage storage = profitBricksApi.createStorage(datacenter.getDataCenterId(), "JoernsStorage", 1);
			System.out.println("Storage " + storage.getStorageId() + " with " + storage.getStorageName());
			Nic nic = profitBricksApi.createNic(server.getServerId(), 1, true);
			System.out.println("Nic " + nic.getNicId() + " | " + nic.getNicName());
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
