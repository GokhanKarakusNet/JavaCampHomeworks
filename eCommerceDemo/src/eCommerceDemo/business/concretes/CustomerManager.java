package eCommerceDemo.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.CustomerService;
import eCommerceDemo.core.GoogleEmailService;
import eCommerceDemo.core.Regex;
import eCommerceDemo.dataAccess.abstracts.CustomerDao;
import eCommerceDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private GoogleEmailService googleEmailService;

	public CustomerManager(CustomerDao customerDao, GoogleEmailService googleEmailService) {
		this.customerDao = customerDao;
		this.googleEmailService = googleEmailService;
	}

	@Override
	public void add(Customer customer) {
		var result = checkNameLenght(customer);
		var mail=getByMail(customer.geteMail());
		if (result != false 
				&&mail==null
				&&Regex.emailValidate(customer.geteMail())) {
			customerDao.add(customer);
			googleEmailService.send(customer.geteMail(), "Added");
		} else {
			System.out.println("Try again");
		}

	}

	@Override
	public Customer getByMail(String email) {
		return customerDao.getByEmail(email);
	}

	private boolean checkNameLenght(Customer customer) {
		if (customer.getFirstName().length() >= 2 && customer.getLastName().length() >= 2) {
			return true;
		}
		System.out.println("Ad ve soyad en az iki karakterden oluþmalýdýr.");
		return false;
	}

	@Override
	public List<Customer> getAll() {
		for (Customer customer : customerDao.getAll()) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
		return customerDao.getAll();
	}
	
	

}
