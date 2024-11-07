package gr.aueb.cf.ch8;

/**
 * Το IO Exception που είναι υπερκλάση του FileNotFound Exception μπορεί να χρησιμοποιηθεί στη catch αλλά δεν
 * μας δίνει ξεκάθαρο μήνυμα στο ως προς το ποιο exception προκαλείται οπότε βάζουμε 2η catch με το FileNotFound Exception
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random-file.txt");
        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException e) { // πάω από το ειδικό στο γενικό για να μην μου το κοκκινίσει
            //e.printStackTrace(); // μπορώ με το (ή) | να έχω και άλλα exceptions
            System.out.println ("File Not Found Exception");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Read Error");
        } catch (Exception e) {
            System.out.println("Ooops something went wrong!"); // δεν χρειάζεται απλά για να δείξω τη προς γενικό κατεύθυνση
        }
    }
}
