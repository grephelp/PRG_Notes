package ch.hslu.prg.block04.aufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class HelperClass {

    public static void main(String[] args) {
        
    	String[] array1 = {"Blub", "Blab", "Blib"};
    	
    	HelperClass.show(array1);  	

    	int[] meinZufallsArray = HelperClass.create(12, 2, 10);
    	System.out.println("Das erstellte Array:");
    	System.out.println(Arrays.toString(meinZufallsArray));
    	
    	double ruckgabewert = HelperClass.min(2, 3, 8);
    	System.out.println("Der kleinste eingegebene Wert ist: " + ruckgabewert);
    	
    	
    	int intruckgabe = HelperClass.readInt(); 
    	System.out.println("Die Rückgabe ist: " + intruckgabe);
    	
    	int intruckgabe2 = HelperClass.readInt("Bitte Zahl angeben: ");
    	System.out.println("Die Rückgabe ist: " + intruckgabe2);
    	
    	int[] arr = {1, 6, 9, 12, 22};
    	boolean ruckgabewertLast = HelperClass.contains(arr,  22);
    	System.out.println("Der Wert ist: " + ruckgabewertLast);
    	  	   	
    	double[] erstesArray = {1.4, 1.8, 9.9};
    	double[] zweitesArray = {5.5, 7.3, 8.8};
    	double[] ruckgabewertArray = HelperClass.merge(erstesArray, zweitesArray);
    	System.out.println("Das gemergte Array: " + Arrays.toString(ruckgabewertArray));
    	
    	
    }

    /**
     * Zeigt den Inhalt des übergebenen Arrays auf dem Bildschirm an.
     *
     * @param stringArray das Array
     */
    public static void show(String[] stringArray) {
    	
    	for (int i = 0 ; i < stringArray.length ; i++)
    		System.out.println("Das ist der " + (i + 1) + " String " + stringArray[i]);
    }

    /**
     * Erstellt ein Array mit der spezifizierten Länge und initialisiert
     * es mit den int-Werten, die sich in dem durch die Parameter from
     * und to definierten Bereich befinden.
     *
     * @param length  die Länge des Arrays
     * @param from    die untere Grenze des Bereichs, aus dem die
     * Zufallswerte genommen werden dürfen
     * @param to      die obere Grenze des Bereichs, aus dem die
     * Zufallswwerte genommen werden dürfen
     * @return das Array
     */
    public static int[] create(int length, int from, int to) {
        
    	int[] neuesArray = new int[length];
    	
    	int bereichsGroesse = to - from + 1;
    	
    	for (int i = 0 ; i < neuesArray.length ; i++) {
    		
    		int zufallsZahl = (int)(Math.random() * bereichsGroesse) + from;
    		
    		neuesArray[i] = zufallsZahl;
    		
    	}
    	
    	
        return neuesArray;
    }

    /**
     * Liefert den kleinesten der übergebenen Werte (Minimum) zurück.
     *
     * @param a der erste Wert
     * @param b der zweite Wert
     * @param c der dritte Wert
     * @return der kleinste Wert (Minimum)
     */
    public static double min(double a, double b, double c) {
    	        
    	double ruckgabewert = 0;
    	
    	if (a < b && a < c) {
    		ruckgabewert = a;
    	}
    	
    	if (b < a && b < c) {
    		ruckgabewert = b;
    	}
    	
    	if (c < a && c < b) {
    		ruckgabewert = c;
    	}
    	
        return ruckgabewert;
    }

    /**
     * Liest einen int-Wert von der Tastatur und liefert sie zurück.
     *
     * @return der eingelesene int-Wert
     */
    public static int readInt() {
    	
    	Scanner sc = new Scanner(System.in); 
    	      
    	int neuerWert;
    	
    	System.out.println("Geben Sie eine Zahl ein: ");
    	neuerWert = sc.nextInt(); 
    	
        return neuerWert;
    }

    /**
     * Liest einen int-Wert von der Tastatur und liefert sie zurück.
     *
     * @param message die Meldung, die vor dem Einlesen angezeigt wird
     * @return der eingelesene int-Wert
     */
    public static int readInt(String message) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println(message); 
    	int returnwert = sc.nextInt();
    	
        return returnwert;
    }

    /**
     * Fügt die beiden übergebenen Arrays zusammen und liefert das
     * resultierende Array zurück.
     *
     * @param firstArray  das erste Array
     * @param secondArray das zweite Array
     * @return das resultierende Array
     */
    
    public static double[] merge(double[] firstArray, double[] secondArray) {
    	
    	double[] kombinierterArray = new double[firstArray.length + secondArray.length];
    	
    	System.arraycopy(firstArray, 0, kombinierterArray, 0, firstArray.length);
    	System.arraycopy(secondArray, 0, kombinierterArray, firstArray.length, secondArray.length);
    	
        return kombinierterArray;
    }

    /**
     * Sagt, ob der übergebene value-Wert im dem übergebenen
     * Array enthalten ist.
     *
     * @param arr   das Array, das untersucht werden soll
     * @param value der Wert, für den bestimmt werden soll, ob er in dem
     * spezifizierten Array enthalten ist oder nicht.
     * @return das Resultat (enthalten oder nicht)
     */
    public static boolean contains(int[] arr, int value) {
        
    	boolean arrayVorhanden = false;
    	
    	for (int i = 0 ; i < arr.length ; i++) {
    		
    		if (value == arr[i]) { 
    			arrayVorhanden = true;
    			break;
    		}
    		
    	}
    	
        return arrayVorhanden;
    }
}