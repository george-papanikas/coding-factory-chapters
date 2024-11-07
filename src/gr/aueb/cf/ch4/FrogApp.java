package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στη θέση Χ και θέλει να φτάσει στη θέση Υ (ή σε θέση > Υ).
 * Ο frog jumps α fixed distance, D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει να κάνει
 * ώστε να φτάσει ή να ξεπεράσει το στόχο.
 *
 *Για παράδειγμαμ, αν έχουμε:
 * X = 10
 * Y = 85
 * D = 30
 *
 *τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10, και μετά το 1ο jump πάει στη θέση 10 + 30 = 40
 * Στο 2ο jump, πάει 40 + 30 = 70
 * Και στο 3ο jump, πάει 70 + 30 = 100
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int jump = 0;
        int counterOfJumps = 0;

        System.out.println("Please provide x, y and jump");
        x = in.nextInt();
        y = in.nextInt();
        jump = in.nextInt();

//        if (x >= y) { δική μου προσθήκη
//            System.out.println("There is no need for jump, jumps:" + counterOfJumps);
//            System.exit(1);
//        }

        counterOfJumps = (int) Math.ceil((y-x) / (double) jump);
        /*
         * H Math.ceil (επιστρέφει αριθμό στρογγυλοποιημένο προς τα πάνω) επιστρέφει double για αυτό κάνω typecast
         * Eπίσης, βάζοντας double μέσα στη παράσταση γίνονται όλοι οι τελεστέοι double για ακριβέστερο αποτέλεσμα
         */

        System.out.println("Minimum number of jumps is: " + counterOfJumps);
    }
}
