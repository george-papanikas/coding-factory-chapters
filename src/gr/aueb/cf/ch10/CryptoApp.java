package gr.aueb.cf.ch10;

import java.util.ArrayList;

public class CryptoApp {

    public static void main(String[] args) {
        final int KEY = 300; // μεγαλυτερο απο το μεγεθος των ASCII ΠΟΥ ΕΙΝΑΙ 128
        String s = "Coding#";

        String encrypted = encrypt(s, KEY).toString();
        System.out.println(encrypted);

        String decrypted = decrypt(encrypt(s, KEY), KEY).toString();
        System.out.println(decrypted);

    }

    public static ArrayList<Integer> encrypt(String s, int key) { // τα generics θελουν wrapper κλασεις
        ArrayList<Integer> encrypted = new ArrayList<>(); // o constructor που αρχικοποιει την arraylist <> ειναι κενο γιατι καταλαβαινει η java
        char ch;
        int i;

        int prev = cipher(s.charAt(0), -1, key);
        encrypted.add(prev); // προσθετει στο τελος το prev

        i = 1;
        while ((ch = s.charAt(i)) != '#') { // το '#' είναι sentinel (κομβος φρουρος)  το χρειαζεται η while
            encrypted.add(cipher(ch, prev, key));
            prev = cipher(ch, prev, key);
            i++;
        }
        encrypted.add(-1); // to κρυπτογραφημενο μνμ τελειωνει προσθετοντας το -1
        return encrypted;
    }

    public static ArrayList<Character> decrypt(ArrayList<Integer> encrypted, int key) {
        ArrayList<Character> decrypted = new ArrayList<>();

        int token;
        int i;
        int prevToken;

        prevToken = decipher(encrypted.get(0), -1, key);
        decrypted.add((char)prevToken); // το κανεις (char) και μετα γινεται aytobox για να γινει character

        i = 1;
        while ((token = encrypted.get(i)) != -1) {
            decrypted.add(decipher(token, prevToken, key));
            prevToken = token;
            i++;
        }
        decrypted.add('#');
        return decrypted;
    }

    public static int cipher (char ch, int prev, int key) { // κρυπτογραφει ήτοι δεχεται χαρακτηρα, επιστρέφει int
        if (prev == -1) return ch; // κάνουμε return το char και μετατρεπεται σε int αυτόματα μιας και οι chars είναι μικροι ints στη πραγματικοτητα
        return (ch + prev) % key; // ο char μετατρεπεται σε int γιατί και ο prev ειναι int
    }

    public static char decipher (int cipher, int prev, int key) {
        int de;
        if (prev == -1) return (char) cipher;

        de = (cipher - prev + key) % key; // προσθετω το key σε περιπτωση που η παρασταση ειναι αρνητικη
        return (char) de;
    }
}