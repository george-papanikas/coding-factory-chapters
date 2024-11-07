package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ένα αρχείο με μορφή δεδομένων
 * country1  city1   city2    city3 ...
 * country2  city1   city2    city3 ...
 * και γράφει κάθε γραμμή σε διαφορετικό output αρχείο.
 *
 * Χρησιμοποιούμε το java.io
 */
public class CitiesIOApp {

    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:/tmp");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in make dir"); // εμφανιζει με κόκκινα γράμματα
                System.exit(1); // οτιδήηποτε διαφορετικό από το 0 στο System.exit σημαίνει error
            }
        }
        /* o BufferedReader είναι wrapper κλαση και διαβάζει μέσω της FileReader
         *
         */
        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"))) {
            while ((line = bf.readLine()) != null) { // και διαβάζει ολόκληρη τη γραμμή και ελέγχει ταυτόχρονα
                cities = line.split(" +"); //κάνε split με ένα ή περισσότερα κενά το + πηγαίνει σε αυτό που προηγείται το κενό στη προκειμένη
                switch (cities[0]) { //με βάση τo country γράφει
                    case "Greece":
                        //περιορίζω το ονομα ώστε να πάρει τα 2 πρώτα γράμματα και με lowercase είναι gr
                        //το dir μετατρέπεται αυτόματα σε String αφού στο expression υπάρχουν και άλλα Strings
                        // γίνεται στην ουσία dir.toString() (μετατρέπει τα files σε Strings)
                        File grFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        //περιορίζω το ονομα ώστε να πάρει τα 2 πρώτα γράμματα και με lowercase είναι us
                        File usaFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        //περιορίζω το ονομα ώστε να πάρει τα 2 πρώτα γράμματα και με lowercase είναι ge
                        File deFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "DE Cities");
                        print(de, cities);
                        break;
                    default:
                        System.err.println("Error in cities");
                        break;
                }
            }
        } catch (IOException e) { // o BufferedReader δημιουργεί IO Exception
            e.printStackTrace();
        }

    }

    public static void print (PrintStream ps, String message) {
        ps.println(message);
    }

    // Overloaded print
    public static void print(PrintStream ps, String[] tokens) {
        for (int i  = 1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
            //print(ps, tokens[i] + " "); χρησιμοποιώ τη
        }
    }
}
