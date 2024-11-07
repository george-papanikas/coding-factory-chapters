package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Array Populate from file.
 */
public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        /*
         *Δηλώνουμε μια μεταβλητή αρχείου file (reference) και τη συνδέουμε με το φυσικό αρχείο με new
         */
//        File file = new File("C:/tmp/intfile.txt");
        Scanner in = new Scanner (new File("C:/tmp/infile.txt"));
        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextInt();
        }
        for (int grade : grades) { // στο grade δε μπορείς να εκχωρήσεις μόνο να διαβάσεις και να εκτυπώσεις
            System.out.print(grade + " ");
        }
    }
}
