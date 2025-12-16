import java.util.Scanner;

public class vorstellen {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Geben sie hier bitte Ihr Vornamen ein: ");
	String vorname = sc.nextLine();
	
	System.out.println("Geben sie hier bitte Ihr Nachname ein: ");
	String nachname = sc.nextLine();
	
	System.out.println("Geben Sie hier bitte Ihr Alter ein: "); 
	int alter = sc.nextInt();
	
	System.out.println("Kontrollieren Sie ihre Angaben");

	System.out.println("Ihr Vorname: " + vorname);
	
	System.out.println("Ihr Nachname: " + nachname);
	
	System.out.printf("Ihr Alter %d", alter);
	
	}
}