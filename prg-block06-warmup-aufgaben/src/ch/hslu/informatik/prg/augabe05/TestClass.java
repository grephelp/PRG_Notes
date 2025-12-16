package ch.hslu.informatik.prg.augabe05;

public class TestClass {
    public static void main(String[] args) {
    	
    	
        // Start Teil 1
        Person peter = new Person();
        peter.setName("Peter");
        
        
        Student marco = new Student();
        marco.setName("Marco");
        marco.setMatrikelNummer(5432);
        
        // Zustände der beiden Instanzen anzeigen
        System.out.println("Name: " + peter.getName());
        System.out.println("Name: " + marco.getName() + ", Matr. Nr.: " + marco.getMatrikelNummer());
        // Ende Teil 1
        
        // Start Teil 2
        Person beat = new Student();
        Person roland = new Person();
        // Ende Teil 2
        
        // Start Teil 3
        Person lars = marco;
        Student adrian = (Student) peter;
        // Ende Teil 3
        
        // Start Teil 4
        Person monali = new Person();
        Student vreneli = (Student) monali;
        // Ende Teil 4
    }
}