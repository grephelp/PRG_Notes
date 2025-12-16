package ch.hslu.informatik.block11.demo01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

	// Methode 'writeWithFileWriter' implementieren (F12)
	public static void write(String content, String path) throws IOException{
		
		try(FileWriter writer = new FileWriter(path, false)){
			writer.write(content);			
		}
	}
	
	// Methode 'writeWithBufferedWriter' implementieren (F14)
	// TODO ...

	// Methode 'readWithFileReader' implementieren (F16)
	public static String read(String fileName) throws FileNotFoundException, IOException{
		StringBuilder sBuilder = new StringBuilder(); 
		
		try(FileReader reader = new FileReader(fileName)){
			int c = -1;
			
			while ((c = reader.read()) != -1){
				sBuilder.append((char)c); 
			}
		}
		
		return sBuilder.toString(); 
	}

	// Methode 'readWithBufferedReader' implementieren (F18)
	public static String readBuffered(String path) throws IOException {
		
		StringBuilder sBuilder = new StringBuilder(); 
		//Adhoc
		try(BufferedReader bReader = new BufferedReader(new FileReader(path))){
			
			String zeile = "";
			
			while ((zeile = bReader.readLine()) != null){
				sBuilder.append(zeile).append("\n");
			}
		}
				
		return sBuilder.toString(); 
	}
}
