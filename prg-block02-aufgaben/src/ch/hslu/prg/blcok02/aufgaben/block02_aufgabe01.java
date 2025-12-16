package ch.hslu.prg.blcok02.aufgaben;

public class block02_aufgabe01 {
	
	public static void main(String[] args) {
		
		//Variablen definieren
		
		double zinsSatz = 4.85;
		int laufzeit = 3;
		double guthaben = 259.00;
		
		
		// Berechnung durchführen
		
		double endGuthaben = guthaben *(1 + zinsSatz * laufzeit);
		
		// Ausgabe
		
		System.out.println("Das Endguthaben nach 3 Jahren lautet: " + endGuthaben);
		
		
	}

}
