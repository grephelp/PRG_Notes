package ch.hslu.informatik.block11.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApp {

	private static final Logger LOGGER = LogManager.getLogger(MainApp.class);
	
	public static void main(String[] args) {
		
		// Datei, die kopiert weden soll
		String srcFile = "C:/temp/wasserfall_org.jpg"; // ANAPSSEN
		
		// Datei, die als Kopie erstellt werden soll
		String dstFile = "C:/Temp/wasserfall_copy.jpg";	// ANPASSEN
		
		// Methode 'copyFile' aufrufen
		
		try {
			copyFile(srcFile, dstFile);
		} catch(IOException ioe) {
			LOGGER.error("Fehler beim kopieren ", ioe);
			System.out.println("Take it easy!");
		}
		

	}
	
	// Methode 'copyFile' implementieren 
	private static void copyFile(String org, String dst) throws IOException {
		
		try(FileInputStream fis = new FileInputStream(org); FileOutputStream fos = new FileOutputStream(dst)){
		
			int b = -1;
			
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
			
		}
	}

}
