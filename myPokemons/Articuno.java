package myPokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Articuno extends Pokemon{
	public Articuno(String name, int level){
		super(name, level);
		setStats(90, 85,100, 95, 125, 85);
		setType(Type.ICE, Type.FLYING);
		setMove(new Facade(), new Rest(), new Hurricane(), new PowderSnow());
	}
}