package ch.hslu.prg.block01.afg03;

import java.util.Scanner;

public class zinsrechner05 {

	public static void main(String[] args) {
		
		
		//Eingabe einlesen
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Geben Sie den Zinssatz an");
		double zinsSatz = sc.nextDouble();
		
		System.out.print("Geben Sie ein Guthaben ein: ");
		double guthaben = sc.nextDouble();
		
		
		//Verarbeitung
		double guthabenMitZinsen = guthaben * (1 + zinsSatz / 100);
		
		// Ausgabe
		System.out.println("Guthaben nach einem Jahr: " + guthabenMitZinsen);
		
		
		
	}
	
	
}
