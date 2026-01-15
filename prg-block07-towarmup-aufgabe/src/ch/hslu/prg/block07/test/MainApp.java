package ch.hslu.prg.block07.test;

import java.time.LocalDate;
import ch.hslu.prg.block07.container.SimpleGenericList;
import ch.hslu.prg.block07.domain.Adresse;

public class MainApp {
	
	public static void main(String[] args) {
		
		SimpleGenericList<Adresse> adresseListe = new SimpleGenericList<>(3);
		
		SimpleGenericList<LocalDate> datumListe = new SimpleGenericList<>(2);
		
		
		adresseListe.add(new Adresse());
		adresseListe.add(new Adresse());
		adresseListe.add(new Adresse());
		
		
		boolean viertesElement =  adresseListe.add(new Adresse());
		
		System.out.println("Ergebnis: " + (viertesElement ? "Es hat geklappt" : "Es hat nicht geklappt"));
		
		int zahl = adresseListe.getSize();
		System.out.println("Die Anzahl " + zahl);
		
		System.out.println();
		
		boolean elementLoeschen = adresseListe.remove(1);
		System.out.println("Loeschergebnis " + (elementLoeschen ? "Es hat geklappt" : "Es hat nicht geklappt"));
		
		
		int newZahl = adresseListe.getSize();
		
		System.out.println("Neue Anzahl des Indexes " + newZahl);
		
		System.out.println();
		
		boolean removeIndex = adresseListe.remove(10);
		System.out.println("Ergebnis 3: " + (removeIndex ? "Das Löschen hat geklappt" : "Das Löschen hat nicht geklappt"));
		
		datumListe.add(LocalDate.of(2026, 01, 16));
		datumListe.add(LocalDate.of(2026, 01, 18));
		
		int localDateSize = datumListe.getSize();
		System.out.println("Die Grösse des LocalDates " + localDateSize);
		
		
	}
	

}
