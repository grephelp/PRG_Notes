package ch.hslu.prg.block04.demo01;

public class RaumTest {

	public static void main(String[] args) {
		
		Raum audiMidi = new Raum();
		Raum audiMax = new Raum();
		Raum raum203 = new Raum();		
		
		audiMidi.anzahlPlaetze = 115;
		audiMax.anzahlPlaetze = 350;
		
		audiMidi.klimatisiert = true;
		
		System.out.println("Anzahl Plaetze: " + audiMidi.anzahlPlaetze);
		
		

	}

}
