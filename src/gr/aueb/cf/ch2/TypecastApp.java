package gr.aueb.cf.ch2;

public class TypecastApp {
    public static void main(String[] args) {
        long result = 0L;
        int num1 = 10; // η java θεωρεί όλα τα literals ως int οπότε δεν υπάρχει λόγος typecast
        long num2 = 20L;
        /*
         * αυτό γίνεται αυτόματα (έχει performance cost), ωστόαο αν θέλουμε να βοηθήσουμε
         * τον σημασιολογικό αναλυτή βάζουμε type suffix το L για βελτιστοποίση της εκχώρησης
         * εκτελείται πιο γρήγορα το άμεσο typecast (όταν πχ βάζω suffix) από το έμμεσο που κάνει μόνος του ο σημ. αναλυτής
         * και ο optimizer. Πέραν των 2 αυτών έχει και τον λεκτικό και συντακτικό αναλυτή ο compiler.
         */
        num1 = (int) num2;
        /* Εδώ κάνουμε απαραιτήτως typecast καθώς δεν
         * γίνεται αυτόματα (Έχουμε απώλεια πληροφορίας). Τα typecast είναι error prone
         */

        result = num1 + num2; //Aν ήταν num2 int δεν θα υπήρχε θέμα καθώς το δεξιό μέλος ως int δεν ξεπερνά το όριο

        System.out.printf("%d", result);





    }
}
