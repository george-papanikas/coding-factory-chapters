package gr.aueb.cf.ch7;

import java.sql.SQLOutput;

/**
 * Transforms strings.
 */
public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "  Athens Uni   ";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = "";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println("*".repeat(10));

        if (s2.isEmpty()) { // ακόμα και το " " δεν θεωρείται empty αλλά κενός χαρακτήρας
            System.out.println(s2.length());
        }

        if (s2.isBlank()) { // το " " θεωρείται blank οπότε είναι true (περιλαμβάνει και το empty)
            System.out.println("Blank");
        }
    }
}