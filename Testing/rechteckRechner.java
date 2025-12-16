//Importieren von Class
import java.util.Scanner;

// Das zwischen {} ist ein Block
public class rechteckRechner {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Breite: ");
		int breite = sc.nextInt();
		
		System.out.print("Hoehe: ");
		int hoehe = sc.nextInt(); 
		
		// Umfang berechnen
		int umfang = 2 * (breite + hoehe);
		
		// Flaeche berechnen
		int flaeche  =  breite * hoehe;
		
		//Ausgabe
		System.out.println("Umfang:  " + umfang);
		System.out.println("Flaeche: " + flaeche); 
		
		System.out.printf("Umfang: %d, Flaeche: %d\n", umfang, flaeche); 
	
	}
}