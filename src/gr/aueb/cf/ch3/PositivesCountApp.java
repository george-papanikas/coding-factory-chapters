package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Mετράει το πλήθος των θετικών αριθμών
 * που δίνει ο χρήστης.
 */
public class PositivesCountApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please give a number (int)");
        num = in.nextInt();

        while(num >= 0) {
            // positivesCount += 1;
            positivesCount++;
            System.out.println("Please insert another number (int)");
            num = in.nextInt();
        }
        System.out.println("The number of positives given is " + positivesCount);
    }
}
