package ch.hslu.informatik.prg.demo;

public class App {
	
	public static void main(String[] args) {
		
		Person marco = new Person("Meier", "Marco");
		
		Person hansli = new Fahrer("Pechvogel", "Hansli", "C");
		
		print(marco); 
		
		System.out.println();
		
		print(hansli);
						
	}
	
	private static void print(Person p) {
		System.out.println(p.toString());
	}
}
