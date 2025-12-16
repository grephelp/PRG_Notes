package ch.hslu.informatik.prg.block08.towarmup.afg2;

public class Main {
	
	public static void main(String[] args) {
		
		
		Bildschirm HP = new Bildschirm("HP", 12.6, 1200);
		Bildschirm Lenovo = new Bildschirm("Lenovo", 12.6, 1400);
		Bildschirm Dell = new Bildschirm("Dell", 10.2, 1400);
		
		int res = HP.compareTo(Lenovo);
		
		System.out.println("res ist gleich " + res);
		
		System.out.println("Lenovo.equals(Dell): " + Lenovo.compareTo(Dell));

		
		
	}

}
