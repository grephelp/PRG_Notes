package ch.hslu.prg.block04.aufgaben;

public class Ueberladenemethoden_buch {

	    public static void main(String[] args) {
	        
	        // Variablen für die Ganzzahl-Rechnung
	        int intSumme = 0;
	        int a = 1;
	        int b = 2;
	        
	        // Variablen für die Kommazahl-Rechnung
	        double doubleSumme = 0.0;
	        double c = 1.5;
	        double d = 0.25;

	        Taschenrechner tr = new Taschenrechner();
	        intSumme = tr.addiere(a, b);
	        System.out.println(a + " + " + b + " = " + intSumme);


	        doubleSumme = tr.addiere(c, d);
	        System.out.println(c + " + " + d + " = " + doubleSumme);
	    }
	}


	class Taschenrechner {

	    public int addiere(int a, int b) {
	        return a + b;
	    }
	    
	    public double addiere(double c, double d) {
	    	return c + d; 
	    }
	}

