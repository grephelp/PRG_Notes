package ch.hslu.informatik.prg.util;

public class App {

	public static void main(String[] args) {
		
		CommonContainer<Buch> bCont = new CommonContainer<>();
		
		
		CommonContainer<Lampe> lCont = new CommonContainer<>();
		
		bCont.add(new Buch("Java in einer Kaffeepause", 9.95, "123-34-X-3"));
		bCont.add(new Buch("Mathe I", 79.95, "8834-YX-4567"));
		bCont.add(new Buch("Krieg und Frieden", 39.95, "5467-Y-665"));
		
		Buch b = bCont.get(1);
		
		System.out.println(b.getTitel());
				
		System.out.println("Anzahl von Bücher: " + bCont.size());
		
		bCont.remove(b);
		
		System.out.println("Anzahl von Bücher: " + bCont.size());

		lCont.add(new Lampe(40, 6.95));
		lCont.add(new Lampe(6, 9.95));
		
		System.out.println("Anzahl Lampen: " + lCont.size());
		
		
		//Nicht möglich, compiler merkt es
		//lCont.add("Hallo allerseits");
		
	}

}
