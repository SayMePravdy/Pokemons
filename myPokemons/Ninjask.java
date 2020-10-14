package myPokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Ninjask extends Nincada{
	public Ninjask(String name, int level){
		super(name, level);
		setStats(61, 90, 45, 50, 50, 160);
		addType(Type.FLYING);
		addMove(new Roost());
	}
}