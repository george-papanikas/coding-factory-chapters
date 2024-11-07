package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Aποφασίζει αν χιονίζει με βάση όχι μόνο τη θερμοκρασία αλλά και το αν βρέχει.
 * Αν η θερμοκρασία είναι <0  και βρέχει τότε χιονίζει, αλλιώς δε χιονίζει.
 * Ο χρήστης δίνει τη θερμοκρασία και το αν βρέχει
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert a temperature");
        temp = in.nextInt();
        System.out.println("Please enter if it is raining (true/false)");
        isRaining = in.nextBoolean();
        isSnowing = isRaining && (temp < 0);
        //Η παρένθεση μη απαραίτητη καθώς οι τελεστές σύγκρισης έχουν μεγαλύτερη προτεραιότητα από τους λογικούς τελεστές
        System.out.println("Is snowing: " + isSnowing);


    }
}
