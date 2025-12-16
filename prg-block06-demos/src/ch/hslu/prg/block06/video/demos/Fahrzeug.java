package ch.hslu.prg.block06.video.demos;

public class Fahrzeug {
	
	private int fahrzeugNummer;
	private double leerGewicht;
	
	//Konstruktor erstellen
	
	public Fahrzeug (int fahrzeugNummer, double leerGewicht) {
		this.fahrzeugNummer = fahrzeugNummer;
		this.leerGewicht = leerGewicht; 
	}
	
	public int getFahrzeugNummer() {
		return fahrzeugNummer;
	}
	
	public void setFahrzeugNummer(int fahrzeugNummer) {
		this.fahrzeugNummer = fahrzeugNummer;
	}
	
	public double getLeerGewicht() {
		return leerGewicht;
	}
	
	public void setLeerGewicht(double leerGewicht) {
		this.leerGewicht = leerGewicht; 
	}
	
	public String toString() {
		return "Fahrzeug-Nr. " + fahrzeugNummer + " , Leergewicht: " + leerGewicht;
	}
	
	

}
