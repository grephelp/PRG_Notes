package ch.hslu.informatik.prg.util;

public class Buch {

	private String titel;
	private double preis;
	private String isbn;
	
	public Buch(String titel, double preis, String isbn) {
		this.titel = titel;
		this.preis = preis;
		this.isbn = isbn;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public String getIsbn(){
		return isbn;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public String toString() {
		return "Titel: " + titel + ", Preis: " + preis + " CHF" + ", ISBN: " + isbn;
	}
}
