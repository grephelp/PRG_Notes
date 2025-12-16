// sc.nextDouble ist eine 
import java.util.Scanner;

public class Util{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Masse: ");
		double masse = sc.nextDouble();
		
		// Kraft berechnen
		double gravitationsKraft = masse * 9.8152345; 
		
		// Ausgabe
		System.out.println("Kraft: " + gravitationsKraft);
		
		System.out.printf("\nKraft: %.2f\n", gravitationsKraft);
	
	}
}