package ch.hslu.informatik.prg.aufgabe01;

public class Sachbearbeiter extends Mitarbeiter {
	
	private int anstellungsJahr; 
	
	public void setAnstellungsJahr(int anstellungsJahr) {
		this.anstellungsJahr = anstellungsJahr; 
	}
	
	public int getAnstellungsJahr() {
		return anstellungsJahr; 
	}
	
	public Sachbearbeiter(String vorname, String nachname, int personalID, double grundLohn, int anstellungsJahr) {
		super(vorname, nachname, personalID, grundLohn);
		this.anstellungsJahr = anstellungsJahr; 	
	}
	
	public String toString() {
		return "Sachbearbeiter: " + getVorname() + " " + getNachname() + " " + getPersonalID();
	}
	
	public double berechneLohn() {
		
		int prozentTeil;
		
		prozentTeil = anstellungsJahr; 
		
		double faktor = prozentTeil / 100.0;
		
		return getGrundLohn() + getGrundLohn() * faktor; 
	
	
	}

}
