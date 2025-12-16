package ch.hslu.prg.informatik.basics;

import java.util.Scanner; 

public class ForSchleife {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Von wo möchtest du an Zählen?");
		int beginnInt = sc.nextInt(); 
		
		System.out.println("Wie hoch möchtest du Zählen: ");
		int endInt = sc.nextInt(); 
				
		//In der Klammer steht "Wert", "Abbruchbedingung" und als letztes der Monifikator
		
		
		for (int i = beginnInt ; i < endInt ; i++ ) {
			System.out.println("Die momentane Zahl ist " + i);
		}
				
		for (; beginnInt < endInt ; beginnInt++ ) {
			System.out.println("Die momentane Zahl ist " + beginnInt);
		}
		
	}

}
