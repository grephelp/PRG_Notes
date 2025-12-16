package ch.hslu.informatik.prg.demo;

public class Fahrer extends Person {
	
	private String kategorie;
	
	//Konstruktur erstellen, da im Person.java nicht vorhanden
	
	public Fahrer(String name, String vorname, String kategorie) {
		super(name, vorname);
		this.kategorie = kategorie;
		
	}

	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	
	public String toString() {
		return super.toString() + ", Kategorie: " + kategorie;
		
	}

}
