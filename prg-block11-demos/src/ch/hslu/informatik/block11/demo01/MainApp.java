package ch.hslu.informatik.block11.demo01;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApp {

	private static final Logger LOGGER = LogManager.getLogger(MainApp.class);
	
	public static void main(String[] args) {

		// TODO - Methode 'writeWithFileWriter' aufrufen
		String path = "C:/temp/file01.txt";
		
		String text = "Das ist so schoeeeeen!";
		
		//Aufruf
		
		try {
			//Util.write(text, path);
			
			// Lesen
			
			//String str = Util.read(path);
			
			String str = Util.readBuffered(path);
			System.out.println(str);
		} catch(IOException ioe) {
			LOGGER.error("Fehler: ", ioe);
			System.out.println("Leider hat etwas nicht funktioniert");
		}
		
		

		// TODO - Methode 'writeWithBufferedWriter' aufrufen

		// TODO - Methode 'readWihtFileReader' aufrufen

		// TODO - Methode 'readWithBufferedReader' aufrufen

	}
}
