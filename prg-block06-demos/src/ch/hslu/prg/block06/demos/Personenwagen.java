package ch.hslu.prg.block06.demos;

public class Personenwagen extends KraftFahrzeug {

	private int anzahlPlaetze;
	
	public Personenwagen(String fahrzeugNummer, double leerGewicht, int leistung, int anzahlPlaetze) {
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
		return super.toString() + ", Anzahl Plaetze: " + anzahlPlaetze;		
	}
}
