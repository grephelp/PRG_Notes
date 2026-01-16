public class FinanzKalkulatorImpl implements FinanzKalkulator {
	
	private double startKapital;
	private double zinssatz;
	private double anzahlJahre;
	private double endKapital;
	private double kapital; 
	private double fixeKosten; 
	private double variableKosten; 
	private double preisProEinheit;
	
	
	public FinanzKalkulatorImpl() {
	}
	
	public FinanzKalkulatorImpl(double startKapital, double zinssatz, double anzahlJahre, double endKapital, double kapital, double fixeKosten, double variableKosten, double preisProEinheit) {
		this.startKapital = startKapital;
		this.zinssatz = zinssatz; 
		this.anzahlJahre = anzahlJahre;
		this.endKapital = endKapital; 
		this.kapital = kapital;
		this.fixeKosten = fixeKosten; 
		this.variableKosten = variableKosten;
		this.preisProEinheit = preisProEinheit; 
	}
	
	public void setStartKapital(double startKapital) {
		this.startKapital = startKapital; 
	}
	
	public double getStartKapital() {
		return startKapital; 
	}
	
	public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setAnzahlJahre(double anzahlJahre) {
        this.anzahlJahre = anzahlJahre;
    }

    public double getAnzahlJahre() {
        return anzahlJahre;
    }

    public void setEndKapital(double endKapital) {
        this.endKapital = endKapital;
    }

    public double getEndKapital() {
        return endKapital;
    }

    public void setKapital(double kapital) {
        this.kapital = kapital;
    }

    public double getKapital() {
        return kapital;
    }

    public void setFixeKosten(double fixeKosten) {
        this.fixeKosten = fixeKosten;
    }

    public double getFixeKosten() {
        return fixeKosten;
    }

    public void setVariableKosten(double variableKosten) {
        this.variableKosten = variableKosten;
    }

    public double getVariableKosten() {
        return variableKosten;
    }

    public void setPreisProEinheit(double preisProEinheit) {
        this.preisProEinheit = preisProEinheit;
    }

    public double getPreisProEinheit() {
        return preisProEinheit;
    }
	
	public double berechneEndkapital(double startKapital, double zinssatz, double anzahlJahre) {
		double berechnetesEndKaptial = 0; 
		berechnetesEndKaptial = (startKapital*(Math.pow((1 + (zinssatz/100)), anzahlJahre))); 
		return berechnetesEndKaptial; 
	}
	
	
	public double berechneBarwert(double endKapital, double zinssatz, double anzahlJahre) {
		double berechneterBarWert = 0; 
		berechneterBarWert = (endKapital / (Math.pow(1+(zinssatz/100),anzahlJahre))); 
		return berechneterBarWert;
	}
	
	
	
	public double berechneAnuitaet(double kapital, double zinssatz, double anzahlJahre) {
		double berechnungAnuitaet = 0;
		berechnungAnuitaet = (kapital * ((zinssatz/100)/(1 - (Math.pow(1 + (zinssatz/100), - anzahlJahre))))); 
		return berechnungAnuitaet;
	}
	
	
	public double berechneBreakEventPunkt(double fixeKosten, double variableKosten, double preisProEinheit) {
		double berechnungBreakEvenPoint = 0; 
		berechnungBreakEvenPoint = (fixeKosten/(variableKosten - preisProEinheit)); 
		return berechnungBreakEvenPoint;		
	}
	
	
}
