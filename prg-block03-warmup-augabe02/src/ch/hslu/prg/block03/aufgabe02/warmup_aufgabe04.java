package ch.hslu.prg.block03.aufgabe02;

import java.util.Scanner;

public class warmup_aufgabe04 {
	
	public static void main(String[] args) {
		
		// TODO 1 Scanner Objekt erstellen

		Scanner sc = new Scanner(System.in);
		
		// TODO 2 Zwei Variablen deklarieren
		
		int var1;
		int var2; 
		
		//TODO 3 Die erste Zahl einlesen
		
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		var1 = sc.nextInt();
		
		//TODO 4 Positive Wert ausgeben bei Zahl > 0
		
		if (var1 >= 0) {
			System.out.println("Die Zahl ist positiv");
		}
		
		//  TODO 5 Negativer Wert ausgeben bei Zahl < 0
		
		if (var1 < 0) {
			System.out.println("Die Zahl ist Negativ");
		}
		
		// TODO 6 Das gleiche mit einer if / else Statement
		
		if (var1 >= 0) {
			System.out.println("Die Zahl ist im positiven Bereich");
		} else {
			System.out.println("Die Zahl ist im negativen Bereich");
			
		}
			
		// TODO 7 Zweite Zahl einlesen
		System.out.println("Gib mir eine zweite Zahl ein: ");
		var2 = sc.nextInt(); 
		
		// TODO 8 Var 1 und Var 2 miteinander vergleichen
		
		if (var1 > var2) {
			System.out.println("Die Variable 1 mit dem Wert " + var1 + " " + "ist grösser als die Variable 2");
		} else if (var1 == var2) {
			System.out.println("Die beiden Variablen sind gleichgross");
		} else {
			System.out.println("Die Variable 2 mit dem Wert " + var2 + " " + "ist grösser als die Variable 1");
		}
		
		
	}
	

}
