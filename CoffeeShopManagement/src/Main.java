
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Gökhan", "Karakuþ", 1234 , "123456789"));
	}

}
