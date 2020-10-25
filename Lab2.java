import myPokemons.*;
import ru.ifmo.se.pokemon.*;
	
public class Lab2{
	public static void main(String [] args){
		Battle b = new Battle();
		Articuno p1 = new Articuno("Lupa", 5);
		Tsareena p2 = new Tsareena("Pupa", 5);
		Steenee p3 = new Steenee("Kusi", 4);
		Bounsweet p5 = new Bounsweet("Putin", 3);
		Ninjask p4 = new Ninjask("Shakal", 10);
		Nincada p6 = new Nincada("Volk", 8);
		b.addAlly(p2);
		b.addFoe(p1);
		b.addFoe(p3);
		b.addFoe(p5);
		b.addAlly(p4);
		b.addAlly(p6);
		b.go();
	}
}