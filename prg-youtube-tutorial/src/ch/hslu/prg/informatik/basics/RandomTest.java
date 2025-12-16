package ch.hslu.prg.informatik.basics;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		
		Random random = new Random(); 
		
		int zufallsZahl = random.nextInt(6) + 1;
		
		System.out.println("Randomzahl: " + zufallsZahl);
	
	}

}
