package gr.aueb.cf.ch4;

/**
 * Prints a smiley
 */

public class SmileyApp {

    public static void main(String[] args) {
       // int codepoint = 0x1F600; // 0x σημαίνει στο δεκαεξαδικό 0x1F600 = smiley

        // conversion of 0x1F600 to Surrogate Pairs http://russellcottrell.com/greek/utilities/SurrogatePairCalculator.htm

        System.out.println("Smiley: \ud83d\ude00"); // δεν είναι case sensitive
    }
}
