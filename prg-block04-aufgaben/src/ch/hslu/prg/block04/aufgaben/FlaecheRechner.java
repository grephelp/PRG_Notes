package ch.hslu.prg.block04.aufgaben;

public class FlaecheRechner {

    public static void main(String[] args) {
        /* Radius */
        double radius = 5;
        /* Seitenlaenge eines Quadrats */
        int seiteLaenge = 10;
        /* Breite und Hoehe eines Rechteck */
        int breite = 25;
        int hoehe = 4;
        
        /* Kriesflaeche berechnen */
        double flaecheKreis = FlaecheRechner.berechneFlaeche(radius);
        /* Qudratflaeche berechnen */
        double flaecheQuadrat = FlaecheRechner.berechneFlaeche(seiteLaenge);
        /* Rechteckflaeche berechnen */
        long flaecheRechteck = FlaecheRechner.berechneFlaeche(breite, hoehe);
        
        /* Ausgaben */
        System.out.printf("Kreisflaeche: %8.2f\n", flaecheKreis);
        System.out.printf("Quadratflaeche: %8.2f\n", flaecheQuadrat);
        System.out.println("Rechteckflaeche: " + flaecheRechteck);
    }
 
    
    //Methoden implementieren
    
    public static double berechneFlaeche(double radius) {
    	double returnvalue = Math.PI * Math.pow(radius, 2);	
    	return returnvalue;
    }
    
    public static double berechneFlaeche(int seiteLaenge) {
    	double returnvalue = seiteLaenge * seiteLaenge;
    	return returnvalue;     	
    }
    
    public static long berechneFlaeche(int breite, int hoehe) {
    	long returnvalue = (breite * hoehe);
    	return returnvalue;
    }
}