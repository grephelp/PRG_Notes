package ch.hslu.informatik.prg.demo01;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class Hello {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			int zahl = scanner.nextInt();
			double kehrbruch = 1/zahl;
			System.out.println(kehrbruch);
		} catch (InputMismatchException exception){
			System.out.println("Das war falsch, bitte eine Zahl eingeben");
			System.out.println(exception.getStackTrace());
		} 
		
		
		
	}

}
