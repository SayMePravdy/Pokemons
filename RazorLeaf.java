package attacks;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove{
	public RazorLeaf(){
		 super(Type.GRASS, 55, 95);
	}
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def){
		if (Math.random() <= (3 * att.getStat(Stat.SPEED) / 512))
			return 2.0;
		return 1.0;
	}
	
	@Override
	protected String describe(){
		return "Kchau";
	}
}