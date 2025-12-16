package ch.hslu.prg.block05.demo01;

public class Regal {
	
	private int regalNr;
	private double breite;
	private double hoehe;
	private double tiefe;
	
	public Regal () {
		
	}
	
	public Regal (int n, double b, double h, double t) {
		regalNr = n;
		breite = b;
		hoehe = h;
		tiefe = t;
		
	}
	
	public void setRegalNr(int value) {
		regalNr = value;
	}
	
	public void setBreite(double value) {
		breite = value;
	}

	public void setHoehe(double value) {
		hoehe = value;
	}
	
	public void setTiefe(double value) {
		tiefe = value; 
	}
	
	
	 public int getRegelNr() {
		 return regalNr;
	 }
	 
	 public double getBreite() {
		 return breite; 
	 }
	 
	 public double getHoehe() {
		 return hoehe;
	 }
	 
	 public double getTiefe() {
		 return tiefe;
	 }
	
	
}
