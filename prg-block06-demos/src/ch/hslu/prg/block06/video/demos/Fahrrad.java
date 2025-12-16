package ch.hslu.prg.block06.video.demos;

public class Fahrrad extends Fahrzeug {
	
	private double rahmenHoehe;
	
	//Konstruktor erstellen - Parameterliste enthält die Werte von Fahrzeug und Fahrrad
	
	public Fahrrad (int fahrzeugNummer, double leerGewicht, double rahmenHoehe) {
			super(fahrzeugNummer, leerGewicht);
			this.rahmenHoehe = rahmenHoehe;
	}
	
	public double getRahmenHoehe() {
		return rahmenHoehe;
	}
	
	public void setRahmenHoehe(double rahmenHoehe) {
		this.rahmenHoehe = rahmenHoehe;
	}
	
	public String toString() {
		return super.toString() + ", Rahmen-Hoehe:" + rahmenHoehe;
	}

}
