package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Εκτυπώνει ένα πίνακα με τη χρήση μεθόδου.
 */

public class PrintArrayMethod {

    public static void main(String[] args) {
        int[] ages = {19, 25, 34, 42};
        PrintArrayMethod.printArray(ages);
        printArray(ages, 2, 3);

    }
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
// Υπερφορτωμένη μεθόδος
    public static void printArray(int[] arr, int low, int high) {

//        if (arr == null) return;
        if (arr == null || low < 0 || high > arr.length - 1) return;

        for (int i = low; i <= high; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
