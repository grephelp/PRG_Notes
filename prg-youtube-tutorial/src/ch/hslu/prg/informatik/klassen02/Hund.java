package ch.hslu.prg.informatik.klassen02;

public class Hund {
	
	//Attribute 
	
	int alter;
	String art;
	String fellFarbe;
	boolean kannPfoteGeben;
	
	
	//Konstruktor-Methode
	
	//Default Konstruktor
	
	public Hund() {
		
	}
	
	public Hund(int alter, String art, String fellFarbe, boolean kannPfoteGeben) {
		this.alter = alter;
		this.art = art;
		this.fellFarbe = fellFarbe;
		this.kannPfoteGeben = kannPfoteGeben; 
	}
	
	
	
	//Methoden
	
	public void bellen() {
		System.out.println("Wuff Wuff");
	}
	
	public void plusRechnen(int zahl1, int zahl2) {
		System.out.println(zahl1 + zahl2);
	}
	

}
