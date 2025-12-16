package ch.hslu.informatik.prg.demo01;

public class App {
	
	public static void main(String[] args) {
		
		Adresse a = new Adresse("Pilatusstrasse 12", "Luzern", 6000);
		Adresse b = new Adresse("Pilatusstrasse 10", "Luzern", 6000);
		Adresse c = new Adresse("Suurstoffi 1", "Rotkreuz", 6434);
		
		int res = a.compareTo(b);
		
		System.out.println("res ist gleich " + res);
		
		System.out.println("b.equals(c): " + b.compareTo(c));
		
	}

}
