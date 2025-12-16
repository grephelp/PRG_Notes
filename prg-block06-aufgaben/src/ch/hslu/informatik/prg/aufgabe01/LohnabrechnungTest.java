package ch.hslu.informatik.prg.aufgabe01;

public class LohnabrechnungTest {
	
	public static void main(String[] args) {
		
		Lernender marco = new Lernender("Marco", "Weber", 4234, 6000, 1);
				
		System.out.println("Lernedner " + marco.getVorname()  + " " + marco.getNachname());
		System.out.println("Ausbildungsjahr: " + marco.getAusbildungsJahr());
		System.out.println("Lohn: " + marco.berechneLohn());
		
		System.out.println();
		
		Sachbearbeiter urs = new Sachbearbeiter("Urs", "Kaufmann", 243234, 6000, 0);
		
		System.out.println("Sachbearbeiter " + urs.getVorname()  + " " + urs.getNachname());
		System.out.println("Ausbildungsjahr: " + urs.getAnstellungsJahr());
		System.out.println("Lohn: " + urs.berechneLohn());
		
		System.out.println();
		
		Leiter thomas = new Leiter("Thomas", "Lindenauer", 234234, 6000, 0);
		
		System.out.println("Leiter " + thomas.getVorname()  + " " + thomas.getNachname());
		System.out.println("Ausbildungsjahr: " + thomas.getAnstellungsDauer());
		System.out.println("Lohn: " + thomas.berechneLohn());
		
		System.out.println();
		
		Lernender marco2 = new Lernender("Marco", "Weber", 4234, 6000, 2);
		
		System.out.println("Lernedner " + marco2.getVorname()  + " " + marco2.getNachname());
		System.out.println("Ausbildungsjahr: " + marco2.getAusbildungsJahr());
		System.out.println("Lohn: " + marco2.berechneLohn());
		
		System.out.println();
		
		Sachbearbeiter urs7 = new Sachbearbeiter("Urs", "Kaufmann", 243234, 6000, 7);
		
		System.out.println("Sachbearbeiter " + urs7.getVorname()  + " " + urs7.getNachname());
		System.out.println("Ausbildungsjahr: " + urs7.getAnstellungsJahr());
		System.out.println("Lohn: " + urs7.berechneLohn());
		
		System.out.println();
		
		Leiter thomas7 = new Leiter("Thomas", "Lindenauer", 234234, 6000, 7);
		
		System.out.println("Leiter " + thomas7.getVorname()  + " " + thomas7.getNachname());
		System.out.println("Ausbildungsjahr: " + thomas7.getAnstellungsDauer());
		System.out.println("Lohn: " + thomas7.berechneLohn());
		
		System.out.println();
		
		Mitarbeiter[] mitarbeiterArray = new Mitarbeiter[3];
		mitarbeiterArray[0] = marco2;
		mitarbeiterArray[1] = urs7;
		mitarbeiterArray[2] = thomas7;
		
		for (int i = 0 ; i < mitarbeiterArray.length ; i++) {
			System.out.println("Gehalt " + mitarbeiterArray[i].getVorname() + " " + mitarbeiterArray[i].berechneLohn() + " CHF");		
		}
		

		
		
		
		
		
	}

}
