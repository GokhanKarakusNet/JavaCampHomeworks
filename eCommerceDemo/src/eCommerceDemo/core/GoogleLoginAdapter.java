package eCommerceDemo.core;

import eCommerceDemo.Google.GoogleLogin;

public class GoogleLoginAdapter implements GoogleEmailService {

	@Override
	public void send(String email, String message) {
		GoogleLogin googleLogin=new GoogleLogin();
		googleLogin.googleLogin(email, message);
		
	}

}
