package ch.hslu.prg.block03;

public class buchaufgabe8_1_1 {
	
	static final int BREITE = 20;
	static final int HOEHE = 10;
	
	public static void main(String[] args) {
		
		for (int breite = 0 ; breite < BREITE -1 ; breite++) {
			System.out.print("*");
		}
		
		for (int hoehe = 0 ; hoehe < HOEHE - 2; hoehe++) {
			System.out.print("*");
			for (int breite = 1 ; breite < BREITE - 1; breite++) {
				System.out.print(" ");
				
			}
			
			System.out.println("*");
			
		}
		
		for (int breite = 0 ; breite < BREITE ; breite++) {
			System.out.print("*");
		}
		
		System.out.println();		
		
	}

}
