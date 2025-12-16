package ch.hslu.prg.block06.video.demos;

public class Personenwagen extends KraftFahrzeug {
	
	private int anzahlPlaetze;
	
	//Konstruktor
	
	public Personenwagen (int fahrzeugNummer, double leerGewicht, int leistung, int anzahlPlaetze) {
		super(fahrzeugNummer, leerGewicht, leistung);
		this.anzahlPlaetze = anzahlPlaetze; 
	}
	
	
	public int getAnzahlPlaetze() {
		return anzahlPlaetze;
	}
	
	public void setAnzahlPlaetze(int anzahlPlaetze) {
		this.anzahlPlaetze = anzahlPlaetze;
	}
	
	public String toString() {
		return "Fahrzeugnummer" + getFahrzeugNummer() + "Leergewicht" + getLeerGewicht() + "Leistung" + getLeistung() + "Anzahl Plaetze" + anzahlPlaetze; 
	}
	

}
