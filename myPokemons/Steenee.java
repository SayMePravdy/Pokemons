package myPokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Steenee extends Bounsweet{
	public Steenee(String name, int level){
		super(name, level);
		setStats(52, 40, 48, 40, 48, 62);
		addMove(new PlayNice());
	}
}