package ch.hslu.prg.block06.video.demos;

public class LastWagen extends KraftFahrzeug {

	private double nutzLast;
	
	//Konstrukor erstellen
	
	public LastWagen (int fahrzeugNummer, double leerGewicht, int leistung, double nutzLast) {
		super(fahrzeugNummer, leerGewicht, leistung);
		this.nutzLast = nutzLast; 
	}

	public double getNutzLast() {
		return nutzLast;
	}

	public void setNutzLast(double nutzLast) {
		this.nutzLast = nutzLast;
	}
	
	public String toString() {
		return super.toString() + ", Nutzlast: " + nutzLast;
	}

}
