package ch.hslu.prg.block06.demos;

public class KraftFahrzeug extends Fahrzeug {

	private int leistung;
	
	public KraftFahrzeug(String fahrzeugNummer, double leerGewicht, int leistung) {
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
		return super.toString() + ", Leistung: " + leistung + " KW"; 
				
	}
	
}
