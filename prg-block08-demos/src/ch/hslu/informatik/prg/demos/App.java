package ch.hslu.informatik.prg.demos;

public class App {
	
	public static void main(String[] args) {
		
		Beweglich[] arr = new Beweglich[3];
		
		arr[0] = new Auto();
		arr[1] = new Hubschrauber();
		arr[2] = new Schiff();
		
		/*-1
		for (Beweglich device : arr) {
			device.start();
		}
		
		for (int i = 0; i < 1000000000 ; i++) {
			i += 1;
			i -= 1;
		}
		
		for (Beweglich device : arr) {
			device.stop();
		}
		*/
		
		starteAlle(arr);
		
		App mySelf = new App();
		mySelf.halteAlleAn(arr);
		
	}
	
	private static void starteAlle(Beweglich[] devices) {
		
		for (Beweglich device : devices) {
			device.start();
		}
		
	}

	private void halteAlleAn(Beweglich[] devices) {
		
		for (Beweglich device : devices) {
			device.stop();
		}
		
	}
	
}
