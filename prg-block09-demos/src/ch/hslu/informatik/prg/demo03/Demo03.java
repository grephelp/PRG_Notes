package ch.hslu.informatik.prg.demo03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03 {

	public static void main(String[] args) {
		
		Map<String, Modul> modulMap = new HashMap<>(); 
		
		modulMap.put("PRG", new Modul("Programmierung", 6, 1));
		modulMap.put("ISF", new Modul("Information Security Fundamentals", 3, 1));
		modulMap.put("SPTA", new Modul("Security Project und Teamarbeit", 6, 1));
		
		
		System.out.println("Anzahl: " + modulMap.size());
		
		Modul isf = modulMap.get("ISF");
		
		System.out.println(isf);
		
		Set<String> keys = modulMap.keySet();
		
		System.out.println();
		
		for (String key : keys) {
			System.out.println(modulMap.get(key));
		}
		
		System.out.println();
		
		Collection<Modul> module = modulMap.values();
		
		for (Iterator<Modul> it = module.iterator() ; it.hasNext(); ) {
			System.out.println(it.next());
		}
		
	}

}
