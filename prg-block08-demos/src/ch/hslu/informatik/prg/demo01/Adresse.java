package ch.hslu.informatik.prg.demo01;

import java.util.Objects;

public class Adresse implements Comparable<Adresse>{
	
	private String strasse;
	private String ort;
	private int plz;
	
	public Adresse(String strasse, String ort, int plz) {
		this.strasse = strasse;
		this.ort = ort;
		this.plz = plz;		
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	public boolean equals(Object obj) { 
		
		// Identitaetpruefung
		
		if (this == obj) {
			return true;
		}
		
		// Parametertypueberpruefung
		
		if (!(obj instanceof Adresse)) {
			return false; 
		}
		
		Adresse param = (Adresse) obj;
		
		return this.plz == param.plz && this.strasse.equals(param.strasse) && this.ort.equals(param.ort);
		
	}
	
	public int hashCode() {
		return Objects.hash(this.strasse, this.ort, this.plz);
	}
	
	public int compareTo(Adresse param) {
		// plz -> ort -> strasse
		
		int res = Integer.compare(this.plz, param.plz);
		
		if (res != 0) {
			return res;
		}
		
		res = this.ort.compareTo(param.ort);
		
		if (res != 0) {
			return res;
		}
		
		return this.strasse.compareTo(param.strasse);
				
	}
	
	public String toString() {
		return strasse + ", " + plz + ", " + ort;
	}

}
