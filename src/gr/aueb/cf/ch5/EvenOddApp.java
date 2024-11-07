package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Aποφασίζει αν ένας int είναι
 * άρτιος ή περιττός.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
//        boolean isEven = false;

        System.out.println("Please insert an int");
        number = in.nextInt();
//        isEven = isEven(number);

        System.out.printf("Num %d is even: %b",number, isEven(number));
    }

    /**
     * Evaluates an int if it is even or not.
     *
     * @param n     the number (int) to evaluate
     * @return      true, if n is even, false otherwise
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
