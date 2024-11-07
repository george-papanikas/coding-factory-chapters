package gr.aueb.cf.ch10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto5App {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("C:/tmp/lotto5in.txt")); //μπορω να διαβασω με τη scanner αρχειο οταν περιεχει primitives
            PrintStream ps = new PrintStream ("C:/tmp/lotto5out.txt", StandardCharsets.UTF_8)) {

            final int LOTTO_SIZE = 5;
            int[] inputNumbers = new int[49];
            int pivot = 0; //δειχνει στην πρωτη ελευθερη (επομενη) θεση μετα το τελευταιο
            int[] result = new int[5];
            int num;
            int window;

            while ((num = in.nextInt()) != -1 && pivot <= 48) {
                inputNumbers[pivot++] = num;
                //pivot++;
            }

            int[] numbers = Arrays.copyOfRange(inputNumbers, 0, pivot); // παει μεχρι το pivot - 1 που αυτο θελουμε
            Arrays.sort(numbers);// η sort κανει ascending ταξινομηση

            // ο πινακας περιεχει pivot στοιχεισ

            window = pivot - LOTTO_SIZE;
            for (int i = 0; i <= window; i++) { // 0 <= 5
                for (int j = i + 1; j <= window + 1; j++) { // 1 <= 6
                    for (int k = j + 1; k <= window + 2; k++) { // 2 <= 7
                        for (int l = k + 1; l <= window + 3; l++) { //3 <= 8
                            for (int m = l + 1; m <= window + 4; m++) { // 4 <= 9
                                result[0] = numbers[i];
                                result[1] = numbers[j];
                                result[2] = numbers[k];
                                result[3] = numbers[l];
                                result[4] = numbers[m];

                                if (isEvenGE(result, 3) && !isOddGE(result,3)) {
                                    System.out.printf("%d %d %d %d %d\n",
                                            result[0], result[1], result[2], result[3],result[4]);
                                }
                            }
                        }
                    }
                }

            }

        } catch (IOException e) { // Βαζω IO που περιλαμβανει το filenotfound
            e.printStackTrace();
        }
    }

    /**
     * Returns true if the number of evens is greater than or equal to a threshold limit.
     *
     * @param arr
     *          the input array
     * @param threshold
     *          the upper limit of the constraint
     * @return
     *          true if the number of evens is greater than or equal to a threshold limit
     */

    public static boolean isEvenGE(int[] arr, int threshold) { // το οριο απο evens (αρτιους)
        int even = 0;

        for (int num : arr) {
            if ((num % 2) == 0) even ++;
        }
        return even > threshold;
    }
    public static boolean isOddGE(int[] arr, int threshold) { // το οριο απο odds (περιττούς)
        int odd = 0;

        for (int num : arr) {
            if ((num % 2) != 0) odd ++;
        }
        return odd > threshold;
    }
}
