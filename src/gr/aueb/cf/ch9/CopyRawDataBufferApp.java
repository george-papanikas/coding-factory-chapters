package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataBufferApp {

    public static void main(String[] args) {
        int b = 0; // τα bytes που διαβάζουμε
        int count = 0; // τα συνολικά bytes
        byte[] buffer = new byte[8192];
        long start, end;
        double elapsed;

        try (FileInputStream in = new FileInputStream("C:/tmp/asktt.jpg");
            FileOutputStream out = new FileOutputStream("C:/tmp/v1out.jpg")) {

            start = System.currentTimeMillis();
            while ((b = in.read(buffer)) != -1) { // επιστρέφει -1 όταν φτάνει στο τέλος αρχείου
                out.write(buffer, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0; // βάζω .0 για να γίνει double
            System.out.println(elapsed + " secs");
            System.out.println(count + " Bytes");
            System.out.printf("%d MB%n", count / (1024 * 1000));
            //System.out.println();
            System.out.printf("%d KB",(count / 1024));
            //System.out.printf("%,.2f KB",Math.ceil(count / 1024));

        }catch (IOException e) { // βάζω το γενικότερο io exception που ζητάει η read
            throw new RuntimeException(); //δεν είναι checked exception οπότε δεν χρειάζεται να γίνει throw και στην επικεφαλίδα
            // αν πάει κάτι στραβά διακόπτεται το πρόγραμμα
        }
    }
}