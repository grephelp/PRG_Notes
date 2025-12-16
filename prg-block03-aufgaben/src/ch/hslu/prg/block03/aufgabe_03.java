package ch.hslu.prg.block03;

import java.util.Scanner;

public class aufgabe_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// Einlesung der Daten
		System.out.println("Geben Sie Ihre Grösse in Zentimeter ein: ");
		int koerperGroesse = sc.nextInt();
		
		
		System.out.println("Geben Sieh Ihr Gewicht in Kilogramm ein: ");
		double koerpergewicht = sc.nextDouble();
		
		
		//Berechnung der Daten
		
		double koerperGroesseInMeter = koerperGroesse / 100.0;
		
		double bodyMassIndex = koerpergewicht /  Math.pow(koerperGroesseInMeter, 2);
		
		
		if (bodyMassIndex > 30) {
			System.out.println("Ihr BMI ist: " + bodyMassIndex);
			System.out.println("Sie haben Adipositas");
		}
		
		if (bodyMassIndex > 25 && bodyMassIndex <= 30) {
			System.out.println("Ihr BMI ist: " + bodyMassIndex);
			System.out.println("Sie haben Übergewicht");
		}
		
		if (bodyMassIndex > 18.5 && bodyMassIndex <= 25) {
			System.out.println("Ihr BMI ist: " + bodyMassIndex);
			System.out.println("Sie haben Normalgewicht");
		}
		
		if (bodyMassIndex <= 18.5) {
			System.out.println("Ihr BMI ist: " + bodyMassIndex);
			System.out.println("Sie haben Untergewichtig");
		}

	}

}
