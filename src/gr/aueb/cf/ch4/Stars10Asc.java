package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει σε αύξουσα σειρά 1, 2, 3....10
 * αστεράκια σε κάθε γραμμή
 */

public class Stars10Asc {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}