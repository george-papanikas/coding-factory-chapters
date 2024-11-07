package gr.aueb.cf.ch10;

/**
 * Assume an array: {1,2,4,4,4,6,7,8,8,8,9,9}.
 * The app returns the low and high index for a key (integer key)
 * that is included into the array. if the key was the algorithm
 * should return {7,9} or {8, 10} if we make a tiny user-friendly optimization
 */

public class Ch6LowAndHighIndexApp {

//    static final int key = 8; ΔΙΚΑ ΜΟΥ
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,4,4,4,6,7,8,8,8,9,9};
        final int key = 8;
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {}; // Είναι πιο ορθό να επιστρέφεις σαν error code κενό πίνακα αντί για null
        //αποφεύγεις και null pointer exception

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        high = low;
        pivot = low + 1;
        while (pivot < arr.length && arr[pivot++] == key) { // πρωτα ελεγχεται pivot == key και μετα γίνεται ++ post increment
            high++;
        }
        return new int[] {low, high};
    }



//    public static void getIndexesOfKey (int[] p) { ΔΙΚΑ ΜΟΥ
//        int low = 0;
//        int high = 0;
//        for (int i = 0; i <= p.length - 1; i++) {
//            if (p[i] == key) {
//                low = i;
//                break;
//            }
//        }
//        for (int i = p.length - 1; i > low; i--) {
//            if (p[i] == key) {
//                high = i;
//                break;
//            }
//        }
//        System.out.println("low is " + low + "high is " + high);
//    }
}
