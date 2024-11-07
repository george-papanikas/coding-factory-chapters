package gr.aueb.cf.ch2;

import java.util.Arrays;
import java.util.Locale;

/**
 * Εμφανίζει τους τύπους δεδομένων
 * ακεραίων, το μέγεθος, και τα
 * ΜΙΝ - MAX values
 */

public class IntTypesApp {
    public static void main(String[] args) {

        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Integer.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Byte.TYPE, Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Short.TYPE, Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d",
                Long.TYPE, Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
