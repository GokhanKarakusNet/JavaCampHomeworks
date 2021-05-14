package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.Customer;
import eCommerceDemo.entities.concretes.CustomerDto;

public interface AuthService {
	void register(Customer customer);

	void login(CustomerDto customerDto);

	boolean customerExists(String email);
}
