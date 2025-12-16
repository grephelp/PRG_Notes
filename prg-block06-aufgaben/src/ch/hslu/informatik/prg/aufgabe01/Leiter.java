package ch.hslu.informatik.prg.aufgabe01;

public class Leiter extends Mitarbeiter {
	
	private int anstellungsDauer; 
	private final int leiterBonus = 15;  
	
	public void setAnstellungsDauer(int anstellungsDauer) {
		this.anstellungsDauer = anstellungsDauer; 
	}
	
	public int getAnstellungsDauer() {
		return anstellungsDauer; 
	}
	
	public Leiter(String vorname, String nachname, int personalID, double grundLohn, int anstellungsDauer) {
		super(vorname, nachname, personalID, grundLohn);
		this.anstellungsDauer = anstellungsDauer; 
	}
	
	public double berechneLohn() {
		
		int prozentTeil;
		double basisLohn; 
		
		prozentTeil = anstellungsDauer; 
		
	    double faktor = anstellungsDauer / 100.0;
	    double faktor2 = leiterBonus / 100.0;
		
		basisLohn = getGrundLohn() + (getGrundLohn() * faktor);
		
		return basisLohn + (basisLohn *  faktor2); 
	
	}


}
