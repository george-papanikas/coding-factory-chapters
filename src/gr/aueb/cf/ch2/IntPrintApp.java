package gr.aueb.cf.ch2;

import java.util.Arrays;
import java.util.Locale;

public class IntPrintApp {
    public static void main(String[] args) {
        int i = 12;
        int j = 534567987; // μπορώ να γράψω τον αριθμό ως 534_567_987 για readability

        System.out.print(i);// Αυτόματα η Java μετατρέπει τον i σε string για να εκτυπωθεί// Δεν γίνεται αλλαγή γραμμής στην print
        System.out.printf("%d\n", i); // Αλλαγή γραμμής στην printf
        System.out.println(i);

        System.out.printf("%4d\n", i);// αφήνει 2 κενά αφού τα υπόλοιπα 2 τα πιάνει το 12
        System.out.printf("%04d\n", i); // τα 2 κενά τα γεμίζει με μηδενικά
        System.out.printf("%,04d%n", i); // τα 2 κενά τα γεμίζει με μηδενικά και βάζει τελεία για μεγάλους αριθμούς. Σε εσένα κόμμα αφου εχω αγγλικα windows
        //τελεία = διαχ. χιλιάδων
        System.out.printf(Locale.forLanguageTag("el"),"%,04d", j);// Επειδή ο j ξεπερνά τα 4 ψηφία δεν έχει κενά να γεμίσει με 0
        //left padding αν ο αριθμός είναι 2 ψηφία τα υπόλοιπα 2 γεμίζουν με μηδενικά
    }
}
