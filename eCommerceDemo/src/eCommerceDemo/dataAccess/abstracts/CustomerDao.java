package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.Customer;


public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer getByEmail(String email);
	List<Customer> getAll();
	Customer getByEmailandPassword(String email,String password);
}
