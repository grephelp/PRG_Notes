package ch.hslu.prg.informatik.basics;

import java.util.Scanner; 

public class IfSchleifen {
	
	public static void main(String[] args) {
		
		// Die IF-Schleife ermöglicht eine Prüfung von einem Statement. Dabei wird mittels booleanschen Wert überprüft ob "true" oder "false". Diese Bedingung findet immer in den runden Klammern statt. Wenn "true" wird es umgesetzt. Andernfalls gibt es diverse Möglichkeiten
		
		// Diese Aussage ist true und somit wird der Wert im "Body" ausgegeben.
		
		int number = 5; 
		
		if (number == 5) {
			System.out.println("Die Nummer ist " + number);
		}
		
		// Diese Aussage ist "false" und der Body wird somit ignoriert.
		
		if (number == 3) {
			System.out.println("Die Nummer ist " + number);
		}
			
		
		// Anhand einer IF-Schleife kann auch noch zusätzlich "Else" folgen. Diese If-Else Schleife kann beliebig erweitert werden.
		
		if (number != 5) {
			System.out.println("Die Zahl ist nicht 5");
		} else {
			System.out.println("Die Zahl ist 5");
		}
		
		//Aufzeigen, dass die Bedingung effektiv ein booleschen Wert hat: 
		
		int num = 1;
		boolean erhoehen = (num <= 5); //In der Variable erhoehen wird nun überprüft, ob "num" kleiner oder gleich 5 ist. Das wäre mit 1 true, was die erste Zeile ausgeben sollte
		
		if (erhoehen) {
			System.out.println("Die Zahl ist kleiner oder gleich 5");
		} else {
			System.out.println("Die Zahl ist grösser als 5");
		}
		
		
		//Aufgabe des Videos: https://youtu.be/bduK1FAtHBk?si=SBXd7tNmfpT9B44w
		// Prüfen ob Volljährig oder nicht - ich verwende dazu noch den Scanner, dass es interaktiv ist:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte gib mir dein Alter an: ");
		int alter = sc.nextInt(); 
		
		if (alter < 18) {
			System.out.println("Du bist noch minderjährig und darfst noch nicht in den Club");
		} else {
			System.out.println("Du bist volljährig - du darfst in den Club!");
		}
		
		
	}

}
