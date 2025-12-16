package ch.hslu.informatik.prg.aufgabe01;

public class Lernender extends Mitarbeiter {
	
	private int ausbildungsJahr; 
	
	public void setAusbildungsJahr(int ausbildungsJahr) {
		this.ausbildungsJahr = ausbildungsJahr; 
	}
	
	public int getAusbildungsJahr() {
		return ausbildungsJahr; 
	}
	
	public Lernender() {
		
	}

	public Lernender(String vorname, String nachname, int personalID, double grundLohn, int ausbildungsJahr) {
        super(vorname, nachname, personalID, grundLohn);
        this.ausbildungsJahr = ausbildungsJahr;         
    }
	
	
	public double berechneLohn() {
		
		int prozentTeil;
		
		if (getAusbildungsJahr() == 1) {
			prozentTeil = 15;
		} else if (getAusbildungsJahr() == 2) {
			prozentTeil = 25;
		} else if (getAusbildungsJahr() == 3) {
			prozentTeil = 35; 
		} else {
			prozentTeil = 0; 
		}
		 
        double faktor = prozentTeil / 100.0;
        
        return getGrundLohn() * faktor; 
    }
	
	
}
