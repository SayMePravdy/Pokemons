import ru.ifmo.se.pokemon.*;

public class Nincada extends Pokemon{
	public Nincada(String name, int level){
		super(name, level);
		setStats(31, 45, 90, 30, 30, 40);
		setType(Type.BUG);
		setMove(new AerialAce(), new Absorb(), new Swagger());
	}
}