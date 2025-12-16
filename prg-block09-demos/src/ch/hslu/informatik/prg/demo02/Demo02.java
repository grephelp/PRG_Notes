package ch.hslu.informatik.prg.demo02;

import java.util.TreeSet;
import java.util.*;
import ch.hslu.informatik.prg.demos01.Point;

public class Demo02 {
	
	public static void main(String[] args) {
		
		
		// Benutzerdefinierte Soriterordnung
		TreeSet<Point> ts = new TreeSet<>(new Comparator<Point>(){
				public int compare(Point a, Point b) {
					return a.getX() - b.getX();
				}
		});
		
		
		ts.add(new Point(10, 20));
		ts.add(new Point(5, 12));
		ts.add(new  Point(5, 22));
		ts.add(new Point(7, 11));
		
		
		System.out.println("Anzahl: " + ts.size());
		
		for (Point p : ts) {
			System.out.println(p);
		}
				
	}

}
