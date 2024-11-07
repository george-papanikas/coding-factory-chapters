package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει τρεις ακεραίους
 * και βρίσκουμε τον μεγαλύτερο
 */
public class MaxOfThreeInts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three ints");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.printf("Max among %d, %d, %d is %d",
                num1, num2, num2, Math.max(num1,Math.max(num2, num3)));
    }
}
