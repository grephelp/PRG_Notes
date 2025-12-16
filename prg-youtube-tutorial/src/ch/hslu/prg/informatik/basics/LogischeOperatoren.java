package ch.hslu.prg.informatik.basics;

public class LogischeOperatoren {
	
	
	public static void main(String[] args) {
		
		// Man kann mit den logischen Operatoren die Bedingung für die If-Schleife manipulieren. Dabei kann vor allem folgende Zeichen verwendet werden "<, >, >=, <=, !=, ==, &&)
		
		//Verneinung der Bedinung / Operation
		
		double temparatur = 21;
		
		//Die Bedinung steht jeweils in der Klammer - in diesem Beispiel wäre das die äussere Klammer
		//In der Inneren Klammern, wird anschliessend nochmals der Wert verneint. 
		if (!(temparatur == 22)) { 
			System.out.println("Die Temparatur ist nicht 22");
		}
		
		//Verknüpfung mit && - sprich beide Bedingung müssen wahr sein. 
		
		if (temparatur < 40 && temparatur > 10) {
			System.out.println("Die Temparatur liegt in einer angenehmer Range");
		}
		
		// Verknüpfung mit || - sprich mindestens 1 muss wahr sein.
		
		if (temparatur < 100 || temparatur > 30) {
			System.out.println("Die Temparatur liegt in einer angenehmer Range");
		}
		
		
		// Als letzer Operator gibt es noch den XOR-Operator ^, wobei 0 ^ 0 sowie 1 ^ 1 false ist.
		
		boolean patrick_gewonnen = true;
		boolean joel_gewonnen = true; 
		
		if (patrick_gewonnen ^ joel_gewonnen) {
			System.out.println("Wir haben ein Gewinner");
		} else {
			System.out.println("Wir haben noch kein Gewinner");
		}
		
	}
}
