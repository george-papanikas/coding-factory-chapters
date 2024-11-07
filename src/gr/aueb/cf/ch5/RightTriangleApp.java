package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές double από τον χρήστη, τις a, b, c
 * όπου a είναι η υποτείνουσα και b, c οι δύο πλευρές.
 *
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο δηλ.
 * α^2 == b^2 + c^2
 *
 * Έστω EPSILON = 0.000005 (έξι σημαντικά ψηφία)
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please provide a, b, c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

//        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
//            System.out.println("Triangle is ");
//        } else {
//            System.out.println("not");
//        }
        isRight = Math.abs(a*a - (b*b + c*c)) <= EPSILON;
        System.out.printf("Triangle is right: %b", isRight);
    }
}
