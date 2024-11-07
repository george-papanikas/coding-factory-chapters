package gr.aueb.cf.ch6;

/**
 * Makes a shallow copy of an array.
 */
public class ShallowCopy {
    public static void main (String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2;

        // Shallow copy
        arr2 = arr1;

        arr2[0] = 222;

        for (int item : arr1) {
            System.out.print(item + " ");
        }
    }
}
