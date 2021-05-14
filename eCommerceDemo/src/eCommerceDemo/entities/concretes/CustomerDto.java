package eCommerceDemo.entities.concretes;

import eCommerceDemo.entities.abstracts.Dto;

public class CustomerDto implements Dto{

	private String email;
	private String password;

	public CustomerDto() {

	}

	public CustomerDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}