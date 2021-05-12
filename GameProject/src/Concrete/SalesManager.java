package Concrete;

import Abstract.SalesService;
import Abstract.UserValidationService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

UserValidationService userValidationService;
	
	
	public SalesManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}
	
	@Override
	public void add(Gamer gamer, Game game, Campaign campaign) {
		if (userValidationService.validate(gamer)) {
			System.out.println(game.getGameName() + " oyunu " +gamer.getFirstName() +" a "+campaign.getCampaignName() +" kampanyasý ile "+game.getGamePrice()+"'$' karsiliginda satildi");
		}else {
			System.out.println("Not a valid gamer.");
		}
		
	}

	@Override
	public void update(Gamer gamer, Game game, Campaign campaign) {
	System.out.println("Satis guncellendi");
		
	}

	@Override
	public void delete(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Satis silindi");
		
	}

}
