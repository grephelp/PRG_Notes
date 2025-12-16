package ch.hslu.informatik.prg.demos;

public class Schiff  implements Beweglich {
	
	public void start() {
		System.out.println("Schiff startet ...");
	}

	public void stop() {
		System.out.println("Schiff haelt an ...");
	}
	
	
	public void aendereRichtung (int grad) {
		System.out.println("Schiff aendert Richtung ...");
	}
	
	public void aendereGeschwindigkeit (double faktor) {
		System.out.println("Schiff aendert Geschwidigkeit ...");
		
	}
	
}