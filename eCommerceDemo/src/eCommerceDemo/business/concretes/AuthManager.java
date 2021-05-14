package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthService;
import eCommerceDemo.business.abstracts.CustomerService;
import eCommerceDemo.core.Regex;
import eCommerceDemo.entities.concretes.Customer;
import eCommerceDemo.entities.concretes.CustomerDto;

public class AuthManager implements AuthService {

	private CustomerService customerService;

	public AuthManager(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@Override
	public void register(Customer customer) {
		if (customerCheckIfNull(customer) && customerExists(customer.geteMail())
				&& checkIfPassword(customer.getPassword()) && Regex.emailValidate(customer.geteMail())) {
			customerService.add(customer);
		} else {
			System.out.println("Registered is failed.");
		}

	}

	@Override
	public void login(CustomerDto customerDto) {
		Customer customer = customerService.getByMail(customerDto.getEmail());

		if (customer != null && customer.getPassword().equals(customerDto.getPassword())
				&& loginNullControl(customerDto)) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login is failed");
		}

	}

	@Override
	public boolean customerExists(String email) {
		if (customerService.getByMail(email) != null) {
			System.out.println("User already exist");
			return false;
		}
		return true;

	}

	public boolean checkIfPassword(String password) {
		if (password.length() < 6) {

			System.out.println("Password must be equals or grater than 6 ");
			return false;
		}

		return true;
	}

	public boolean customerCheckIfNull(Customer customer) {
		if (customer != null && !customer.getFirstName().isEmpty() && !customer.getLastName().isEmpty()
				&& !customer.geteMail().isEmpty() && !customer.getPassword().isEmpty()) {
			return true;
		}
		System.out.println("These fields cannot be blank");
		return false;
	}

	public boolean loginNullControl(CustomerDto customerDto) {
		if (!customerDto.getEmail().isEmpty() && !customerDto.getPassword().isEmpty()) {
			return true;
		}
		System.out.println("These fields cannot be blank");
		return false;
	}
}
