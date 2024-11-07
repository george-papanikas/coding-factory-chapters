package gr.aueb.cf.ch4;

import java.util.Scanner;

/** Διαβάζει από το stdin το
 * start-value, end-value, step
 * και εκτυπώνει το πλήθος των
 * επαναλήψεων
 */

public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        System.out.printf("Please provide start, end and step values");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.println(i + " ");
        }

        System.out.println("Iterations: " + iterations);
    }
}
