package ch.hslu.informatik.prg.block11.afg01;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ch.hslu.informatik.prg.block11.afg01.domain.Produkt;

public class DataParser {

	// WICHTIG: Als aktuelles Datum wird 05.12.2017 angenommen!
	private static final LocalDate aktuellesDatum = LocalDate.of(2017, 12, 5);

	private static final String DELIMITER = "#";

	/* Path zu Quelldatei (ANPASSEN falls noetig!!!) */
	private static final String SOURCE_FILE_NAME = "C:/temp/produktTypDataPlainText.txt";

	/* Path zu Ablage-Datei (ANPASSEN falls noetig!!!) */
	private static final String DEST_FILE_NAME = "C:/temp/produktTypDataSerialized.txt";

	private static final Logger LOGGER = LogManager.getLogger(DataParser.class);

	public static void main(String[] args) {

		/*
		 * Liste mit allen Zeilen aus der Datei, wobei pro Zeile ein 'Objekt' mit seinen
		 * Bestandteilen (Attributswerten) enthalten ist
		 */
		List<String> textZeilenQuelle = new ArrayList<>();

		/*
		 * Liste, in der die extrachierten Objekte vom Typ 'Produkt' verwaltet werden
		 */
		List<Produkt> produktListe = new ArrayList<>();

		/* Alle Zeilen aus der Quelldatei (Plain-Text) einlesen */
		textZeilenQuelle = readDataFromPlainTextFile(DataParser.SOURCE_FILE_NAME);

		/* Zur Kontrolle: Anzahl ausgelesener Zeilen ausgeben */
		System.out.println("Anzahl Zeilen: " + textZeilenQuelle.size() + "\n");

		/* Pro Zeile ist ein 'Produkt-Objekt' enthalten */
		if (!textZeilenQuelle.isEmpty()) {

			for (String line : textZeilenQuelle) {

				/*
				 * Zeilen, die mit '--' beginnen, sollen ignoriert werden - Contiue ist eine
				 * Sprunganweisung
				 */
				if (line.startsWith("--")) {
					continue;
				}

				/* Produkt-Objekt aus der Zeile extrachieren */
				Produkt produkt = parseProdukt(line);

				if (produkt != null) {
					/* Produkt-Objekt einfuegen, solange in der Liste nicht bereits enthalten */
					if (!produktListe.contains(produkt)) {
						produktListe.add(produkt);
					} else {
						// TODO - Log-Eintrag vom Typ WARNUNG erfassen (ZEILE_REDUNDANT ...)
						LOGGER.warn("\nZEILE_REDUNDANT:              " + line + "\n");
					}
				}

			}
		}

		/*
		 * Zur Kontrolle: Anzahl der erfolgreich rekonstruierten Produkt-Objekte
		 * ausgeben
		 */
		System.out.println("Anzahl rekonstruierter Produkt-Objekte:  " + produktListe.size() + "\n");

		/*
		 * Die extrachierten Produkt-Objekte in eine Datei (per Serialisierung)
		 * speichern
		 */
		saveProduktObjekte(produktListe);

		/* Objekte neu einlesen */
		List<Produkt> objekteDeserialisiert = readProduktObjekte();

		/*
		 * Zur Kontrolle: Anzahl der deserialisierten Produkt-Objekte ausgeben
		 */
		System.out.println("Anzahl deserialisierter Produkt-Objekte: " + objekteDeserialisiert.size() + "\n");

		/* TODO - Das Teuerste Produkt finden */
		Produkt teuersteProdukt = null;

		/*
		 * Zur Kontrolle: Den Namen, den Code und den Preis des teuersten Produkts
		 * ausgeben
		 */
		System.out.println("Das teuerste Produkt:\n  Name:  " + teuersteProdukt.getProduktName() + " ["
				+ teuersteProdukt.getProduktCode() + "]\n  Preis: " + teuersteProdukt.getPreis());

		/* TODO - Produkt finden, auf das am laengsten gewartet werden muss */
		Produkt produktAmLaengstenNichtVerfuegbar = null;

		/*
		 * Verfuegbarkeitsdatum des Produkt ausgeben, auf das am laengsten zu warten ist
		 * ausgeben
		 */
		System.out.println("\nProdukt, auf das am laengsten zu warten ist:\n  "
				+ produktAmLaengstenNichtVerfuegbar.getProduktName() + " ["
				+ produktAmLaengstenNichtVerfuegbar.getProduktCode() + "]\n  Verfuegbar ab: "
				+ produktAmLaengstenNichtVerfuegbar.getVerfuegbarAb());

	}

