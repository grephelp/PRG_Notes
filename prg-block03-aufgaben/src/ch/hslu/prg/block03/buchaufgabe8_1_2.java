package ch.hslu.prg.block03;

public class buchaufgabe8_1_2 {
	
	
	public static void main(String[] args) {
		
		final int HOEHE = 5;

        for (int i = 1; i <= HOEHE; i++) {


            for (int j = 0; j < (HOEHE - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}