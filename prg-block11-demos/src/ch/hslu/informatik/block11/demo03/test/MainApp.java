package ch.hslu.informatik.block11.demo03.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.*;

import ch.hslu.informatik.block11.demo03.domain.Lampe;
import ch.hslu.informatik.block11.demo03.persister.LampePersister;

public class MainApp {

	private static final Logger LOGGER = LogManager.getLogger(MainApp.class);

	public static void main(String[] args) {
		// TODO - Methoden der Klasse 'LampePersister' testen

		String path = "C:/temp/lampen.txt";

		List<Lampe> lst = new ArrayList<>();

		lst.add(new Lampe(230, 60, "W-27"));
		lst.add(new Lampe(9, 2, "G-9"));
		lst.add(new Lampe(12, 4, "W-12"));

		try {
			//LampePersister.serialize(lst, path);
			
			List<Lampe> l = LampePersister.deserialize(path);
			
			for (Lampe lmp : l) {
				System.out.println(lmp.getFassungTyp());
			}
		} catch (Exception e) {
			LOGGER.error("Fehler: ", e);
			System.out.println("Sorry...");
		}

	}

}
