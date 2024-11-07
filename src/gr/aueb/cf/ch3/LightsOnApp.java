package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα ενός αυτοκινήτου με
 * βάση τρεις μεταβλητές: αν βρέχει ΚΑΙ ταυτόχρονα ισχύει ένα τουλάχιστον
 * από τα επόμενα: είναι σκοτάδι Ή τρέχουμε (speed > 100).
 * Tις τιμές αυτές τις δίνει ο χρήστης (stdin)
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        //boolean isRunning = false;
        //boolean lightsOn = false;
        int speed = 0;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();
        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();
        System.out.println("Please insert the speed");
        speed = in.nextInt();
        //isRunning = speed > 100;επειδή είναι magic number καλύτερα να το βαζαμε σε μια final int
        //lightsOn = (isRaining && (isDark || speed >100)

        System.out.println("Lights on: " + (isRaining && (isDark || speed >100)));
        //System.out.println("Lights on: " + lightsOn);

    }
}
