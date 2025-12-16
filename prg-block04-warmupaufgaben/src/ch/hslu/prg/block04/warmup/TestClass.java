package ch.hslu.prg.block04.warmup;

public class TestClass {
	
	public static void main(String[] args) {
		
		myClass.show("Hello");
		
		myClass.show("Hello", 383.2);
		
		int[] arr1 = {1, 34, 77};
		
		myClass.show("Blub", arr1);
		
		int ergebnis = myClass.max(4, 2);
		System.out.println("Das Ergebnis lautet " + ergebnis);
		
	}

}
