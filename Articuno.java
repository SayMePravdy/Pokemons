import ru.ifmo.se.pokemon.*;

public class Articuno extends Pokemon{
	public Articuno(String name, int level){
		super(name, level);
		setStats(90, 85,100, 95, 125, 85);
		setType(Type.ICE, Type.FLYING);
		//setMove(new Rest());
		//setMove(new PowderSnow(), new Hurricane(), new Facade());
		setMove(new Facade(), new Rest(), new Hurricane(), new PowderSnow());
	}
}