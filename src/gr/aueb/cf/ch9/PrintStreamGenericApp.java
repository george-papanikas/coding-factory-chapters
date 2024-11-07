package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException { // για να μη γράφω try catch
        PrintStream ps = new PrintStream("C:/tmp/cf.txt");

        // τυπώνει στο αρχείο C:/tmp/cf.txt
        printMessage(ps, "Hello World");

        // τυπώνει στην οθόνη (κονσόλα)
        printMessage(System.out, "Hello Coding Factory"); // η System.out είναι PrintStream
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
