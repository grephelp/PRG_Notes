package ch.hslu.prg.block03.aufgabe02;

public class warmup_aufgabe02 {
	
	
	 // Option 1, um ein Array zu erstellen
	
	public static void main(String[] args) {

		int [] primZahlen = new int[5];
		
		primZahlen[0] = 1;
		primZahlen[1] = 3;
		primZahlen[2] = 56;
		primZahlen[3] = 4;
		primZahlen[4] = 3;
		
	
		System.out.println("Die erste Primzahl ist: " + primZahlen[0] + " und die zweite wäre " + primZahlen[3]);
	
		System.out.println("Und die Länge des generierten Arrays ist: " + primZahlen.length);
		
		int primZahlenSumme = primZahlen[0] + primZahlen[1] + primZahlen[2] + primZahlen[3] + primZahlen[4];
		
		System.out.println("Die zusammengerechnete Summe beträgt: " + primZahlenSumme);

	}
}
