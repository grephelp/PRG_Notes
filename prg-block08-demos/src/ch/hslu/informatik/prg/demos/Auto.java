package ch.hslu.informatik.prg.demos;

public class Auto  implements Beweglich {
	
	public void start() {
		System.out.println("Auto startet ...");
	}

	public void stop() {
		System.out.println("Auto haelt an ...");
	}
	
	
	public void aendereRichtung (int grad) {
		System.out.println("Auto aendert Richtung ...");
	}
	
	public void aendereGeschwindigkeit (double faktor) {
		System.out.println("Auto aendert Geschwidigkeit ...");
		
	}
	
}