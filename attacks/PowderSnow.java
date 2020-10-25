package attacks;

import ru.ifmo.se.pokemon.*;

public class PowderSnow extends SpecialMove{
	public PowderSnow(){
		 super(Type.ICE, 40, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().chance(0.1).condition(Status.FREEZE);
		p.addEffect(e);
	}
	
	@Override
	protected String describe(){
		return "Sneg zahavai";
	}
}