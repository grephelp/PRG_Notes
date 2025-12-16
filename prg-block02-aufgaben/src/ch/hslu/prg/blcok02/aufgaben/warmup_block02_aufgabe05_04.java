package ch.hslu.prg.blcok02.aufgaben;

public class warmup_block02_aufgabe05_04 {
	
	public static void main(String[] args) {
	
	boolean a = false;
	int x = 5; 
	int y = 10;
	int z = 100;
	
	boolean resA = a & x < y & x * y < z;
	boolean resB = a && x < y && x * y < z;
	int resC = x > y ? 1000 : 2000;
	
	/*Erwartete Ausgabe
	//resC = 2000
	  resB = */
	
	System.out.println(resA);
	System.out.println(resB);
	System.out.println(resC);
		
	}
}
