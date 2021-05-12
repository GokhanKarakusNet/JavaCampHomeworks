package Adapters;

import java.rmi.RemoteException;
import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();    
	    boolean result = false;
	    
		try 
		{
			result = kpsPublicSoapProxy.TCKimlikNoDogrula
					(
					Long.parseLong(customer.getNationalityId()) , 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth()
					);
		} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}

		return result;
	}

}
