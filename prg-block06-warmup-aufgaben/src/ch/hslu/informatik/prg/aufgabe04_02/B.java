package ch.hslu.informatik.prg.aufgabe04_02;

public class B extends A {
	
	private String message; 
	
	public B() {
		
	}
	
	public B(int value) {
		super(value);
	}
	
	public B(int value, String message) {
		super(value);
		this.message = message; 
	}
	
	public void showValue() {
		System.out.println("Value = " + getValue());
	}
	
	public void setMessage(String message){
		this.message = message; 
	}
	
	public String getMessage(){
		return message; 
	}
	
}
