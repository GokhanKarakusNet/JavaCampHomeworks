package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


public interface SalesService {
	void add(Gamer gamer, Game game, Campaign campaign);
	void update(Gamer gamer, Game game, Campaign campaign);
	void delete(Gamer gamer, Game game, Campaign campaign);
}
