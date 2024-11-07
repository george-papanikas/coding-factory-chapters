package gr.aueb.cf.ch1;

/**
 * Προσθέτει δύο ακεραίους
 * και εμφανίζει το αποτέλεσμα
 * στο stdout.
 */
public class AddApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        //System.out.println("The result of " + num1 + ", " + num2 + " is: " + result);
        System.out.printf("The result of %d, %d is %d", num1, num2, result);
        System.out.println();
        System.out.println(add(5, 6));
    }

    /**
     * Adds two ints.
     *
     * @param a  the first int
     * @param b  the second int
     * @return  the sum of a and b
     *
     * @throws
     * @depreciated
     */

    public static int add(int a, int b) {
        return a + b;
    }
}
