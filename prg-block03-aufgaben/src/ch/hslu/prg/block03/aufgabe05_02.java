package ch.hslu.prg.block03;

import java.util.Scanner;

public class aufgabe05_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie mir ein Wert für A an: ");
		int a = sc.nextInt();
		
		System.out.println("Bitte geben Sie mir ein Wert für B an: ");
		int b = sc.nextInt();
		
		System.out.println("Bitte geben Sie mir ein Wert für C an: ");
		int c = sc.nextInt();
		
		System.out.println("Bitte geben Sie mir ein Wert für X an: ");
		boolean x = sc.nextBoolean();
		
		System.out.println("Bitte geben Sie mir ein Wert für Y an: ");
		boolean y = sc.nextBoolean();
		
		if (a > b || (a - c) > 0 && x != y) {
			System.out.println("Bern");
		}
		
		
		
	}

}
