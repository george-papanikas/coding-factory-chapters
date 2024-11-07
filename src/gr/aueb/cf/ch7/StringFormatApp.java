package gr.aueb.cf.ch7;

/**
 * Formats to string
 */

public class StringFormatApp {

    public static void main(String[] args) {
        char row = 'B';
        int col = 8;

        String seat = String.format("%c%02d", row, col);

        System.out.println(seat);

    }
}
