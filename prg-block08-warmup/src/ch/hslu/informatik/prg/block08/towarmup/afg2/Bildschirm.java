package ch.hslu.informatik.prg.block08.towarmup.afg2;

import java.util.Objects;

public class Bildschirm implements Comparable<Bildschirm> {

	private String marke;
	private double diagonaleInZoll;
	private double preis;

	public Bildschirm() {

	}

	public Bildschirm(String marke, double diagonaleInZoll, double preis) {
		this.marke = marke;
		this.diagonaleInZoll = diagonaleInZoll;
		this.preis = preis;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getMarke() {
		return marke;
	}

	public void setDiagonaleInZoll(double diagonaleInZoll) {
		this.diagonaleInZoll = diagonaleInZoll;
	}

	public double getDiagonaleInZoll() {
		return diagonaleInZoll;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public double getPreis() {
		return preis;
	}

	@Override
	public String toString() {
		return "Bildschirm Infos wären - Marke: " + marke + " , Diagonale: " + diagonaleInZoll + " ,Preis:" + preis;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Bildschirm other = (Bildschirm) obj;
		return Double.compare(other.diagonaleInZoll, diagonaleInZoll) == 0 && Objects.equals(marke, other.marke);
	}

	@Override
	public int hashCode() {
		return Objects.hash(marke, diagonaleInZoll);
	}
	
	
	public int compareTo(Bildschirm other) {
		
		int res = Double.compare(this.diagonaleInZoll, other.diagonaleInZoll);
		
		if (res != 0) {
			return res;
		}
		
		return Double.compare(this.preis, other.preis);
		
	}
	

}