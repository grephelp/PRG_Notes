package ch.hslu.prg.informatik.basics;

public class DurchschnittArray {
	
	public static void main(String[] args) {
		
		double[] ergebnisse = new double[5];
		
		ergebnisse[0] = 1.3;
		ergebnisse[1] = 4.5;
		ergebnisse[2] = 2.6;
		ergebnisse[3] = 4.7;
		ergebnisse[4] = 1.8;
		
		int sum = 0; 
		
		for (int i = 0 ; i < ergebnisse.length ; i++) {
			sum += i;
		}
		
		System.out.println("Der Durchschnitt lautet: " + (sum / ergebnisse.length));
		
		
		
	}

}
