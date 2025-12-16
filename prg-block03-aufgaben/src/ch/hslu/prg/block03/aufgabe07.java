package ch.hslu.prg.block03;

import java.util.Scanner;

public class aufgabe07 {
	
	public static void main(String[] args) {
		
		
		// Scanner definieren:
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bitte geben Sie eine Zahl an, wie lang das Array sein sollte: ");
		int arrayZahl = sc.nextInt();
		
		int[] intArray = new int[arrayZahl];
		
		for (int i = 0 ; i < arrayZahl ; i++) {
			int zufallszahl = 1 + (int)(Math.random() * 1000);
			intArray[i] = zufallszahl;
			
		}
		
		// Ausgabe von jedem Element des Arrays
		
		for (int i = 0 ; i < arrayZahl ; i++) {
			System.out.println(intArray[i]);
		}
		
		// Ausgabe des kleinsten Element des Arrays
		
		if (intArray.length == 0) {
			System.out.println("Das Array ist leer");
			System.exit(1);
		}
		
		int kleinsteZahl = intArray[0];
		
		for (int i = 1 ; i < intArray.length ; i++) {
			
			if (intArray[i] < kleinsteZahl) {
				kleinsteZahl = intArray[i];
			}
			
		}
		
		System.out.println("Die kleinste Zahl des Arrays ist: " + kleinsteZahl);
		
		
		//Berechnung aller Summen des Arrays
		int summeArray = 0;
		
		for (int i = 0 ; i < intArray.length ; i++) {
			
			summeArray += intArray[i];
			
		}
		
		System.out.println("Die Summe aller Arrays sind: " + summeArray);
		
		
		// Initalisierung 2. Array
		
		int primCounter = 0; 
		
		for (int i = 0 ; i < intArray.length ; i++) {
			
			if (intArray[i] % 2 == 0) { 
				primCounter += 1;
			}
				
		}
				
		//int intArrayGerade = new int[]
		
		int[] intArrayGerade = new int[primCounter];
		
		int j = 0; 
		
		//Gerade Zahlen ins Array einfüllen
		
		for (int i = 0 ; i < intArray.length ; i++) {
			
			if (intArray[i] % 2 == 0) { 
				intArrayGerade[j] = intArray[i];
				j++;
			}		
		}
		
		for (int i = 0 ; i < intArrayGerade.length ; i++) {
			System.out.println(intArrayGerade[i]);
		}
		

		// Auslesen der ungeraden Zahl 
		
		for (int i = intArray.length - 1 ; i > 0 ; i--) {
			
			if (intArray[i] % 2 != 0) {
				System.out.println("Die letzte ungerade Zahl ist: " + intArray[i]);
				System.exit(0);
			}
			
		}
		
	}

}
