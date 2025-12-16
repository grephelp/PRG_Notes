package ch.hslu.informatik.prg.demo01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo {

	public static void main(String[] args) {

		// LocalDate gebDatum = Util.readDate();
		try {
			LocalDate gebDatum = Util.getDatum("pp15.10.1990", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

			System.out.println("Geburtsdatum: " + gebDatum);
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : " + e.getCause().getLocalizedMessage());
		}
	}

}