	private static Produkt parseProdukt(String line) {

		/*
		 * HINWEIS: Die vollstaendige Zeile besteht aus 10 Teile (parts) und sieht wie
		 * folgt aus (das Zeichen # ist das DELIMITER Zeichen bzw. das Trennzeichen):
		 */

		// produkt_nr#beschreibung#max_bestand#min_bestand#produkt_name#preis#code#tablar_nr#lieferant_nr#verfuegbar_ab

		Produkt produkt = null;

		/*
		 * Die einzelne durch DELIMITER getrennte Teile der Zeile in ein String-Array
		 * ablegen, das DELIMITER-Zeichen wird nicht 'mitgenommen' (siehe API der
		 * Methode String.split)
		 */
		String[] parts = line.split(DataParser.DELIMITER);

		if (parts.length < 10) {
			// TODO - Log-Eintrag erfassen (LINE_INCOMPLETE ...)
			LOGGER.error("Fehlermeldung parseProdukt: " + line);

		} else {

			try {
				// TODO - Vervollstaendigen ...
				int produktNummer = Integer.parseInt(parts[0]);
				String beschreibung = parseString(parts[1]);
				int maxBestand = 0;
				int minBestand = 0;
				String produktName = null;
				double preis = 0;
				String produktCode = null;
				int tablarNummer = 0;
				int lieferantNummer = 0;
				LocalDate verfuegbarAb = parseDate(parts[9]);

				/* Produkt erstellen und zurueck geben */
				produkt = new Produkt(produktNummer, beschreibung, maxBestand, minBestand, produktName, preis,
						produktCode, tablarNummer, lieferantNummer, verfuegbarAb);

			} catch (NumberFormatException e) {
				// TODO - Log-Eintrag erfassen
				LOGGER.error("Fehlermeldung NumberFormatException: " + e);

			} catch (ParseException | DateTimeParseException e) {
				// TODO - Log-Eintrag erfassen
				LOGGER.error("Fehlermeldung ParseException: " + e);

			}
		}

		return produkt;
	}

	/**
	 * Hilfsmethode
	 * 
	 * @param string
	 * @return
	 */
	private static String parseString(String string) {
		return string != null ? string.trim() : "";
	}

	/**
	 * Parst das Datum als LocalDate aus dem �bergebenen String.
	 * 
	 * @param dateAsString
	 * @return
	 * @throws ParseException
	 */
	private static LocalDate parseDate(String dateAsString) throws ParseException {

		if (dateAsString != null && (dateAsString.trim().equals("sofort") || dateAsString.trim().equals(""))) {
			return aktuellesDatum;
		}

		return LocalDate.parse(dateAsString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	}

	/**
	 * Liefert den Inhalt der Datei als Liste mit Textzeilen (String) zur�ck. Bei
	 * dieser Datei handelt es sich um eine einfache Plain-Text Datei (ASCII Datei).
	 * 
	 * @param path
	 * 
	 * @return
	 */

	// TODO - Inhalt der Datei zeilenweise einlesen und als Liste von Strings
	// zurueck
	// geben. Der Name der Quelldatei ist in der Konstante SOURCE_FILE_NAME
	// enthalten. Sollte es Ausnahmen geben, muessen diese in die Log-Datei
	// protokolliert werden.

	private static List<String> readDataFromPlainTextFile(String path) {

		List<String> lines = new ArrayList<>();

		try (BufferedReader bufReader = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = bufReader.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			LOGGER.error("FEHLER_BEIM_EINLESEN_DER_DATEI: " + path, e);
		}
		return lines;
	}

	/**
	 * Speichert die �bergebene Objekte durch Serialisierung.
	 * 
	 * @param produktListe
	 */
	

	// TODO - Alle in der Liste enthaltene Objekte per Serialisierung ablegen. Der
	// Name der Ziel-Datei ist in der Konstante DEST_FILE_NAME enthalten. Sollte es
	// Ausnahmen geben, muessen diese in die Log-Datei protokoliert werden.
	
	private static void saveProduktObjekte(List<Produkt> produktListe) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DEST_FILE_NAME))) {
			oos.writeObject(produktListe);
		} catch (IOException e) {
			// TODO: Log-Eintrag erfassen (FILE_WRITE_ERROR ...)
			LOGGER.error("Fehlermeldung saveProduktObjekte: " + e);
		}
	}

	private static List<Produkt> readProduktObjekte() {
		// TODO - Objekte aus der Datei einlesen (per DeSerialisierung) und zurueck
		// geben.

		return null;
	}
}