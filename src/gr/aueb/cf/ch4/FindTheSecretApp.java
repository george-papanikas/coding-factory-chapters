package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * O χρήστης έχει 10 ευκαιρίες για να βρει
 * ένα μυστικό κλειδί (int). Aν το βρει
 * νωρίτερα από τη 10η φορά, η for θα πρέπει
 * να σταματήσει (υπονοείται η break)
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12; // θα μπορούσε να γίνει και με random
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please make a guess");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }

        if (!found) { // θα μπορούσε να γίνει και με else
            System.out.println("No worries, play again");// είναι πρέπον να ελέγχεται η συνθήκη λάθους πιο μπροστά όπως εδώ είναι πιο εύκολο το testing
            System.exit(1); // σε πετάει τελείως έξω από το πρόγραμμα
        }
        System.out.println("Success! Play again!");
    }


}

