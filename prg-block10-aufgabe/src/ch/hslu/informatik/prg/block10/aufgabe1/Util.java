package ch.hslu.informatik.prg.block10.aufgabe1;

import java.util.Scanner; 

public class Util {
	public static int getIntZahl(String msg) throws Exception {
		System.out.print(msg);
		int value = -1;
		Scanner sc = new Scanner(System.in);
		try {
			String str = sc.next();
			value = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			throw new Exception(" Eingabe nicht korrekt !", nfe);
		}
		return value;
	}
}