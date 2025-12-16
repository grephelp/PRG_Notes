package ch.hslu.informatik.prg.demos01;

import java.util.*;

public class Demo01 {

	public static void main(String[] args) {
		
		List<Point> points = new ArrayList<>(); 
		
		points.add(new Point(10, 10));
		points.add(new Point(-8, 22));
		points.add(new Point(-11, -5));
		points.add(new Point(12, -3));
		
		//Ausgabe
		for (Point p : points) {
			System.out.println(p);
		}
		
		
		System.out.println("Anzahl: " + points.size());
		
		// Punkte aus dem dritten Quadrant entfernen
		
		for (Iterator<Point> it = points.iterator() ; it.hasNext() ; ) {
			Point currentPoint = it.next();
			
			if (currentPoint.getX() < 0 && currentPoint.getY() < 0) {
				it.remove(); 
			}
		}
		
		//Ausgabe
		for (Point p : points) {
			System.out.println(p);
		}
		
		
	}

}
