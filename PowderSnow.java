package attacks;

import ru.ifmo.se.pokemon.*;

public class PowderSnow extends SpecialMove{
	public PowderSnow(){
		 super(Type.ICE, 40, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		if (Math.random() <= 0.1){
			Effect.freeze(p);
		}
	}
	
	@Override
	protected String describe(){
		return "Sneg zahavai";
	}
}