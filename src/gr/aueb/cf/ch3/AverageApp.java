package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Bρίσκει τον μέσο όρο της βαθμολογίας
 * ενός μαθητή. Παρέχονται τα total και count.
 */
public class AverageApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;

        System.out.println("Please provide total and count");
        total = in.nextInt();
        count = in.nextInt();

        /*
         * Eλέγχονται στην αρχή οι αρνητικές περιπτώσεις ώστε να μπορούμε να προχωρήσουμε ομαλά
         */

        if (count <= 0 || total < 0) { // Οι σχεσιακοί τελεστές έχουν υψηλότερη προτεραιότητα απο λογικούς άρα δεν χρειαζόμαστε παρενθέσεις
            System.out.println("Invalid count or total");
            System.exit(1); // παίρνει και μια παράμετρο που αν είναι διαφορετική από το μηδέν υποδηλώνει συνθήκη λάθους
            // η system.exit κόβει το πρόγραμμα/ ένα πρόγραμμα τελειώνει ομαλά με system.exit(0)
        }

//        if (total < 0) {
//            System.out.println("Invalid total");
//            System.exit(1)
//        }

        average = total / count;

        if (average > 10) { // θεωρούμε κλίμακα 1-10 ΣΥΝΘΗΚΗ ΛΑΘΟΥΣ
            System.out.println("Invalid average");
            System.exit(1); // πέραν της διακοπής ενημερώνει και το ΛΣ
        }
        /*
         * Πάμε από το ειδικό στο γενικό
         * ΕΙΝΑΙ ΛΑΘΟΣ ΤΟ ΠΑΡΑΚΑΤΩ
         * if (average >= 5) {
            System.out.println("Good");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 9) {
            System.out.println("Excellent");
        } else {
            System.out.println("Fail");
        }
         */
        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) { // Εννοείται ότι το average είναι μικρότερο από 9!!!δεν μπαίνει καν αν είναι πχ 9
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }
        /*
         * Εναλλακτικά, αντί της if..else if μπορούμε να έχουμε την switch case όπως θα δούμε παρακάτω
         */
    }
}
