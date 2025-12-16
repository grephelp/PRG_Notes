package ch.hslu.prg.informatik.basics;

public class FirstStepsMethoden {
	
	public static void main(String[] args) {
		
		
		addierer(2, 4);
		
		System.out.println();
		
		subtrahierer(8, 2);
		
		System.out.println();
		
		dividierer(8, 4);
		
		System.out.println();
		
		multiplizierer(3, 4);
		
		
		
	}
	
	
	public static void addierer(int zahl1, int zahl2) {
		int sum = zahl1 + zahl2; 
		System.out.println("Addition ergibt: " + zahl1 + " + " + zahl2 + " = " + sum );
	}
	
	public static void subtrahierer(int zahl1, int zahl2) {
		int sum = zahl1 - zahl2;
		System.out.println("Subtrahieren ergibt: " + zahl1 + " - " + zahl2 + " = " + sum );
	}
	
	public static void dividierer(int zahl1, int zahl2) {
		int sum = zahl1 / zahl2;
		System.out.println("Subtrahieren ergibt: " + zahl1 + " / " + zahl2 + " = " + sum );
	}
	
	public static void multiplizierer(int zahl1, int zahl2) {
		int sum = zahl1 * zahl2;
		System.out.println("Multiplikation ergibt: " + zahl1 + " * " + zahl2 + " = " + sum );
	}

}
