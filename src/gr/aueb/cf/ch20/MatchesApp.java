package gr.aueb.cf.ch20;

import java.security.PublicKey;

public class MatchesApp {

    public static void main(String[] args) {
        String s = "red";
        System.out.println(isRed(s));

        String digit = "4";
        System.out.println(isOneDigit(digit));

        String word = "m";
        System.out.println(isOneWordChar(word));

        String symbol = "";
        System.out.println(isZeroOrOneAnySymbol(symbol));

        String email = "g.p@aueb.gr";
        System.out.println(isValidEmailAddress(email));
    }

    public static boolean isRed(String s) {
        return s.matches("red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    public static boolean isOneDigit(String s) {
        //return s.matches("[0123456789]"); //"[0-9]"
        return s.matches("\\d"); // \d means digit and we escape \ as it's a special character
    }

    public static boolean isNotOneDigit(String s) {
        return s.matches("\\D"); // !\\d
    }

    public static boolean isOneWordChar(String s) {
        //return s.matches("[a-zA-Z0-9_]"); // _ means different symbols
        return s.matches("\\w");
    }

    public static boolean isNotOneWordChar(String s) {
        return s.matches("\\W");
    }

    public static boolean isWhiteSpace(String s) { // spaces, tabs, newlines
        return s.matches("\\s");
    }

    public static boolean isNotWhiteSpace(String s) { // spaces, tabs, newlines
        return s.matches("\\S");
    }

    public static boolean isAnySymbol(String s) {
        return s.matches(".");
    }

    public static boolean isWholeString(String s) {
        return s.matches("^.$");
    }

    public static boolean isZeroOrMoreDigits(String s) {
        return s.matches("\\d*");
    }

    public static boolean isOneOrMoreDigits(String s) {
        return s.matches("\\d+");
    }

    public static boolean isThreeDigits(String s) {
        return s.matches("\\d{3}");
    }

    public static boolean isOneToThreeDigits(String s) {
        return s.matches("\\d{1,3}");
    }

    public static boolean isMoreThanFiveDigits(String s) {
        return s.matches("\\d{5,}");
    }

    public static boolean isZeroOrOneAnySymbol(String s) {
        return s.matches(".?");
    }

    public static boolean isValidEmailAddress(String s) {
        return s.matches("^[a-zA-Z]\\w*\\.?\\w+@\\w+\\.(com|gr)$"); // . is any symbol | \\. is dot
        // begins with letter aA-zZ
        // ^ and $ are not necessary
    }




}
