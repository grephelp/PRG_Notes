package ch.hslu.prg.block03.demos;

public class notenRechner {

	public static void main(String[] args) {
		
		//Array erstellen - Datentyp, name, new double [Anzahl Elemente]
		
		double [] notenSemesterEins = new double[5];		
		
		//Array Werte hinzufügen
		
		notenSemesterEins[0] = 5.5;
		notenSemesterEins[1] = 4.5;
		notenSemesterEins[2] = 6;
		notenSemesterEins[3] = 5;
		notenSemesterEins[4] = 4.5;
		
		//Berechnung der Summe aller Noten
		
		double temp = notenSemesterEins[0] + notenSemesterEins[1] + notenSemesterEins[2] + notenSemesterEins[3] + notenSemesterEins[4];
		
		//Berechnung des Durschnitts Summe / Anzahl Einträge
		
		double semesterSchnitt = temp / notenSemesterEins.length; 
		
		//Ausgabe
		
		System.out.println("Schnitt 1-stes Semester: " + semesterSchnitt);
		
		double [] notenSemesterZwei = {5.5, 6.0, 4, 5, 4};
		
		
		
	}

}
