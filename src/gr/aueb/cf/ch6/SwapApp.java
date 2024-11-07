package gr.aueb.cf.ch6;

public class SwapApp {
    public static void main(String[] args) {
        int[] ages = {1, 10};
        for (int item : ages) {
            System.out.print(item + " ");
        }

        swap(ages);
        System.out.println();

        for (int item : ages) {
            System.out.print(item + " ");
        }

    }

    public static void swap (int[] arr) {
        if (arr == null || arr.length != 2) return; // we want array to contain only two positions / return interrupts method due to error condition
// τύπου break
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

}