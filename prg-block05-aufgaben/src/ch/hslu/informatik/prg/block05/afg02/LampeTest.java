package ch.hslu.informatik.prg.block05.afg02;

public class LampeTest {
	
	public static void main(String[] args) {
		
		Lampe lampeA = new Lampe(24, 40, "E14");
		
		System.out.println("Das ist die Leistungsklasse der Lampe A: " + lampeA.getLeistunginWatt());
				
		Lampe lampeB = new Lampe();
		
		lampeB.setFassungsTyp("E1237");
		lampeB.setLeistunginWatt(43);
		lampeB.setSpannunginVolt(48);
		
		System.out.println("Das ist die Spannung in Volt für die Lampe B: " + lampeB.getSpannunginVolt());
		
		
		Schalter schalterA = new Schalter();
		Schalter schalterB = new Schalter(); 
		
		lampeA.setSchalter(schalterA);
		lampeB.setSchalter(schalterB);
		
		lampeA.getSchalter().ein();
		lampeB.getSchalter().ein();
		
		System.out.println("Lampe A: " + (lampeA.getSchalter().isEingeschaltet() ? "EINGESCHALTET" : "AUSGESCHALTET"));
        System.out.println("Lampe B: " + (lampeB.getSchalter().isEingeschaltet() ? "EINGESCHALTET" : "AUSGESCHALTET"));
        
        lampeA.getSchalter().aus();
        lampeB.getSchalter().aus();

        System.out.println("Lampe A: " + (lampeA.getSchalter().isEingeschaltet() ? "EINGESCHALTET" : "AUSGESCHALTET"));
        System.out.println("Lampe B: " + (lampeB.getSchalter().isEingeschaltet() ? "EINGESCHALTET" : "AUSGESCHALTET"));
		
	}
}
