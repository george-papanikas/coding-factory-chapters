package gr.aueb.cf.ch2;

/**
 * Διαβάζει από το std input (πληκτρολόγιο)
 * δύο ακεραίους και τους προσθέτει.
 */

import java.util.Scanner;//Εισάγεται αυτόματα βάζοντας την Scanner
public class ScannerApp { // H μόνη κλάση που διαβάζει primitives, αγνοεί enter space tabs

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num1, sum = 0; // είναι πιο σωστή πρακτική προγραμματισμού να αρχικοποιώ
        int num2 = 0; // αρχικοπ6οιώ με ουδέτερους αριθμούς το 0 για πρόσθεση το 1 για πολ/μό

        //Εντολές
        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d + %d = %d", num1, num2, sum);



    }
}
