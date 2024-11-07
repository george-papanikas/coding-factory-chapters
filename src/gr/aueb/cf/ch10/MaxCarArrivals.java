package gr.aueb.cf.ch10;

import java.util.Arrays;
import java.util.Comparator;

public class MaxCarArrivals {

    public static void main (String[] args) {
        int[][] arr = {{1012, 1056}, {1022, 1050}, {1317, 1417}, {1025, 1325}, {1027, 1200}}; // {00, 01}, {10, 11}, {20, 21}....
        int[][] transformed;

        transformed = transform(arr);
        sortByTime(transformed);

        System.out.println("Max Arrivals: " + getMaxConcurrentCars(transformed));
    }

    public static int[] [] transform(int[][] arr) {
        int[][] transformed = new int [arr.length*2][2];

        for (int i = 0; i < arr.length; i++) {
            transformed[i*2][0] = arr[i][0];
            transformed[i*2][1] = 1;
            transformed[i*2+1][0] = arr[i][1];
            transformed[i*2+1][1] = 0;
        }
        return transformed;
    }

    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));// για τον πινακα α ταξινομηση βασει του α[0]
    }

    public static int getMaxConcurrentCars(int[][] arr) {
        int count = 0;
        int maxCount = 0;

        for (int[] row : arr) {
            if (row[1] == 1) {
                count++;
                if (count > maxCount) maxCount = count;
            } else { //if row[1] == 0
                count--;
            }
        }
        return maxCount;
    }
}
