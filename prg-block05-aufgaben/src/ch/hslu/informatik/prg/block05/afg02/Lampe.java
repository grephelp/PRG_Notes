package ch.hslu.informatik.prg.block05.afg02;

public class Lampe {
	
	private int spannunginVolt;
	private int leistunginWatt;
	private String fassungsTyp; 
	private Schalter schalter; 
	
	//Leerer Konstruktor erstellen
	
	public Lampe() {
		
	}

	
	//Konstruktor, welcher direkt alle Parameter aufnimmt. 
	
	public Lampe(int spannunginVolt, int leistunginWatt, String fassungsTyp) {
		this.spannunginVolt= spannunginVolt;
		this.leistunginWatt = leistunginWatt;
		this.fassungsTyp = fassungsTyp; 
		
	}
	
	public void setSpannunginVolt(int spannunginVolt) {
		this.spannunginVolt = spannunginVolt;
	}
	
	public int getSpannunginVolt() {
		return spannunginVolt;
	}
	
	public void setLeistunginWatt(int leistunginWatt) {
		this.leistunginWatt = leistunginWatt;
	}
	
	public int getLeistunginWatt() {
		return leistunginWatt;
	}
	
	public void setFassungsTyp(String fassungsTyp) {
		this.fassungsTyp = fassungsTyp;
	}
	
	public String getFassungsTyp() {
		return fassungsTyp;
	}
	
	public void setSchalter(Schalter schalter) {
		this.schalter = schalter;
	}
	
	public Schalter getSchalter() {
		return schalter; 
	}
		
}