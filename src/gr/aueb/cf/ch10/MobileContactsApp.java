package gr.aueb.cf.ch10;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MobileContactsApp {

    final static Scanner in = new Scanner (System.in);
    final static String[][] contacts = new String[500][3]; // global scope το final αφορα το reference ωστε να μην αλλαξει και γινει new αργοτερα
    static int pivot = -1; // δειχνει στη τελευταια εγγραφη οχι μια θεση μετα οπως πριν αρχικα ειναι στο -1 που σημαινει οτι ειναι αδειος
    final static Path path = Paths.get("C:/tmp/log-mobile.txt"); // η Paths utility κλαση της Path final δες παραπανω
    // στα refs σε ανιτιθεση με τους primitives δεν χρειαζομαι κεφαλαια ουταν εχω final

    public static void main(String[] args) {
        boolean quit = false;
        String s;
        int choice;
        String phoneNumber;

        do {
            printMenu();
            s = getChoice();
            if (s.matches("[Qq]")) quit = true;
            else {
                try {
                    choice = Integer.parseInt(s);
                    if (!isValid(choice)) {
                        throw new IllegalArgumentException("Error - Choice must be between 1 - 5");
                    }

                    switch (choice) {
                        case 1:
                            printContactMenu();
                            insertController(getFirstName(), getLastname(), getPhoneNumber());
                            System.out.println("Επιτυχής εισαγωγή");
                            break;
                        case 2:
                            phoneNumber = getPhoneNumber();
                            deleteController(phoneNumber);
                            System.out.println("Επιτυχής διαγραφή");
                            break;
                        case 3:
                            phoneNumber = getPhoneNumber();
                            printContactMenu();
                            updateController(phoneNumber, getFirstName(), getLastname(), getPhoneNumber());
                            System.out.println("Επιτυχής ενημέρωση");
                            break;
                        case 4:
                            phoneNumber = getPhoneNumber();
                            String[] contact = getOneController(phoneNumber);
                            printContact(contact);
                            break;
                        case 5:
                            String[][] allContacts = getAllContactsController();
                            printAllContacts(allContacts);
                            break;
                        default:
                            throw new IllegalArgumentException("Bad Choice");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage()); // η getMessage() εμφανιζει τα μηνυματα π εχουμε γραψει μεσα στα exception
                }
            }
        } while (!quit);
    }

    public static void printContact(String[] contact) {
        for (String s : contact) {
            System.out.print(s + " ");
        }
    }

    public static void printAllContacts (String[][] contacts) {
        for (String[] contact : contacts) {
            printContact(contact);
        }
    }

    public static boolean isValid (int choice) {
        return (choice >= 1 && choice <= 5);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Εισαγωγή επαφής");
        System.out.println("2. Διαγραφή επαφής");
        System.out.println("3. Ενημέρωση επαφής");
        System.out.println("4. Αναζήτηση επαφής");
        System.out.println("5. Εκτύπωση ολων των επαφών");
        System.out.println("Q/q. Έξοδος");
    }

    public static String getChoice() {
        System.out.println("Εισάγετε επιλογή");
        return in.nextLine().trim();
    }

    public static void printContactMenu() {
        System.out.println("Εισάγετε Όνομα, Επώνυμο, και Τηλέφωνο");
    }

    public static String getFirstName() {
        System.out.println("Eισάγετε όνομα");
        return in.nextLine().trim();
    }

    public static String getLastname() {
        System.out.println("Eισάγετε επώνυμο");
        return in.nextLine().trim();
    }

    public static String getPhoneNumber() {
        System.out.println("Eισάγετε αριθμό τηλεφώνου");
        return in.nextLine().trim();
    }

    /*
     * Controllers
     */

    public static void insertController (String firstname, String lastname, String phoneNumber) {
        try {
            // Validations
            if (firstname == null || lastname == null || phoneNumber == null) {
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if (firstname.length() < 2 || firstname.length() > 50 ) {
                throw new IllegalArgumentException("Firstname is not valid");
            }

            if (lastname.length() < 2 || lastname.length() > 50 ) {
                throw new IllegalArgumentException("Lastname is not valid");
            }

            if (phoneNumber.length() < 2 || phoneNumber.length() > 12 ) {
                throw new IllegalArgumentException("Phonenumber is not valid");
            }
            // Call the service layer
            insertContactService (firstname.trim(), lastname.trim(), phoneNumber.trim());

        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static void updateController (String oldPhoneNumber, String firstname,
                                         String lastname, String newPhoneNumber) {
        try {
            // Validations
            if (firstname == null || lastname == null || newPhoneNumber == null || oldPhoneNumber == null)  {
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if (oldPhoneNumber.length() < 2 || oldPhoneNumber.length() > 12 ) {
                throw new IllegalArgumentException("Old phone number is not valid");
            }

            if (firstname.length() < 2 || firstname.length() > 50 ) {
                throw new IllegalArgumentException("Firstname is not valid");
            }

            if (lastname.length() < 2 || lastname.length() > 50 ) {
                throw new IllegalArgumentException("Lastname is not valid");
            }

            if (newPhoneNumber.length() < 2 || newPhoneNumber.length() > 12 ) {
                throw new IllegalArgumentException("New phone number is not valid");
            }
            // Call the service layer
            updateContactService(oldPhoneNumber.trim(), firstname.trim(), lastname.trim(), newPhoneNumber.trim());

        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static String[] deleteController (String phoneNumber) {
        try {
            if (phoneNumber.length() < 2 || phoneNumber.length() > 12) {
                throw new IllegalArgumentException("Phone number is not valid");
            }
            return deleteContactService(phoneNumber);
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static String[] getOneController (String phoneNumber) {
        try {
            if (phoneNumber.length() < 2 || phoneNumber.length() > 12) {
                throw new IllegalArgumentException("Phone number is not valid");
            }
            return getOneContactService(phoneNumber);
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }

    }

    public static String[][] getAllContactsController() {
        try {
            return getAllContacts();
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    /*
     * Service Layer
     */

    public static String[] getOneContactService (String phoneNumber) {
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Contact not found"); // μπορω να περασω και strings στα exceptions
            }
            return contact;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static String[][] getAllContactsService() { // δεν χρειαζεται να γινει throw γιατι εννοειται αφου ειανι runtime exception
        try {
            String[][] contactsList = getAllContacts();
            if (contactsList.length == 0) {
                throw new IllegalArgumentException("List is empty");
            }
            return contactsList;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void insertContactService (String firstname, String lastname, String phoneNumber) {
        try {
            if (!(insert(firstname, lastname, phoneNumber))) {
                throw new IllegalArgumentException("Error in insert");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void updateContactService(String oldPhoneNumber, String firstname,
                                            String lastname, String newPhonenumber) {

        try {
            if (!(update(oldPhoneNumber, firstname, lastname, newPhonenumber))) {
                throw new IllegalArgumentException("Error in update");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static String[] deleteContactService(String phoneNumber) {
        String[] contact;

        try {
            contact = delete(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Error in Delete");
            }
            return contact;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    /*
     * CRUD Services that are provided to service layer
     */

    public static int getIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }
        return -1; // if not found
    }

    public static boolean insert (String firstname, String lastname, String phoneNumber) {
        if (isFull() || getIndexByPhoneNumber(phoneNumber) != -1) return false;

        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;
        return true;
    }

    public static boolean update(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
        int positionToUpdate = getIndexByPhoneNumber(oldPhoneNumber);
        String[] contact = new String[3];

        if (positionToUpdate == -1) {
            return false;
//            return new String[] {}; // αδειος πίνακας αντί για null που δημιουργει null pointer exception
        }

//        contact[0] = contacts[positionToUpdate][0];
//        contact[1] = contacts[positionToUpdate][1];
//        contact[2] = contacts[positionToUpdate][2];

        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        contacts[positionToUpdate][2] = newPhoneNumber;
        return true;
//        return contact;
    }

    public static String[] delete (String phoneNumber) {
        int positionToDelete = getIndexByPhoneNumber(phoneNumber); // -1 να πινακας κενος η στοιχειο δεν υπαρχει
        String[] contact = new String[3];

        if (positionToDelete == -1) return new String[] {};

//        for (int i = 0; i < contact.length; i++) {
//            contact[i] = contacts[positionToDelete][i];
//        }

        System.arraycopy(contacts[positionToDelete], 0, contact, 0, contact.length);

        if (!(positionToDelete == contacts.length - 1)) {

            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }
        pivot--;
        return contact;
    }

    public static String[] getContactByPhoneNumber (String phoneNumber) {
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);

        if (positionToReturn == -1) {
            return new String[] {};
        }
        return  contacts[positionToReturn]; // στους 2σδιαστατους πινακες arr[i][j] το arr[i] ειναι το ονομα/αναφορα του μονοδιασταου
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1); // μπορει ν επιστερψει και κενο array
    }

    public static boolean isFull() {
        return pivot == contacts.length - 1;
    }

    /*
     * Custom logger.
     * Varags String[] message
     * log(Exception)
     */

    public static void log (Exception e, String... message) { // μπορεις να περασεις οσες παραμετρους θελεις η και 0
        try (PrintStream ps = new PrintStream (new FileOutputStream(path.toFile(), true))) { // true -> append
            ps.println(LocalDateTime.now() + "\n" + e); // e is transformed to String due to "\n" existence
            ps.printf("%s", (message.length == 1) ? message[0] : ""); // θεωρω οτι μονο αν εχει ενα στοιχειο ο πινακας τον τυπωνω
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
