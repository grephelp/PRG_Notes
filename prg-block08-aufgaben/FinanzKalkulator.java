/**
 * Dieses Interface deklariert die Funktionalitäten, die
 * ein Finanzkalkulator zur Verfügung stellen muss.
 *
 * @author Jordan Sucur
 * @version 1.0
 */
public interface FinanzKalkulator {

    /**
     * Liefert das Endkapital zurück.
     *
     * @param startKapital das Startkapital
     * @param zinssatz     der Zinssatz
     * @param anzahlJahre  die Anzahl Jahre
     * @return das Endkapital
     */
    double berechneEndkapital(double startKapital, double zinssatz, double anzahlJahre);

    /**
     * Liefert den Barwert zurück.
     *
     * @param endKapital  das Endkapital
     * @param zinssatz    der Zinssatz
     * @param anzahlJahre die Anzahl Jahre
     * @return der Barwert
     */
    double berechneBarwert(double endKapital, double zinssatz, double anzahlJahre);

    /**
     * Liefert die Annuität zurück.
     *
     * @param kapital     das Kapital
     * @param zinssatz    der Zinssatz
     * @param anzahlJahre die Anzahl Jahre
     * @return die Annuität (Monatsrate)
     */
    double berechneAnuitaet(double kapital, double zinssatz, double anzahlJahre);

    /**
     * Liefert die Anzahl von Produkteinheiten, die ein Unternehmen
     * verkaufen muss, um seine Kosten zu decken (kein Gewinn, und
     * auch kein Verlust).
     *
     * @param fixeKosten      fixe Kosten, die unabhängig von der
     * Produktionsmenge anfallen (z.B. Miete)
     * @param variableKosten  variable Kosten pro Produkteinheit, die
     * mit jeder verkauften Produkteinheit
     * ansteigen (z.B. Materialkosten)
     * @param preisProEinheit der Verkaufspreis pro Produkteinheit
     * @return die Anzahl von Produkteinheiten
     */
    double berechneBreakEventPunkt(double fixeKosten, double variableKosten, double preisProEinheit);
}
