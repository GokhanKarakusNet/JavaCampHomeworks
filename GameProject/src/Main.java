import Adapters.MernisServiceAdapter;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer();
		gamer.setIdentityNumber("1234567890");
		gamer.setFirstName("Gökhan");
		gamer.setLastName("Karakuþ");
		gamer.setBirthYear(1900);
		
		Game game=new Game();
		game.setGameName("Snake");
		game.setGamePrice(99);
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		SalesManager salesManager=new SalesManager(new MernisServiceAdapter());
		salesManager.add(gamer, game, new Campaign(1, "3 al 1 ode", 10));
	}

}
