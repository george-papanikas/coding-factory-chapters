package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**Διαβάζει ώρες, λεπτά και δεύτερα
 * και τα μετατρέπει σε δεύτερόλεπτα
 */
public class SecondsApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        //int totalSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        System.out.println("Please insert hours, minutes and seconds");
        inputHours = sc.nextInt();
        inputMinutes = sc.nextInt();
        inputSeconds = sc.nextInt();
        //totalSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        System.out.printf(Locale.forLanguageTag("el"), "%,d total seconds", inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds);

        //System.out.printf("%d hours, %d minutes, %d seconds = %d total seconds",
                //inputHours, inputMinutes, inputSeconds, totalSeconds);//όταν κόβεις μια εντολή πηγαίνει 2 tabs μέσα

    }
}
