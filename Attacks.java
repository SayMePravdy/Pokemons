import ru.ifmo.se.pokemon.*;

class PowderSnow extends SpecialMove{
	PowderSnow(){
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

class Hurricane extends SpecialMove{
	Hurricane(){
		 super(Type.FLYING, 110, 70);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		if (Math.random() <= 0.3)
			Effect.confuse(p);
	}
	
	@Override
	protected String describe(){
		return "Veter v hatu";
	}
}

class Facade extends PhysicalMove{
	Facade(){
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

class Rest extends StatusMove{
	Rest(){
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

class EnergyBall extends SpecialMove{
	EnergyBall(){
		 super(Type.GRASS, 80, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		if (Math.random() <= 0.1)
			p.setMod(Stat.SPECIAL_DEFENSE, -1);
	}
	
	@Override
	protected String describe(){
		return "Nuxai bebry";
	}
}

class RazorLeaf extends PhysicalMove{
	RazorLeaf(){
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

class PlayNice extends StatusMove{
	PlayNice(){
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

class LowSweep extends PhysicalMove{
	LowSweep(){
		 super(Type.FIGHTING, 65, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPEED, -1);
	}
	
	@Override
	protected String describe(){
		return "Shalom";
	}
}

class AerialAce extends PhysicalMove{
	AerialAce(){
		 super(Type.FLYING, 65, 0);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def){
		return true;
	}
	
	@Override
	protected String describe(){
		return "Shalom";
	}
}

class Absorb extends SpecialMove{
	Absorb(){
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

class Swagger extends StatusMove{
	Swagger(){
		 super(Type.NORMAL, 0, 85);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.ATTACK, 2);
		Effect.confuse(p);
	}
	
	@Override
	protected String describe(){
		return "Priliag otdohni";
	}
}

class Roost extends StatusMove{
	Roost(){
		 super(Type.FLYING, 0, 0);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def){
		return true;
	}
	
	@Override
	protected void applySelfEffects(Pokemon p){
		if (p.getStat(Stat.HP) * 1.5 <= p.getHP()){
			p.setMod(Stat.HP, (int) (-0.5 * p.getStat(Stat.HP)));
		}else
			p.setMod(Stat.HP, (int) (p.getHP() - p.getStat(Stat.HP)));			
	}
	
	@Override
	protected String describe(){
		return "Prosto najralsya";
	}
}
