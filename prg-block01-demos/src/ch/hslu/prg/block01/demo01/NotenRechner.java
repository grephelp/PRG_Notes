package ch.hslu.prg.block01.demo01;

import java.util.Scanner;

public class NotenRechner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Eingabe der Noten
		
		System.out.print("PRG: ");
		double prgNote = sc.nextDouble();
		
		System.out.print("ISF: ");
		double isfNote = sc.nextDouble();
		
		System.out.print("MAT: ");
		double matNote = sc.nextDouble();
		
		System.out.print("NET: ");
		double netNote = sc.nextDouble();
		
		
		// Processing
		
		double summe = prgNote + isfNote + netNote + matNote;
		
		double noteFinal = summe / 4; 
		
		// Ausgabe der Note
		
		System.out.println("Meine Semesternote: " + noteFinal);
		System.out.printf("\nMeine Semesternote: %.2f\n", noteFinal);		
		
	}

}
