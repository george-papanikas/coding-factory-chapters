package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Διαβάζει έναν char με την
 * System.in.read()
 */
public class CharInputApp {

    public static void main(String[] args) throws IOException { // γιατί η read είναι χαμηλού επιπέδου και υπάρχει κίνδ λάθους
        char inputChar;

        System.out.println("Please insert an ASCII char");
        // η read διαβάζει 1 byte οπότε μέχρι τόσο μπορώ να δώσω αλλιώς δεν θα διαβάσει πχ αν δώσω surrogate ή smiley
        inputChar = (char) System.in.read(); // κάνω typecast γιατί η read επιστρέφει το ordinal number ως int

        System.out.println("char: " + inputChar);

    }
}
