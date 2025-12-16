import java.util.Scanner;

public class notenrechner {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Note SPTA: ");
	double spta = sc.nextDouble();
	
	System.out.print("Note OSA: ");
	double osa = sc.nextDouble();
	
	System.out.print("Note ANA-G: ");
	double anag = sc.nextDouble();
	
	System.out.print("Note WEBT: ");
	double webt = sc.nextDouble();	

	System.out.print("Note ISF: ");
	double isf = sc.nextDouble();		
	
	System.out.print("Note NETW: ");
	double netw = sc.nextDouble();	
	
	// Notendurchschnitt berechnen
	
	double schnitt = (netw + isf + webt  + anag + osa) / 5;
	
	// Notenschnitt ausgeben
	System.out.print(schnitt);
	
	}
}