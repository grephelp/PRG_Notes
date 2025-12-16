package ch.hslu.informatik.prg.block10.aufgabe1;

public class Main {

	public static void main(String[] args) {
		
		int number = 0; 

		try {
			number = Util.getIntZahl("Bitte geben Sie eine Ganzzahl ein: ");
			System.out.println("Die Zahl lautet: " + number);
			int resultfac = Calculator.getFactorial(number);
			System.out.println(number + "!" + " ist = " + resultfac);
		} catch (ArgumentOutOfRangeException e) {
			System.out.println("Fehler: " + e.getMessage());
		} catch (Exception f) {
			System.out.println("Fehler: " + f.getMessage() + " , " + f.getCause().getMessage());
		}
		
	}
}
