package eCommerceDemo.business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	Customer getByMail(String email);
	List<Customer> getAll();
}
