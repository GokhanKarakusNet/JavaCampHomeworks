package eCommerceDemo;

import eCommerceDemo.business.abstracts.AuthService;
import eCommerceDemo.business.abstracts.CustomerService;
import eCommerceDemo.business.concretes.AuthManager;
import eCommerceDemo.business.concretes.CustomerManager;
import eCommerceDemo.core.GoogleLoginAdapter;
import eCommerceDemo.dataAccess.concretes.HibernateCustomerDao;
import eCommerceDemo.entities.concretes.Customer;
import eCommerceDemo.entities.concretes.CustomerDto;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(), new GoogleLoginAdapter());
		Customer customer = new Customer(1, "Gökhan", "Karakuþ", "gokhan@gsmail.com", "123456");
		customerService.add(customer);

		AuthService authService = new AuthManager(new CustomerManager(new HibernateCustomerDao(), new GoogleLoginAdapter()));

		customerService.getAll();

		CustomerDto customerDto = new CustomerDto();
		customerDto.setEmail("gokhan@gmail.com");
		customerDto.setPassword("123456");

		authService.login(customerDto);

		CustomerDto customerDto2 = new CustomerDto();

		customerDto2.setEmail("test1@gmail.com");
		customerDto2.setPassword("132");
	}

}
