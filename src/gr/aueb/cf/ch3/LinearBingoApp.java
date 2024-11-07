package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearizes if-then-else
 * Αν θέλουμε να ελένξουμε κάτι που θεωρούμε αποτυχία ή error το ελέγχουμε ψηλά και κάνουμε κάτι
 * πχ break η continue
 */
public class LinearBingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET_KEY = 17;
        // boolean bingo = false;
        // while (!=bingo) // το ίδιο γίνεται και με do while
        while (true) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num != SECRET_KEY) {
                System.out.println("Please try again");
                continue;
            }

            System.out.println("Bingo!"); // είναι καλύτερη πρακτική προγραμματισμού να μην έχουμε else
            break; // και να ελέγχουμε στην αρχή την αρνητική εκδοχή
            //bingo = true
        }
    }
}
