package attacks;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove{
	public Roost(){
		 super(Type.FLYING, 0, 0);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def){
		return true;
	}
	
	@Override
	protected void applySelfEffects(Pokemon p){
		if (p.getHP() <= 0.5 * p.getStat(Stat.HP)){
			p.setMod(Stat.HP, (int) (-0.5 * p.getStat(Stat.HP)));
		}else
			p.setMod(Stat.HP, (int) (p.getHP() - p.getStat(Stat.HP)));			
	}
	
	@Override
	protected String describe(){
		return "Prosto najralsya";
	}
}