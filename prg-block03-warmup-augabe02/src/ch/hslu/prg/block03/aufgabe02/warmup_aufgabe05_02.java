package ch.hslu.prg.block03.aufgabe02;

import java.util.Scanner;

public class warmup_aufgabe05_02 {
	
	public static void main(String[] args) {
		
		
		// Scanner definieren
		
		Scanner sc = new Scanner(System.in);
		
		
		//Zahl einlesen
		
		System.out.print("Bitte gib eine Zahl ein: ");
		int var1 = sc.nextInt();
		
		
		for (int i = 0; i < var1 ; i++) {
			System.out.println("Zahlenausgabe: " + i);
		}
		
	
		for (int i = var1 ; i >= 0 ; i--) {
			System.out.println("Zahlenausgabe Rückwerts: " + i);
		}
		
		
	}

}
