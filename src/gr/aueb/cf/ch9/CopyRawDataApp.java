package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataApp {

    public static void main(String[] args) {

        int b = 0; // τα bytes που διαβάζουμε
        int count = 0; // τα συνολικά bytes

        try(FileInputStream in = new FileInputStream("C:/tmp/asktt.jpg");
            FileOutputStream out = new FileOutputStream("C:/tmp/v2out.jpg")) {

            while ((b = in.read()) != -1) { // επιστρέφει -1 όταν φτάνει στο τέλος αρχείου
                out.write(b);
                count++;
            }
            System.out.println(count);
        }catch (IOException e) { // βάζω το γενικότερο io exception που ζητάει η read
            throw new RuntimeException(); //δεν είναι checked exception οπότε δεν χρειάζεται να γίνει throw και στην επικεφαλίδα
            // αν πάει κάτι στραβά διακόπτεται το πρόγραμμα
        }

    }
}
