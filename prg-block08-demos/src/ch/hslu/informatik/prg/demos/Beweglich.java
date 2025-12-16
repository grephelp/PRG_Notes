package ch.hslu.informatik.prg.demos;

public interface Beweglich {
	
	void start();
	void stop();
	void aendereRichtung(int grad);
	void aendereGeschwindigkeit(double power);	

}
