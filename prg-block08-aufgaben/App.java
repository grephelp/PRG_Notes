public class App {
	
	public static void main(String[] args) {
		
		FinanzKalkulator F1 = new FinanzKalkulatorImpl(10000.0, 5.0, 10.0, 16289.0, 100000.0, 20000.0, 30.0, 50.0);
		
		double endKapitalf1 = F1.berechneEndkapital(10000.0, 5.0, 10.0); 
		
		System.out.println("Das Endkapital lautet " +  endKapitalf1); 
		
		double endBarwert = F1.berechneBarwert(16289.0, 5.0, 10.0); 
		
		
		System.out.println(); 
		System.out.println("Der Barwert ist " + endBarwert); 
		
		
		double endAnuitate = F1.berechneAnuitaet(100000.0, 5.0, 10.0); 
		
		System.out.println(); 
		System.out.println("Der Anuitaetwert lautet " + endAnuitate); 
		
		double endBreakEven = F1.berechneBreakEventPunkt(20000.0, 30.0, 50.0); 
		
		System.out.println(); 
		System.out.println("Der Break Even Point liegt bei " + endBreakEven); 
		
	}
}
