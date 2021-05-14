package eCommerceDemo.core;

import eCommerceDemo.entities.concretes.CustomerDto;

public interface GoogleAuthService {

	void register(String email);

	void login(CustomerDto customerDto);

	void customerExists(String email);

}