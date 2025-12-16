package ch.hslu.prg.block03;

import java.util.Scanner;

public class aufgabe06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie mir eine Ganzzahl ein, welche grösser ist als 1: ");
		int ganzZahl = sc.nextInt(); 
		
		if (ganzZahl <= 1) {
			System.out.println("Diese Zahl ist nicht Grösser als 1 - das Programm wird abgebrochen");
			System.exit(1);
		}
		
		if (ganzZahl == 2) {
			System.out.println("Die Zahl " + ganzZahl + " ist eine Primzahl");
			System.exit(0);
		}
		
		if (ganzZahl % 2 == 0) {
			System.out.println("Die Zahl " + ganzZahl + " ist keine Primzahl");
			System.exit(1);
		}
		
		for (int i = 3 ; i * i <= ganzZahl ; i += 2) {
			
			if (ganzZahl % i == 0) {
				System.out.println("Die Zahl " + ganzZahl + " ist keine Primzahl");
				System.exit(1);
			}
		}
		
		System.out.println("Die angegebene Zahl " + ganzZahl + " ist eine Primzahl");
		
	}

}
