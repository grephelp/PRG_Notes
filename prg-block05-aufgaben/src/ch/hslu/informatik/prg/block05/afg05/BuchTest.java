package ch.hslu.informatik.prg.block05.afg05;

import java.util.Random;

public class BuchTest {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Buch[] buecherRegal = new Buch[3];
		
		
		
		Buch Buch1 = new Buch(rand.nextInt(10), "Blub", "Armin Hodel", 1992, 7);
		
		Buch Buch2 = new Buch(rand.nextInt(10), "Autsch", "Petra Sturzenegger", 1999, 6);
		
		Buch Buch3 = new Buch(rand.nextInt(10), "Help", "Blerim Martin", 2002, 8);
		
		buecherRegal[0] = Buch1;
		buecherRegal[1] = Buch2;
		buecherRegal[2] = Buch3;
		
		
		System.out.println("Das Buch 1 hat die folgenden Merkmale: " + buecherRegal[0].toString());
		
	}

}
