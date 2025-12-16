package ch.hslu.prg.informatik.basics;

public class WhileSchleife {
	
	public static void main(String[] args) {
		
		//while (Bedingung) { - Die Schleife wird solange ausgeführt, bis die Bedingung nicht mehr wahr ist
		
		int counter = 1;
		
		//Der Header beinhaltet ausschliesslich die Bedinung OHNE einen Counter nach oben oder sonstiges.
		
		while (counter < 10) {
			System.out.println("Der Counter ist kleiner als 10 und ist momentan: " + counter);
			counter++;
		}
		
		
		//Man kann auch ein break einbauen, damit das Programm nach einem "if statement in der Schleife abbricht". 
		
		int counter1 = 1;
		
		while(true) {
			System.out.println("Der Counter steht bei " + counter1);
			counter1++; 
			if(counter1 == 10) {
				break;
			}
		}
		
	}	
}
