package ch.hslu.prg.block03.aufgabe02;

import java.util.Scanner;

public class warmup_aufgabe06_02 {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		int n = sc.nextInt(); 
	
		for (int i = n ; i >= 0 ; i--) {
			System.out.println(i + " * " + i + " = " + (i*i));
		}

	}

}
