package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * keeps reading until a sentinel value is provided
 * H while χρησιμοποιείται εδώ που δεν ξέρουμε τον συγκεκριμένο αριθμό των επαναλήψεων αλλά
 * περιμένουμε ένα κόμβο φρουρό sentinel ώστε να σταματήσει.
 */
public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a num");
        num = in.nextInt();

        while (num != 0){ // Το μηδέν είναι το sentinel (φρουρός)
//            System.out.println(num);
            iterations++;
            System.out.println("Please provide a num");
            num = in.nextInt();
        }

        System.out.printf("%d iterations ", iterations);// τα loops που κάνει
    }
}
