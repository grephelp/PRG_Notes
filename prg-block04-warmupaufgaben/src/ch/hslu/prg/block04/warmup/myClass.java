package ch.hslu.prg.block04.warmup;

public class myClass {

    public static void show(String message) {
    	System.out.println("Das ist die Nachricht " + message);
    }

    public static void show(String message, double value) {
        System.out.println("Das ist die Nachricht 2 " + message + " mit der Zahl " + value);
    }

    public static void show(String message, int[] arr) {
        System.out.println("Der Array enthält " + arr.length + " Elemente. Das erste Element ist " + arr[0]);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}