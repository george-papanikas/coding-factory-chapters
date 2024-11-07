package gr.aueb.cf.ch7;

/**
 * Splits a string
 */
public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Athens   Uni of Econ and Business";

        String[] tokens = s.split(" +"); // ενα η περισσοτερα κενα διαστήματα

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
