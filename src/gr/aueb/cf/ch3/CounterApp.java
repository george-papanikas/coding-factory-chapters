package gr.aueb.cf.ch3;

/**
 * Eκτελεί ένα συγκεκριμένο αριθμό επαναλήψεων.
 * H while κανονικά δε χρησιμοποιείται όταν έχουμε συγκεκριμένο αριθμό επαναλήψεων
 * αλλά τεχνικά δεν είναι θέμα. Σε αυτές τις περιπτώσεις χρησιμοποιούμε τη for.
 */
public class CounterApp {

    public static void main(String[] args) {
        int i = 0; // start value = 0

        while (i <= 10) { // end value = 10
            System.out.println("*");
            i++; // step=1
        }
    }
}
