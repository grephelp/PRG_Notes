package ch.hslu.prg.block06.demos;

public class Fahrzeug {

	private String fahrzeugNummer;
	private double leerGewicht;
	
	//Konstruktor
	public Fahrzeug(String fahrzeugNummer, double leerGewicht) {
		this.fahrzeugNummer = fahrzeugNummer;
		this.leerGewicht = leerGewicht; 
		
	}
	
	public void setFahrzeugNummer(String fahrzeugNummer) {
		this.fahrzeugNummer = fahrzeugNummer;
		
	}
		
	//This ist bei Fahrzeugnummer nicht zwingend notwendig
	public String getFahrzeugNummer() {
		return this.fahrzeugNummer;
	}
	
	
	public void setLeerGewicht(double leerGewicht) {
		this.leerGewicht = leerGewicht;
		
	}
	
	public double getLeerGewicht() {
		return leerGewicht;
	}
	
	public String toString() {
		return "Fahrzeug-Nr.: " + fahrzeugNummer + ", Leergewicht: " + leerGewicht;
		
	}
}
