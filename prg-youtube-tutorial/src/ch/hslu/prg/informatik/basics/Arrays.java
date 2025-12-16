package ch.hslu.prg.informatik.basics;

public class Arrays {
	
	public static void main(String[] args) {
		
		
		//Array definieren:
		//Datentyp des Arrays, name, new datentyp[Anzahl]
		int[] numbers = new int[10];
		
		numbers[0] = 1;
		
		
		for (int i = 1 ; i < numbers.length ; i++) {
			numbers[i] = (i + 1);
		}
			
		
		System.out.println("Das dritte des Array ist: " + numbers[2]);
		
		
		//Kurzschreibweise:
		
		String[] werkzeugkasten = {"Hammer", "Meisel", "Schleifmaschine"};
		
		System.out.println("Das zweite Element im Werkzeugkasten ist: " + werkzeugkasten[1]);
		
		
	}

}
