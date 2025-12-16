package ch.hslu.prg.block03.aufgabe02;

public class Array_uebung {
	
	public static void main(String[] args) {
		
		//Array manuell definieren, Speicherbereich reservieren und neu zuweisen
		//Variable, anschliessend den Speicherbereich und anschliessend den Wert
		// Der Speicherbereich ist bis n-1 -> 5 können von 0 bis 4 sein.
		
		int [] primZahlNumbers = new int[5];
			
		primZahlNumbers[0] = 2;
		primZahlNumbers[1] = 3;
		primZahlNumbers[2] = 5;  
		primZahlNumbers[3] = 9; 
		primZahlNumbers[4] = 11; 
		
		System.out.println(primZahlNumbers.length);
		
		//Array erstellen und direkt Werte zuweisen (Liste)
		
		int[] primZahlenListe = {2, 3, 5, 7, 11, 13, 17, 19};
		
		System.out.println(primZahlenListe[3]);
		
		//Abfragen der Länge eines Arrays (Zählt ab 1)
		
		System.out.println("Die Länge des Arrays ist: " + primZahlenListe.length);
		
		char [] testArray = new char[3];
		
		testArray[0] = ' ';
		testArray[1] = 'c';
		testArray[2] = 'd';
		
		System.out.println("Das hier ist der zweite Charakter: " + testArray[1] + " " + "und das hier der erste Charakter" + testArray[0] + "einfach nichts");
	}

}
