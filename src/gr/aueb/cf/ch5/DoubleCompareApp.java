package gr.aueb.cf.ch5;

import java.util.Scanner;

public class DoubleCompareApp {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        double d1 = 0.995;
        double d2 = 1.001;
        final double EPSILON = 0.005;

        System.out.printf("Please insert two doubles");
        //d1 = in.nextDouble();
        //d2 = in.nextDouble();

        if (Math.abs(d2 - d1) <= EPSILON) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
