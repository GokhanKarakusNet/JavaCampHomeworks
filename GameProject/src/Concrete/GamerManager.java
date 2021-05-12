package Concrete;

import Abstract.GamerService;
import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	UserValidationService userValidationService;
	
	
	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println(
					"Gamer add the system. " + gamer.getFirstName() + " " + gamer.getLastName());

		}else {
			System.out.println("Not a valid gamer.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer is updated. " + " " + gamer.getFirstName());

		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Player is deleted. " + " " + gamer.getFirstName());

		
	}

}
