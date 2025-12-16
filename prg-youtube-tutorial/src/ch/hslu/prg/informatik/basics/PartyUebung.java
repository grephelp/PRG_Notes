package ch.hslu.prg.informatik.basics;

import java.util.Scanner;

public class PartyUebung {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int guests; 
		boolean weiter = true; 
		
		System.out.println("Geben Sie mir die Anzahl Gäste ein: ");
		guests = sc.nextInt(); 
		
		while(weiter) {
			
			System.out.println("Möchten Sie Ihre Gästeliste erweitern, dann drücken Sie (1), möchten Sie sie verringern, dann drücken Sie (2). Falls sie das Programm abbrechen möchte, drücken Sie (3)");
			int auswahl = sc.nextInt();
			
			if (auswahl == 1) {
				System.out.println("Wie viele Gäste möchten Sie noch hinzufügen?");
				int gastHinzufuegen = sc.nextInt();
				guests = guests + gastHinzufuegen;
			}
			
			if (auswahl == 2) {
				System.out.println("Wie viele Gäste möchten Sie noch streichen?");
				int gastEntfernen = sc.nextInt();
				guests = guests - gastEntfernen;
			}
			
			if (auswahl == 3) {
				System.out.println("Sie möchten das Programm abbrechen.");
				break;
			}
			
		}
		
		System.out.println("Sie haben so viele Anzahl Gäste: " + guests);
		
		
	}
	

}
