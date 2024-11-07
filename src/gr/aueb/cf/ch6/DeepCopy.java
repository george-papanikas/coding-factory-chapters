package gr.aueb.cf.ch6;

/**
 * Makes a deep copy of an array.
 */
public class DeepCopy {
    public static void main (String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length]; // αρχικοποιώ με ένα καινούργιο χώρο (default τιμές 0)

        // Deep copy
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int item : arr2) {
            System.out.print(item + " ");
       }
    }
}
