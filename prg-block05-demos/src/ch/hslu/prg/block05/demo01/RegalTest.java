package ch.hslu.prg.block05.demo01;

public class RegalTest {
	
	public static void main(String[] args) {
		
		Regal regalA = new Regal();
		Regal regalB = new Regal();
		
		
		regalA.setRegalNr(10);
		regalA.setBreite(1.8);
		regalA.setHoehe(2.2);
		regalA.setTiefe(0.6);
		
		
		regalB.setRegalNr(25);
		
		
		Regal regalC = new Regal(33, 1.9, 2.1, 0.8);
		
		
	}	

}
