package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Yπολογίζει το n!
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long facto = 1L;
        int i = 1;
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            facto *= i;
            i++;
        }

        System.out.printf("%d! is equal to %,d", n, facto);
        /*
         * Aν δώσω τιμές πάνω από 20 δημιουργείται υπερχείλιση (overflow) γιατί και το long μπορεί να πάρει έως ένα όριο
         * Αλλιώς φτιάξε μεταβλητή που να ανήκει στη κλαση BigInteger
         */
    }
}
