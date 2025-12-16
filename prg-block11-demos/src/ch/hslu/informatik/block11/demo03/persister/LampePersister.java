package ch.hslu.informatik.block11.demo03.persister;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import ch.hslu.informatik.block11.demo03.domain.Lampe;

public class LampePersister {

	// TODO - Methode 'writeObjectsToFile' implementieren
	public static void serialize(Object obj, String fileName) throws Exception {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			oos.writeObject(obj);
		}
	}

	// TODO - Methode 'readObjectsFromFile' implementieren
	public static List<Lampe> deserialize(String path) throws Exception{
		
		List<Lampe> lampen = null; 
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
			lampen = (List<Lampe>)ois.readObject();
		}
		
		return lampen != null ? lampe : new ArrayList<Lampe>(); 
		
	}
	
	
}
