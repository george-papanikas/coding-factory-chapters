package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 *  Iteratively presents a multi-choice menu.
 *  The users select a choice and get feedback.
 *  Q/q is quit.
 */
public class ProjectCh3 {
    static Scanner in = new Scanner(System.in);
//    static boolean quit = false;

    public static void main(String[] args) { // η main παιζει ρολο τροχονομου
        boolean quit = false;
        String response = "";
        do {
            printMenu();
            response = getChoice();
            if (response.matches("[Qq]")) { //η matches ειναι σαν την equals με τη διαφορά οτι δέχεται regular expressions
                // το [Qq] σημαίνει Q ή q
                quit = true;
            } else {
                try {
                    printOnChoice(response);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Choice");
                }
            }
        }while (!quit);
    }

    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Select");
        System.out.println("Q or q to quit");
    }

    public static String getChoice() {
        return in.nextLine().trim(); // αν ο χρήστης δώσει κενά καταλάθος τα τριμάρω
    }

    public static void printOnChoice(String s) throws IllegalArgumentException { // δεχεται string και το μετατρεπει σε int
        //int choice = -1; // εστω οτι αρχικα δεν εχει καποιο valid choice
        // τα runtime exceptions δεν ειναι υποχρεωτικο να τα κάνεις rethrow στη main το καταλαβαίνει

        try {
//            if (s.matches("[Qq]")) { //η matches ειναι σαν την equals με τη διαφορά οτι δέχεται regular expressions
//                // το [Qq] σημαίνει Q ή q
//                quit = true;
//            }
            if (s == null) throw new IllegalArgumentException();
            int choice = Integer.parseInt(s);

            switch (choice) { // τωρα ξέρουμε ότι το choice είναι ένας integer (όχι null)
                case 1:
                    System.out.println("Inserted");
                    break;
                case 2:
                    System.out.println("Updated");
                    break;
                case 3:
                    System.out.println("Deleted");
                    break;
                case 4:
                    System.out.println("Selected");
                    break;
                default:
                    throw new IllegalArgumentException(); // σαν return διακοπτει το προγραμμα
            }
        } catch (IllegalArgumentException e) { // είναι runtime exception αλλά μπορεί να κάνει recover οταν δωθει εγκυρη τιμη
            e.printStackTrace();// κανει login στο std err IllegalArgumentException υπερκλαση του NumberFormatException
            throw e; //rethrow
        }
    }
}
/*
 * τοποθετώ τον Scanner σε επίπεδο κλασης (global μεταβλητη για να μπορει να διαβαστει από ολες τις μεθοδους.
 * αν τον εβαζα στη main θα ταν τοπικη μεταβλητη της main.  Οι static μεθοδοι μπορούν να καλέσουν μόνο static
 * μεθόδους και να χρησιμοποιήσουν μόνο static μεταβλητές
 */
