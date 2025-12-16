package ch.hslu.prg.block06.video.demos;

public class FahrzeugTest {
	
	public static void main(String[] args) {
		
//		Fahrrad fahrrad = new Fahrrad();
//		LastWagen lWagen = new LastWagen();
		
//		fahrrad.setRahmenHoehe(24.5);
//		fahrrad.setFahrzeugNummer(9876);
//		fahrrad.setLeerGewicht(25.4);

		
		
		
//		System.out.println(fahrrad.toString());
//		System.out.println("Die Fahrzeugnummer lautet: " + fahrrad.getFahrzeugNummer());
		
		
//		Personenwagen pWagen = new Personenwagen(); 
//		pWagen.setFahrzeugNummer(7777);
//		pWagen.setLeerGewicht(1600);
//		pWagen.setLeerGewicht(150);
//		pWagen.setAnzahlPlaetze(5);

		//Parameterisierte Konstruktoren
		
		Personenwagen pWagen = new Personenwagen(777, 1600, 150, 5);
		Fahrrad fahrrad1 = new Fahrrad(9876, 25, 24.5);
		LastWagen lwagen = new LastWagen(8888, 12000, 450, 16000);
		
		
		System.out.println(pWagen.toString());
		System.out.println(lwagen.toString());
		System.out.println(fahrrad1.toString());
		
		
	}

}
