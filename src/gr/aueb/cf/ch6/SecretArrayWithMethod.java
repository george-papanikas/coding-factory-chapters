package gr.aueb.cf.ch6;

/**
 * Αναζητά ένα στοιχείο σε ένα πίνακα
 */
public class SecretArrayWithMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int value = 6;
        int position = 0;
        position = getElementPosition (arr, value);
        System.out.println(position);
    }

    /**
     * Επιστρέφει το index του στοιχείου που αναζητά
     * ή αν δεν το βρει επιστρέφει -1
     * @param arr the input array
     * @param value the value we search for
     * @return the index if the value is found, -1 in case is not found
     */

    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == value) return i;
//        }
//        return -1;

        // καλύτερη λύση που έχει μόνο μία return για περιπτώσεις αποσφαλμάτωσης
        int position = -1;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == value) {
                position = i;
                break;
            }
        }
        return position;
    }
}
