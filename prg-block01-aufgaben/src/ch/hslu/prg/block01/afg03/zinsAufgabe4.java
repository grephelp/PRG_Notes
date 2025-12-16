package ch.hslu.prg.block01.afg03;

import java.util.Scanner;

public class zinsAufgabe4 {
	
	public static void main(String[] args) {
		
		//Variabeln definieren
		
		double zinsSatz = 2.323;
		double guthaben;
		double guthabenZins;
		
		//Eingabe
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie Ihr momentanens Guthaben ein: ");
		guthaben = sc.nextDouble();
		
		//Berrechnung
		
		guthabenZins = guthaben * (1 + zinsSatz / 100);
		
		//Ausgabe
		
		System.out.println("Das neue Guthaben beträgt: " + guthabenZins);
				
	}
 
}
