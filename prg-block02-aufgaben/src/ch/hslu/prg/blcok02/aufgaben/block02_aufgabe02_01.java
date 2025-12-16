package ch.hslu.prg.blcok02.aufgaben;

import java.util.Scanner;

public class block02_aufgabe02_01 {
	
	public static void main(String[] args) {
		
		//Variabeln
		
		int maschinenKosten = 100;
		int arbeitsKosten = 10;
		
		//Einlesen von Daten
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Geben Sie bitte die Anzahl der gewünschten Maschienenstückzahl an: ");
		int maschinenAnzahl = sc.nextInt();
		
		
		System.out.println("Geben Sie bitte die Anzahl Stunden an: ");
		double arbeitszeit = sc.nextDouble();
		
		//Berechnung durchführen
		
		int zwischenSummeMaschine = (arbeitsKosten * maschinenAnzahl);
		double zwischenSummeArbeitszeit = (arbeitsKosten * arbeitszeit);
		
		double gesamtSumme = (zwischenSummeMaschine + zwischenSummeArbeitszeit);
		
		//Ausgabe
		
		System.out.println("Die Gesamtkosten beträgt: " + gesamtSumme);
		
		
	}

}
