package ch.hslu.informatik.prg.util;

public class Lampe {

	private int leistung;
	private double preis;
	
	public Lampe(int leistung, double preis) {
		this.leistung = leistung;
		this.preis = preis;
	}

	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public String toString() {
		return "Leistung: " + leistung + " W, Preis: " + preis  + " CHF";
	}
}
