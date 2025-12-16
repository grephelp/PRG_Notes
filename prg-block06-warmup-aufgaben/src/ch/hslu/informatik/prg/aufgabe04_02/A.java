package ch.hslu.informatik.prg.aufgabe04_02;

public class A {
	
	private int value; 
	
	
	//leerer Konstruktor
	public A() {
		
	}
	
	// Parameterisierter Konstruktor
	public A(int value) {
		this.value = value; 
	}
	
	public void setValue(int value) {
		this.value = value; 
	}
	
	public int getValue() {
		return value; 
	}

}
