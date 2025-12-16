package ch.hslu.informatik.prg.block10.aufgabe1;

public class Calculator {

	public static int getFactorial(int zahl) throws ArgumentOutOfRangeException {

		if (zahl < 0 || zahl > 19) {
			throw new ArgumentOutOfRangeException("Die Zahl " + zahl + " liegt nicht im Bereich 0 bis 19.");
		}

		if (zahl == 0 || zahl == 1) {
			return 1;
		}

		int result = 1;

		for (int i = 1; i <= zahl; i++) {
			result = result * i;
		}

		return result;
	}
}