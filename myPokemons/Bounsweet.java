package myPokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Bounsweet extends Pokemon{
	public Bounsweet(String name, int level){
		super(name, level);
		setStats(40,30, 38, 30, 38, 32);
		setType(Type.GRASS);
		setMove(new EnergyBall(), new RazorLeaf());
	}
}