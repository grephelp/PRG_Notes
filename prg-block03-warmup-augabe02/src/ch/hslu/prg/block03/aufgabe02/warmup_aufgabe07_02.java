package ch.hslu.prg.block03.aufgabe02;

import java.util.Scanner;

public class warmup_aufgabe07_02 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		int zahl = sc.nextInt(); 
		
		while(zahl > 0) {
			System.out.println("Aktueller Zahlenwert: " + zahl);
			zahl--;
		}
		
		
	}

}
