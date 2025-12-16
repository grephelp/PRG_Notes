package ch.hslu.informatik.prg.block05.afg01;

public class LampeTest {
	
	public static void main(String[] args) {
		
		Lampe lampeA = new Lampe(24, 40, "E14");
		
		System.out.println("Das ist die Leistungsklasse der Lampe A: " + lampeA.getLeistunginWatt());
				
		Lampe lampeB = new Lampe();
		
		lampeB.setFassungsTyp("E1237");
		lampeB.setLeistunginWatt(43);
		lampeB.setSpannunginVolt(48);
		
		System.out.println("Das ist die Spannung in Volt für die Lampe B: " + lampeB.getSpannunginVolt());
		
	}

}
