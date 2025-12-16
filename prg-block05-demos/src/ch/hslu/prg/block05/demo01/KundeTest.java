package ch.hslu.prg.block05.demo01;

import java.time.LocalDate;

public class KundeTest {

	public static void main(String[] args) {
		
		Kunde marco = new Kunde();
		Kunde monali = new Kunde(); 
		
		
		marco.setName("Meier");
		marco.setVorname("Marco");
		marco.setGebDatum(LocalDate.of(2005, 6, 10));
		System.out.println("Marco: " + marco.getName() + " " + marco.getVorname() + " " + marco.getGebDatum());

		
		monali.setName("Bucheli");
		monali.setVorname("Monali");
		monali.setEmail("mbucheli@sbb.ch");
		
		System.out.println("Monika: " + monali.getName() + " " + monali.getVorname() + " " + monali.getEmail());
		
		Kunde beat = new Kunde(22, "Weber", "Beat");
		
		System.out.println();
		
		Kunde hansli = new Kunde(33, "Pechvogel", "Hansli", "hpechvogel@gmail.com", LocalDate.of(2000, 1, 1));
				
	}

}
