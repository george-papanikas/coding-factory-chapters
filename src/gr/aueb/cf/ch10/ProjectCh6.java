package gr.aueb.cf.ch10;

/**
 * Finds the position in an array of the max element
 * of the array.
 */
public class ProjectCh6 {

    public static void main (String[] args) {
        int[] ppp = new int[] {1, 2, 6, 8, 14, 9};
        int maxPos = getMaxPosition(ppp, 0, ppp.length - 1);
        if (maxPos == -1) {
            System.out.println("Error");
            System.exit(1);
        }

        System.out.printf("Position %d, Value %d", maxPos, ppp[maxPos]);

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue = 0;

        if (arr == null || arr.length == 0 || low > high || low < 0 | high > arr.length - 1) {
            return -1;
        }

        maxValue = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        System.out.println("maxPosition of maxValue is " + maxPosition); // περιττο
        return maxPosition;
//        System.out.println("maxPosition of maxValue is " + maxPosition); UNREACHABLE
    }
}
