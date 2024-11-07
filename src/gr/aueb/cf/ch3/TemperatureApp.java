package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Aποφασίζει αν χιονίζει με βάση τη θερμοκρασία.
 * Αν η θερμοκρασία είναι <0 τότε χιονίζει, αλλιώς δε χιονίζει.
 * Ο χρήστης δίνει τη θερμοκρασία.
 */

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = temp < 0;

        System.out.println("Is Snowing:" + isSnowing);

    }
}
