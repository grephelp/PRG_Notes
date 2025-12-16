package ch.hslu.prg.informatik.basics;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		int alter; 
		
		// Hier wird ein Objekt erstellt anhand der Klasse Scanner. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte gib mir dein Namen ein:");
		String namePerson1 = sc.nextLine(); 
				
		System.out.println("Bitte gebe mir dein Alter noch an: ");
		alter = sc.nextInt(); 
		
		System.out.println("Der Name der ersten Person ist: " + namePerson1 + " welche das Alter " + alter + " hat");

	}

}
