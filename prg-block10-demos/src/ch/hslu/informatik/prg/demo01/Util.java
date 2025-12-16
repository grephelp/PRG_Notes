package ch.hslu.informatik.prg.demo01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Util {

	public static LocalDate readDate() {
		
		
		//Ausnahmebehandlung vor Ort
		LocalDate date = null;
		String pattern = "dd.MM.yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Datum eingeben [dd.MM.yyyy]: ");
		
		String dateAsString = sc.next(); 
		
		
		do {
		    try {
		        date = LocalDate.parse(dateAsString, formatter);
		    } catch (DateTimeParseException e) {
		        System.out.println("Datum eingeben [dd.MM.yyyy]: ");
		        dateAsString = sc.next();
		    }
		} while (date == null);

		return date;
		
	}
	
	public static LocalDate getDatum(String datum, DateTimeFormatter dtf) {
		try {
			return LocalDate.parse(datum, dtf);	
		} catch(DateTimeParseException dtpe) {
			throw new Exception("Parsen misslungen", dtpe);
		}
		 
	}

}
