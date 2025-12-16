package ch.hslu.prg.block03.aufgabe02;

import java.util.Scanner;

public class warmup_aufgabe06_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int n = sc.nextInt();

        int i = n;
        
        do {
            System.out.println(i + " * " + i + " = " + (i * i));
            i--; 
        } while (i >= 0);  
        
	}
}
