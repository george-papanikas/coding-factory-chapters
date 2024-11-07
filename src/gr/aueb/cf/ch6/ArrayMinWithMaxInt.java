package gr.aueb.cf.ch6;

/**
 * Αναζητά το ελάχιστο και μέγιστο
 * στοιχείο ενός πίνακα
 */

public class ArrayMinWithMaxInt {

    public static void main(String[] args) {
        int[] arr = {6, 90, 4, 17};

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i]; // και arr[minPosition] το ίδιο είναι
            }
        }
        System.out.printf("Min value: %d, Min Position: %d", minValue, minPosition + 1); // έβαλα +1 για να είναι πιo user friendly
    }
}

