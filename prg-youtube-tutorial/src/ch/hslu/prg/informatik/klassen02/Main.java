package ch.hslu.prg.informatik.klassen02;

public class Main {
	
	public static void main(String[] args) {
		
		
		//Objekt / Instanz erstellen
		
		Hund labrador = new Hund(4, "Labrador", "Schwarz", true); 
		
		System.out.println("Der Labrador ist " + labrador.alter + " alt");
		
		Hund dackel = new Hund(2, "Dackel", "Braun", false);
		
		Hund mops = new Hund(6, "Mops", "Grau", false);
		
		Hund[] hunde = {labrador, dackel, mops};
		
		for (int i = 0; i < hunde.length ; i++) {
			System.out.println("Rasse: " + hunde[i].art);
		}
		
		System.out.println("Wie viele Hunde können Pfote geben");
		
		
		int counter = 0; 
		for (int i = 0; i < hunde.length ; i++) {
			if (hunde[i].kannPfoteGeben == true) {
				counter++;
			}
			
		}
		
		System.out.println(counter);
	}

}
