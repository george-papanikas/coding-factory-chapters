package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Recursive n!
 */
public class FactorialRecursiveApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert n to calculate n!");
        int n = in.nextInt();
        System.out.println(facto(n));
    }

    /**
     * Recursive solution of n!
     *
     * @param n    n of n!
     * @return     n!
     */

    public static int facto (int n) {
        if (n <= 1) return 1;
        return n* facto(n-1); // τα semantics είναι πιο κατανοητά εδώ σε σχέση με τη for

        // return (n <= 1) ? 1 : n * facto(n-1)
    }
// σε κάποιες περιπτώσεις δεν μπορείς να γράψεις επαναληπτική μέθοδο είναι αρκετά πολύπλοκη πχ στα δέντρα, η αναδρομή μονόδρομος είναι
}
