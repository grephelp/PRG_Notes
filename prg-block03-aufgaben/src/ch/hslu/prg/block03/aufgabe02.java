package ch.hslu.prg.block03;

import java.util.Scanner;

public class aufgabe02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int zahl1;
		int zahl2;
		int zahl3;
		
		
		System.out.println("Bitte geben Sie mir die erste Zahl ein: ");
		zahl1 = sc.nextInt();
		
		System.out.println("Bitte geben Sie mir die zweite Zahl ein: ");
		zahl2 = sc.nextInt();
		
		System.out.println("Bitte geben Sie mir die dritte Zahl ein: ");
		zahl3 = sc.nextInt();
		
		if (zahl1 > zahl2 && zahl1 > zahl3) {
			System.out.println(zahl1);
		}else if (zahl2 > zahl1 && zahl2 > zahl3) {
				System.out.println(zahl2);
		}else if (zahl3 > zahl1 && zahl3 > zahl2) {
					System.out.println(zahl3);
		}
		
		if (zahl1 < zahl2 && zahl1 > zahl3) {
			System.out.println(zahl1);
		} else if (zahl1 > zahl2 && zahl1 < zahl3) {
			System.out.println(zahl1);
		} else if (zahl2 < zahl1 && zahl2 > zahl3) {
			System.out.println(zahl2);
		} else if (zahl2 > zahl1 && zahl2 < zahl3) {
			System.out.println(zahl2);
		} else if (zahl3 < zahl2 && zahl3 > zahl1) {
			System.out.println(zahl3);
		} else if (zahl3 > zahl2 && zahl3 < zahl1) {
			System.out.println(zahl3);
		}
		
		if (zahl1 < zahl2 && zahl1 < zahl3) {
			System.out.println(zahl1);
		}else if (zahl2 < zahl1 && zahl2 < zahl3) {
				System.out.println(zahl2);
		}else if (zahl3 < zahl1 && zahl3 < zahl2) {
					System.out.println(zahl3);
		}
		
	}

}
