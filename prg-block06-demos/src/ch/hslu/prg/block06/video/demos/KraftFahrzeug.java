package ch.hslu.prg.block06.video.demos;

public class KraftFahrzeug extends Fahrzeug {
	
	private int leistung;
	
	//Konstrukor erstellen
	
	public KraftFahrzeug (int fahrzeugNummer, double leerGewicht, int leistung) {
		super(fahrzeugNummer, leerGewicht);
		this.leistung = leistung; 
	}
	
	public int getLeistung() {
		return leistung;
	}
	
	public void setLeistung(int leistung) {
		this.leistung = leistung; 
	}
	
	public String toString() {
		return super.toString() + ", Leistung: " + leistung; 
	}

}
