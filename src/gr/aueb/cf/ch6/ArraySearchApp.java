package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET = 12;
        int [] arr = {1, 5, 9, 3, 12};
        boolean secretIsFound = false;

        for (int item : arr) { // διασχίζουμε όλον τον πίνακα
            if (item == SECRET) {
                secretIsFound = true;
                System.out.println ("Secret Key was found");
                break;
            }
        }

//        for (int i = 0; i <arr.length; i++) { // διασχίζουμε όλον τον πίνακα
//            if (arr[i] == SECRET) {
//                secretIsFound = true;
//                System.out.println ("Secret Key was found");
//                break;
//            }
//        }

        if (!secretIsFound) {
            System.out.println ("Secret key was not found");
        }
    }
}
