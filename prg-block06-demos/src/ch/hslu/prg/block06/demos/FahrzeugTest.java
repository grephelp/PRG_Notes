package ch.hslu.prg.block06.demos;

public class FahrzeugTest {

	public static void main(String[] args) {
		
		/*-1
		Personenwagen marcosWagen = new Personenwagen();
		Personenwagen evasWagen = new Personenwagen();
		
		marcosWagen.setAnzahlPlaetze(3);
		marcosWagen.setLeistung(110);
		
		evasWagen.setAnzahlPlaetze(5);
		evasWagen.setLeistung(66);
		evasWagen.setFahrzeugNummer("93-3sdf7834-234");
		evasWagen.setLeerGewicht(0.8);
		
		System.out.println("Leistung von Marcos Wagen: " + marcosWagen.getLeistung());
		System.out.println("Leistung von Evas Wagen: " + evasWagen.getLeistung());
		
		System.out.println(evasWagen.toString());
		*/
		
		Personenwagen hanslisAuto = new Personenwagen("X-2323-23F", 0.85, 105, 5);
		
		System.out.println("Hanslis Auto: " + hanslisAuto);
	}
}
