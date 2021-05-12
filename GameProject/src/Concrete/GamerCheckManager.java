package Concrete;

import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerCheckManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		
		return true;
	}
	
}
