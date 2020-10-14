package attacks;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove{
	public Absorb(){
		 super(Type.GRASS, 20, 100);
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def){
		double damage = calcBaseDamage(att, def);
		att.setMod(Stat.HP, (int) (-2 * damage));
		if (Math.random() <= att.getStat(Stat.SPEED) / 512)
			return 2.0;
		return 1.0;
	}
	
	@Override
	protected String describe(){
		return "Otsosal HP";
	}
}