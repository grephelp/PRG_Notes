package ch.hslu.informatik.prg.block05.afg01;

public class App {
	
	public static void main(String[] args) {
		
		Lampe lampe1 = new Lampe(); 
		
		lampe1.setFassungsTyp("E143");
		lampe1.setLeistunginWatt(12);
		lampe1.setSpannunginVolt(82);
		
		System.out.println("Das ist der Fassungstyp der Lampe 1: " + lampe1.getFassungsTyp());
		
	}

}
