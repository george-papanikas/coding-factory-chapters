package gr.aueb.cf.ch6;

/**
 * Updates the elements
 */
public class ReplaceWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9};
        upscaleByOne(arr);
        printArray(arr);
    }

    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1; // διατηρείται η αλλαγή γιατί είναι στο heap
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
