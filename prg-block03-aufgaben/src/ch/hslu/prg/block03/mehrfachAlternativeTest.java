package ch.hslu.prg.block03;

import java.util.Scanner;

public class mehrfachAlternativeTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte gebe mir eine Ganzzahl an: ");
		int ganzZahl = sc.nextInt(); 
		
		if (ganzZahl == 0) {
			System.out.println("Die Zahl ist 0");
		} 
		else if (ganzZahl == 1) {
			System.out.println("Die Zahl ist 1");
		}
		else if (ganzZahl == 2) {
			System.out.println("Die Zahl ist 2");
		}
		else if (ganzZahl == 3) {
			System.out.println("Die Zahl ist 3");
		} else {
			System.out.println("Die Zahl ist nicht im definierten Range");
		}
		
	}

}
