package attacks;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove{
	public PlayNice(){
		 super(Type.NORMAL, 0, 0);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def){
		return true;
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.ATTACK, -1);
	}
	
	@Override
	protected String describe(){
		return "Hoba";
	}
}