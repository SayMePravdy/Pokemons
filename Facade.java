package attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
	public Facade(){
		 super(Type.NORMAL, 70, 100);
	}
	@Override
	protected void applyOppDamage(Pokemon def, double damage){
		Status status = def.getCondition();
		if (status == Status.BURN || status == Status.PARALYZE || status == Status.POISON)
			def.setMod(Stat.HP, (int) Math.round(damage * 2));
	}
	
	@Override
	protected String describe(){
		return "Poluchai neudachnick";
	}
}