package gr.aueb.cf.ch2;

/**
 * Overflow
 */
public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εμφάνιση αποτελεσμάτων
        System.out.println("Sum: " + result);

    }
}
