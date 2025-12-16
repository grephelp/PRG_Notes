package ch.hslu.informatik.prg.demos;

public class Hubschrauber  implements Beweglich {
	
	public void start() {
		System.out.println("Hubschrauber startet ...");
	}

	public void stop() {
		System.out.println("Hubschrauber haelt an ...");
	}
	
	
	public void aendereRichtung (int grad) {
		System.out.println("Hubschrauber aendert Richtung ...");
	}
	
	public void aendereGeschwindigkeit (double faktor) {
		System.out.println("Hubschrauber aendert Geschwidigkeit ...");
		
	}
	
}
