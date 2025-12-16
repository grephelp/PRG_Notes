package ch.hslu.prg.block03;

import java.util.Scanner;

public class aufgabe05_01 {

	public static void main(String[] args) {
		
		//Teilaufgabe 1
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte gib mir eine Zahl für a: ");
		a = sc.nextInt();
		
		System.out.println("Bitte gib mir eine Zahl für b: ");
		b = sc.nextInt(); 
		
		System.out.println("Bitte gib mir eine Zahl für c: ");
		c = sc.nextInt(); 
		
		
		if (a > b || a < (b / 2.0) || (a + c) > b) {
			System.out.println("Genf");			
		}
				
	}
	
}
