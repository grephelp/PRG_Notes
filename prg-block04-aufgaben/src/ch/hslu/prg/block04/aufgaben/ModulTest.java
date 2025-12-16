package ch.hslu.prg.block04.aufgaben;

public class ModulTest {
	
	public static void main(String[] args) {
		
		//Ein Objekt erstellen für das jeweilige Modul:
		
		Modul PRG = new Modul(); 
		Modul DMATH = new Modul();
		Modul ISF = new Modul(); 
		
		// Werte Zuweisen für das entsprechende Modul
		
		PRG.modulName = "Programmieren";
		PRG.ECTS = 3;
		PRG.status = true;
		PRG.dozent = "Herrn Sucur";
		
		DMATH.modulName = "Diskrete Mathematik";
		DMATH.dozent = "Herrn Berger";
		DMATH.ECTS = 6;
		DMATH.status = true;
		
		ISF.modulName = "Information and Cybersecurity Foundamentals";
		ISF.dozent = "Herr Arnold";
		ISF.ECTS = 3;
		ISF.status = false;
		
		
		System.out.println("Der Modulname lautet: " + PRG.modulName);
		System.out.println("Das Modul " + DMATH.modulName + " wurde von dem Dozent " + DMATH.dozent + " unterrichtet und gibt folgende Anzahl Credits " + DMATH.ECTS);
		
		
		
		
	}

}
