package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Zητάει από τον χρήστη τρεις ακεραίους,
 * τους μειώνει κατά μία μονάδα και τους
 * εμφανίζει με την ίδια σειρά που δόθηκαν
 * αφήνοντας ένα κενό ανάμεσα τους
 */
public class ThreeNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert 3 integers");
        num1 = scanner.nextInt() - 1;
        num2 = scanner.nextInt() - 1;
        num3 = scanner.nextInt() - 1;

        //num1 = num1 -1;
        //num1 -= 1;
        //num1--;
        //--num;
        //Αυτά αν δεν έκανες -1 τις next.Int

        System.out.printf("%d %d %d", num1, num2, num3);
        //System.out.printf("%d %d %d", --num1, --num2, --num3);
        //System.out.printf("%d %d %d", num1 - 1, num2 - 1, num3 - 1);
        //System.out.printf("%d %d %d", num1--, num2--, num3--);δε μας κάνει γιατι πρώτα εμφανίζει και μετά μειώνει
    }
}
