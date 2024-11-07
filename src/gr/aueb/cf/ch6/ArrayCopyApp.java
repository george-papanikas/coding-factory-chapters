package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * makes an array copy by using
 * utility methods - Deep Copies through both ways
 */
public class ArrayCopyApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        int[] arr3;

        // System.arraycopy() // πρέπει να έχεις αρχικοποιήσει τον πίνακα και γενικά δεν είναι ευέλικτη
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        for (int item : arr2) {
            System.out.print(item + " ");
        }

        System.out.println(" ");

        // Arrays class
        arr3 = Arrays.copyOf(arr, arr.length);
        arr3 = Arrays.copyOfRange(arr, 0, arr.length); // πιο ευέλικτη σου βάζει και αρχή 0 στη προκειμένη
        for (int item : arr3) {
            System.out.print(item + " ");
        }
    }
}