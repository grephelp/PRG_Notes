package ch.hslu.informatik.prg.augabe05;

public class Student extends Person {
    private int matrikelNummer;
    
    public void setMatrikelNummer (int matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }
    
    public int getMatrikelNummer() {
        return matrikelNummer;
    }
}