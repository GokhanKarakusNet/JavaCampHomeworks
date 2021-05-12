package ders3Odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " " + user.lastName + " ba�ar�l� bir �ekilde eklendi");
	}

	public void addMultiple(User[] users) {

		for (User user : users) {
			add(user);
		}
	}

	public void login(User user) {
		System.out.println(user.email + " Ba�ar�l� bir �ekilde sisteme giri� yapt�n!");
	}

	public void signUp(User user) {
		System.out.println(user.email + " Sisteme kayd�n�z yap�lm��t�r");
	}
}
