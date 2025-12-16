package ch.hslu.prg.informatik.basics;

public class Variablen {
	
	public static void main(String[] args) {
		
		//In diesem Abschnitt werden die Variablen erstellt und ausgegeben.
		
		int number; //Deklaration einer Variable
		number = 10; //Zuweisung der Variable bzw. Initalisierung der Variable
		
		//Die Deklaration und die Zuweisung kann auch in einem Schritt durchgeführt werden. Das würde wie folgt aussehen: 
		
		int number2 = 12; 
		
		System.out.println("Ich gebe hiermit die beiden Zahlen " + number + " " + number2 + " aus.");
		
		// Es können mehrere Variablen mit dem gleichen Namen vorhanden sein. Der Wert, welcher stimmt ist immer der letzte in diesem Block.
		// Dabei kann der Wert sich erhöhen oder überschrieben werden
		
		// Überschreiben von Variablen
		
		int guests;
		
		guests = 12;
		
		guests = 14;
		
		System.out.println("Anzahl Gäste: " + guests);  // Hier wird 14 ausgegeben.
		
		
		// Erhöhung von Variablen
		
		// Es gibt den "Minus bestehende Variable Operator": -= und den "Plus bestehende Variable Operator" += 
		
		guests += 3;
		
		System.out.println("Die neue Anzahl von Gästen sind: " + guests);
		
		// Wieder erhöhen:
		
		guests += 5;
		
		System.out.println("Die neue Anzahl von Gästen sind: " + guests);
		
		// Ebenfalls möglich ist direkt mit der Variable zu arebiten:
		
		guests = guests + 2;
		
		System.out.println("Die neue Anzahl von Gästen sind: " + guests);
		
	}

}
