package ch.hslu.prg.block03.demos;

public class LoopsDemo {

	public static void main(String[] args) {

		long[] arr = new long[20];
		
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = i * i;
			//(long) = explizite Typumwandlung
			arr[i] = (long)Math.pow(i, 2);		
						
		}
				
		for (long i: arr) {
			
			System.out.print(i + "  ");
			
		}
		
		System.out.println(); 
		// Alle durch 6 teilbare Elemente ausgeben
		for (long temp : arr) {
			if (temp % 6 == 0) {
				System.out.print(temp + "  " );
				
			}
			
		}
		
	}

}
