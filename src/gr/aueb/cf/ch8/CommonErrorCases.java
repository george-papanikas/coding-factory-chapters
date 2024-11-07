package gr.aueb.cf.ch8;

import java.util.SortedMap;

public class CommonErrorCases {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0};
        int minPosition = getMinPosition(arr);

        if (getMinPosition(arr) == -1) {
            System.out.println("Invalid Array");
        } else {
            System.out.println("Min Position is " + minPosition + 1);
        }
    }
    public static int getMinPosition (int[] arr) {
        if (arr == null) return -1; // common error case γλυτώνω την try catch

        int minPosition = 0;
        int minValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static String getStringOrNull (String[] strArr, String str) {
        if (strArr == null || str == null) return null;
        String strToReturn = null;

        for (String s: strArr) {
            if (s.contains(str)) {
                strToReturn = s;
            }
        }
        return strToReturn;
    }
}
