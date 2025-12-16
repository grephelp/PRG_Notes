package ch.hslu.prg.block06.demos;

public class LastWagen extends KraftFahrzeug {
	
	private int nutzLast;

	public LastWagen(String fahrzeugNummer, double leerGewicht, int leistung, int nutzLast) {
		super(fahrzeugNummer, leerGewicht, leistung);
		this.nutzLast = nutzLast;
	}
	
	public int getNutzLast() {
		return nutzLast;
	}

	public void setNutzLast(int nutzLast) {
		this.nutzLast = nutzLast;
	}
	

}
