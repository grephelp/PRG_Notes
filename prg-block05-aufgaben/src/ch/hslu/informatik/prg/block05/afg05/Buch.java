package ch.hslu.informatik.prg.block05.afg05;

public class Buch {
	
	private int buchNummer;
	private String titel;
	private String autor;
	private int erscheinungsJahr;
	private int auflage;
	
	public Buch() {	
	}
	
	public Buch(int buchNummer, String titel, String autor, int erscheinungsJahr, int auflage) {
		this.buchNummer = buchNummer;
		this.titel = titel;
		this.autor = autor;
		this.erscheinungsJahr = erscheinungsJahr;
		this.auflage = auflage; 
	}

	public void setBuchNummer(int buchNummer) {
		this.buchNummer = buchNummer;
	}
	
	public int getBuchnummer() {
		return buchNummer;
	}
	
	public void setTitel(String titel) {
		this.titel = titel; 
	}
	
	public String getTitel() {
		return titel; 
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor; 
	}
	
	public void setErscheinungsJahr(int erscheinungsJahr) {
		this.erscheinungsJahr = erscheinungsJahr;
	}
	
	public int getErscheiungsJahr() {
		return erscheinungsJahr;
	}
	
	public void setAuflage(int auflage) {
		this.auflage = auflage;
	}
	
	public int getAuflage() {
		return auflage;
	}
	
}
