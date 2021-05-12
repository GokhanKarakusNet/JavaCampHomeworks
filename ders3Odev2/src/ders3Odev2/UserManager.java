package ders3Odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " " + user.lastName + " başarılı bir şekilde eklendi");
	}

	public void addMultiple(User[] users) {

		for (User user : users) {
			add(user);
		}
	}

	public void login(User user) {
		System.out.println(user.email + " Başarılı bir şekilde sisteme giriş yaptın!");
	}

	public void signUp(User user) {
		System.out.println(user.email + " Sisteme kaydınız yapılmıştır");
	}
}
