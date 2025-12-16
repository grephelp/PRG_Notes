package ch.hslu.informatik.prg.aufgabe04_02;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		//Instanz erstellen: 
		
		A instanzA = new A(); 
		B instanzB = new B(); 
		
		instanzA.setValue(2);
		
		System.out.println("Der Wert von A ist: " + instanzA.getValue());
		
		System.out.println();
		
		instanzB.setValue(3);
		
		System.out.println("Der Wert von B ist: " + instanzB.getValue());
		
		System.out.println();
		
		
		// Instanzierung mit Wertübergabe mittels Konstrukor
		A instanzC = new A(2);
		
		System.out.println("Der Wert von C ist: " + instanzC.getValue());
		
		System.out.println();
		
		B instanzD = new B(7);
		
		System.out.println();
		
		System.out.println("Der Wert von D ist: " + instanzD.getValue());
		
		
		System.out.println("=========================================================");
		
		System.out.println();
	
		A instanzE = new A(50);
		
		B instanzF = new B(60);
		
		System.out.println("Der Wert von E ist: " + instanzE.getValue());
		
		System.out.println("Der Wert von F ist: " + instanzF.getValue());
		
		
		B X = new B(8, "Blub");
		
		System.out.println("Der Wert von X ist: " + X.getValue() + " und die Nachricht lautet " + X.getMessage());
		
		
	}

}
