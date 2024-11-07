package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το α^n αναδρομικά
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide base and power");
        float a = in.nextFloat();
        float b = in.nextFloat();
        System.out.println(a + "^" + b + " = " + power(a, b));
    }

    /**
     * Recursive a^n
     *
     * @param a     the base
     * @param n     the power
     * @return      the power of a
     */
    public static float power (float a, float n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / (a * power(a, Math.abs(n)-1));
        return a * power(a, n-1);
    }
}
