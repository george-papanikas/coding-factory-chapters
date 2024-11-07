package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * Print stars
 */
public class ProjectCh5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String response = "";
        do {
            printMenu();
            response = getChoice();

            try {
                if (response.matches("[Qq]")) {
                    quit = true;
                } else {
                    printOnChoice(response);
                }
            }catch (IllegalArgumentException e) {
                    System.out.println("Invalid Choice");
            }
        }while (!quit);
//        printStarsH(5);
//        printStarsV(5);
//        printStarsHV(5);
//        printStarsHVAsc(5);
//        printStarsHVDesc (5);

    }

    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Horizontal Stars");
        System.out.println("2. Vertical Stars");
        System.out.println("3. HV Stars");
        System.out.println("4. HV Desc Stars");
        System.out.println("5. HV Asc Stars");
        System.out.println("Q or q to quit");
    }

    public static String getChoice() {
        return in.nextLine().trim(); // αν ο χρήστης δώσει κενά καταλάθος τα τριμάρω
    }

    public static void printOnChoice(String s) throws IllegalArgumentException {
        int choice = -1;
        int stars = 0; // πρέπει να δηλωθεί έξω από if και try

        try {
            if (s == null) throw new IllegalArgumentException();
            choice = Integer.parseInt(s);
            if (choice >= 1 && choice <= 5) {
                System.out.println("Please insert the number of stars");
                stars = Integer.parseInt(getChoice());
            }

            switch (choice) { // τωρα ξέρουμε ότι το choice είναι ένας integer (όχι null)
                case 1:
                    printStarsH(stars);
                    break;
                case 2:
                    printStarsV(stars);
                    break;
                case 3:
                    printStarsHV(stars);
                    break;
                case 4:
                    printStarsHVDesc(stars);
                    break;
                case 5:
                    printStarsHVAsc(stars);
                    break;
                default:
                    throw new IllegalArgumentException(); // σαν return διακοπτει το προγραμμα
            }
        } catch (IllegalArgumentException e) { // είναι runtime exception αλλά μπορεί να κάνει recover οταν δωθει εγκυρη τιμη
            e.printStackTrace();// κανει login στο std err IllegalArgumentException υπερκλαση του NumberFormatException
            throw e; //rethrow
        }
    }

    public static void printStarsH(int n) { // Horizontal
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void printStarsV(int n) { // Vertically
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsHV(int n) { // Horizontally & Vertically
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    public static void printStarsHVDesc (int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printStarsHVAsc (int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }

    }
}
