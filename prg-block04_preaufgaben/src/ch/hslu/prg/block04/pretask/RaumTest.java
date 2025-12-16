package ch.hslu.prg.block04.pretask;

public class RaumTest {

	public static void main(String[] args) {
		
		
		//Raum Datentyp initalisieren "sichtbar machen"
		Raum raumA = null;
		Raum raumB = null; 
		
		raumA = new Raum(); 
		raumB = new Raum(); 
		
		
		raumA.anzahlPlaetze = 30;
		raumB.anzahlPlaetze = 300;
		
		raumA.raumBezeichnung = "Midi";
		raumB.raumBezeichnung = "Maxi";
		
		
		System.out.println("Der Raum A hat " + raumA.anzahlPlaetze + " Plaetze");
		System.out.println("Der Raum B heisst " + raumA.raumBezeichnung);
		

	}

}
