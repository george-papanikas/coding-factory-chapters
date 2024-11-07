package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {

    public static void main(String[] args) {
        /* Για να κανει η PrintStream autoflash δεν γινεται να βαλω σαv ορισματα (String s, true) αλλά
         * (new FileOutputStream("C:/tmp/fos.txt"), true) Τo true αναφέρεται στο autoflash
         * H PrintStream τα character δεδομένα txt τα κάνει autoflash ανεξαρτήτως του αν έχω ορίσει autoflash
         * τα βιντεο και τις εικόνες (αμορφοποίητα δεδομένα) δεν τα κάνει autoflush αυτόματα πρέπει να ενεργοποιήσω autoflash
         * O PrintWriter ακόμα και αν έχεις ενεργοποιήσει autoflush μόνο αν κάνεις println τα εμφανίζει άμεσα, αν κάνεις
         * print ακόμα και autoflush να έχω δεν τα εμφαζίζει άμεσα. O PrintWriter δλδ κάνει buffering εκτός και αν κάνω println
         * θα πρέπει να κάνω ρητά flush
         * Μέσα στο FileOutputStream βαζω 2η παραμετρο true για να κάνει append και να μη δημιουργεί κάθε φορά καινούργιο αρχείο
         */
        try (PrintStream ps = new PrintStream (new FileOutputStream("C:/tmp/fos.txt", true), true, StandardCharsets.UTF_8)) {
            ps.println("Καλησπέρα");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
