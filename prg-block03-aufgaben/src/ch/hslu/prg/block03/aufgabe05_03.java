package ch.hslu.prg.block03;

import java.util.Scanner;

public class aufgabe05_03 {

	public static void main(String[] args) {
		
		//Teilaufgabe 3
		
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
		
		
		if (((a / 2) % 2) != 0  || ((b - c) % 2) == 0 || a != b && b != c) {
			System.out.println("Lugano");			
		}
		
	}
	
}
