package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Prints with PrintStream
 */
// UTF 8 σημαίνει ότι μπορεί να γράφει και ελληνικά και αλλες γλωσσες
// Η PrintStream και PrintWriter μας δίνουν τη δυνατότητα να επιλέξουμε τη κωδικοποίηση των χαρακτήρων που θέλουμε
public class PrintStreamApp {

    public static void main (String[] args) {
        // try with resources δηλ αυτόματα γίνεται autoclose ανεξαρτήτως του αν θα δημιουργηθεί το exception γίνεται ps.close
        // πρέπει βέβαια το resource να είναι autoclosable και το PrintStream στη προκειμένη περίπτωση είνααι autoclosable
        try (PrintStream ps = new PrintStream("C:/tmp/f23.txt", StandardCharsets.UTF_8)) { // can be named with a String or a File και θα γράφει UTF8
            ps.println("Hello Coding Factory. Γεια!!!"); // και η System.out είναι PrintStream
            // γράφω στο αρχείο C:/tmp/f23.txt το οποίο δημιουργήθηκε αυτόματα
        } catch (IOException e) { // αν δεν έχω δώσει σωστά το path για παράδειγμα πρέπει να έχω φάκελο tmp για να φτιαξει το f23.txt
            e.printStackTrace();
        } //finally {
        //ps.close αν δεν είχαμε try with resources
        //}
    }
}
