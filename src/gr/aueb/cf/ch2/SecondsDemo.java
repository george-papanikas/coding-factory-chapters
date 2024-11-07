package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class SecondsDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int DAY_SECS = 24 * 60 * 60;
        final int HOURS_SECS = 60 * 60;
        final int MINUTES_SECS = 60;
        int inputSeconds = 0;
        int remainingSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please insert the total amount of seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;
        days = remainingSeconds / DAY_SECS;
        remainingSeconds %= DAY_SECS;
        hours = remainingSeconds / HOURS_SECS;
        remainingSeconds %= HOURS_SECS;
        minutes = remainingSeconds / MINUTES_SECS;
        remainingSeconds %= MINUTES_SECS;

        System.out.printf(Locale.forLanguageTag("el"), "%,d input seconds = %d days, %d hours, %d minutes, %d seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);

    }
}
