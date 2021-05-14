package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.CustomerDao;
import eCommerceDemo.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

private List<Customer> customers=new ArrayList<Customer>();
	
	public HibernateCustomerDao() {
		Customer customer1=new Customer(1,"Gökhan","Karakuþ","gokhan@gmail.com","123456");
		Customer customer2=new Customer(2,"Engin","Demirog","engin@gmail.com","987654");
		
		customers.add(customer1);
		customers.add(customer2);
	}
	
	@Override
	public void add(Customer customer) {
		customers.add(customer);
		System.out.println("Tebrikler "+customer.getFirstName()+" sisteme baþarýyla üye oldunuz.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Güncellendi : "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		customers.remove(customer);
		System.out.println("Silindi : "+customer.getFirstName());
		
	}

	@Override
	public Customer getByEmail(String email) {
		for (Customer customer:customers) {
			if(customer.geteMail()==email)
				return customer;
		} 
		return null;
	}

	@Override
	public List<Customer> getAll() {
		
		return customers;
	}

	@Override
	public Customer getByEmailandPassword(String email, String password) {
		for (Customer customer : customers) {
			if (customer.geteMail()==email&&customer.getPassword()==password) {
				return customer;
			}
		}
		return null;
	}

}
