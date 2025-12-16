package ch.hslu.prg.block05.demo01;

import java.time.LocalDate;

public class Kunde {
	
	private int kundenNummer;
	private String name;
	private String vorname;
	private String email;
	private LocalDate gebDatum;
	
	public Kunde() {
		
	}
	
	public Kunde(int kundenNummer, String name, String vorname) {
		
		this.kundenNummer = kundenNummer;
		this.name = name;
		this.vorname = vorname;
		
	}
	
	public Kunde(int kundenNummer, String name, String vorname, String email, LocalDate gebDatum) {
		
		this.kundenNummer = kundenNummer;
		this.name = name;
		this.vorname = vorname;
		this.email = email;
		this.gebDatum = gebDatum;
		
	}
	
	public void setKundenNummer(int kundenNummer) {
		
		this.kundenNummer = kundenNummer; 
		
	}
	
	public int getKundenNummer() {
		
		return kundenNummer;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
	
	public void setVorname(String vorname) {
		
		this.vorname = vorname;
	}

	
	public String getVorname() {
		
		return vorname;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public String getEmail() {
		
		return email; 
	}
	
	public void setGebDatum(LocalDate gebDatum) {
		
		this.gebDatum = gebDatum; 
	}
	
	public LocalDate getGebDatum() {
		
		return gebDatum;
	}
	
}
