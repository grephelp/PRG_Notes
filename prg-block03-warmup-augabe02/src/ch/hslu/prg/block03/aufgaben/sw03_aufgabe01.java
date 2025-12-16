package ch.hslu.prg.block03.aufgaben;

import java.util.Scanner;

public class sw03_aufgabe01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Startkapital eingeben: ");
		double startKapital = sc.nextDouble () ;
		
		
		System.out.print(" Anzahl Jahre eingeben: ");
		double anzahlJahre = sc.nextDouble () ;
		
		
		System.out.print(" Zinssatz in Prozent eingeben: ");
		double zinsSatzInProzent = sc.nextDouble () ;
		
		
		/* Endkapital berechnen und Ausgeben */
		
		double endKapital;

        if (startKapital < 10000) {
            endKapital = startKapital * Math.pow((1 + 0.75 / 100), anzahlJahre);
        } 
        else if (startKapital < 100000) {
            endKapital = startKapital * Math.pow((1 + 0.5 / 100), anzahlJahre);
        } 
        else {
            endKapital = startKapital * Math.pow((1 + 0.5 / 100), anzahlJahre);
        }
		
		System.out.println ("\nEndkapital : " + endKapital);
	}

}
