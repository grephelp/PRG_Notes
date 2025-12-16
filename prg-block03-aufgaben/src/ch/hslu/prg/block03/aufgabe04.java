package ch.hslu.prg.block03;

import java.util.Scanner;

public class aufgabe04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Obergrenze an");
		int oberGrenze = sc.nextInt();
		
		System.out.println("Bitte geben Sie eine Untergrenze an");
		int unterGrenze = sc.nextInt();
		
		for (int i = oberGrenze; i >= unterGrenze ; i--) {
			System.out.print(i + " ");
		}
		
	}
	
}
