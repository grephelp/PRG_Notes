package ch.hslu.prg.block03;

import java.util.Scanner;

public class mehrfachAlternativeSwitch {
	
	public static void main(String[] args) {
		
		
		Scanner einleser = new Scanner(System.in);
		
		int wochenTag; 
		
		System.out.print("Bitte geben Sie ein Wochentag ein: ");
		wochenTag = einleser.nextInt();
		
		switch (wochenTag) {
		
		case 1:
			System.out.println("Heute ist Montag");
			break;
		
		case 2:
			System.out.println("Heute ist Dienstag");
			break;
			
		case 3:
			System.out.println("Heute ist Mittwoch");
			break;
		
		default: 
			System.out.println("Der Wochentag ist nicht definiert");
			break;	
		
		
		}
		
		
		
		
		
		
	}

}
