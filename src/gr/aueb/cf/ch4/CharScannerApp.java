package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει έναν char με Scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar;

        System.out.println("Please insert a char");
        inputChar = in.next().charAt(0);// η next διαβάζει όλο το αλφαριθμητικό και εμείς επιλέγουμε να εκχωρήσουμε το 1o χαρακτήρα

        System.out.println("Char: " + inputChar);
    }
}
