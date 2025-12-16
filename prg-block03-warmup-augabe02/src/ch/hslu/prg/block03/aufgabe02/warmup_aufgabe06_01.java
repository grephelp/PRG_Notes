package ch.hslu.prg.block03.aufgabe02;

import java.util.Scanner;

public class warmup_aufgabe06_01 {
		
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Bitte gib eine ganze Zahl ein: ");
		int n = sc.nextInt();
			
		while (n > 0) {
			System.out.println(n + " * " + n + " = " + (n*n));
			n --;
				
		}
			
	}
}

