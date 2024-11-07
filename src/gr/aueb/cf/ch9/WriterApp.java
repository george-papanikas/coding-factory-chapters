package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream; // πιο γενικό γράφει και raw data και txt
import java.io.PrintWriter; // για κείμενα και txt πιο εξειδικευμένο
// αν πάμε να γράψουμε κάτι και βλέπουμε ότι δεν το γράφει μπορεί να φταιει οτι δεν εχουμε κανει flush
public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/test1.txt");
             PrintWriter pw = new PrintWriter("C:/tmp/test2.txt")) {
            ps.println("Hello CF! from print stream");
            pw.println("Hello CF from print writer");
            pw.flush(); // δεν περιμένει να γεμίσει ο buffer τα γράφει απευθείας
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}
