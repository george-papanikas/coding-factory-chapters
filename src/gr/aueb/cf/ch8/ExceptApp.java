package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Demostrates the usage of Exceptions.
 */
public class ExceptApp {

//    public static void main(String[] args) throws IOException {        1oς ΤΡΟΠΟΣ ΧΕΙΡΙΣΜΟΥ EXCEPTION
//        int ch = System.in.read();
//    }
//    public static void main(String[] args) {                           2oς ΤΡΟΠΟΣ
//        try {
//            int ch = System.in.read();
//        } catch (IOException ex) {
//                                      // StdErr: Stdout τύπου αλλά εκτυπώνει σε κόκκινα γράμματα ειδική ροή για λάθη
//            ex.printStackTrace();
//        }
//
//    }
    /* Main's aim is to inform user that an exception has occurred.
     * Rollback, Logging and throw are not duties of Main
     */
    public static void main(String[] args) {
        int ch;

        try {
            ch = getNextChar();
            System.out.println(ch);
        } catch (IOException e) {
            System.out.println("Error in I/O");
        }

    }
    public static int getNextChar() throws IOException {
        int ch = ' '; // τα ' ' μετατρέπουν αυτό που υπάρχει μέσα σε ακέραιο ordinal number του κενού
//        char ch = ' '; εναλλάκτικά θα το έκανα έτσι αλλά θα έπρεπε να κάνω typecast παρακάτω σε char καθως η read διαβάζει int

        try {
             ch = System.in.read();
        } catch (IOException ex) {
            // 1. Rollback (αν χρειάζεται)
            // 2. Logging
            ex.printStackTrace();

            // Rethrow για να ενημερωθεί η main
            throw ex;
        }
        return ch;
    }



}

