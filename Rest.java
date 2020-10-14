package attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
	public Rest(){
		 super(Type.PSYCHIC, 0, 0);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def){
		return true;
	}
	
	@Override
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.HP, (int) (p.getHP() - p.getStat(Stat.HP)));
		Effect effect = new Effect().turns(2);
		effect.sleep(p);
	}
	
	@Override
	protected String describe(){
		return "Najralsya i spit";
	}
}