package ch.hslu.prg.block06.demos;

public class Fahrrad extends Fahrzeug {
	
	private double rahmenHoehe;
	
	public Fahrrad (String fahrzeugNummer, double leerGewicht, double rahmenHoehe) {
		super(fahrzeugNummer, leerGewicht);
		this.rahmenHoehe = rahmenHoehe;
	}

	public double getRahmenHoehe() {
		return rahmenHoehe;
	}

	public void setRahmenHoehe(double rahmenHoehe) {
		this.rahmenHoehe = rahmenHoehe;
	}
	
	
}
