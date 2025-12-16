package ch.hslu.informatik.prg.aufgabe01;

public abstract class Mitarbeiter {
	
	private String vorname;
	private String nachname; 
	private int personalID;
	private String arbeitsOrt;
	private final double grundLohn;  
	
	
	public void setVorname(String vorname) {
		this.vorname = vorname; 
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname; 
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public void setPersonalID(int personalID) {
		this.personalID = personalID; 
	}
	
	public int getPersonalID(){
		return personalID; 
	}
	
	public void setArbeitsOrt(String arbeitsOrt) {
		this.arbeitsOrt = arbeitsOrt;
	}
	
	public String getArbeitsOrt() {
		return arbeitsOrt; 
	}
	
	public double getGrundLohn() {
		return grundLohn; 
	}
	
	//Abstrake Methode. 
	public abstract double berechneLohn(); 

	
	//Default Konstrukor
	public Mitarbeiter() {
		this.grundLohn = 0; 		
	}
	
	//Konstruktor Erweiterung
	public Mitarbeiter(String vorname, String nachname, int personalID, double grundLohn) {
	    this.vorname = vorname;
	    this.nachname = nachname;
	    this.personalID = personalID;
	    this.grundLohn = grundLohn;
	}
}
