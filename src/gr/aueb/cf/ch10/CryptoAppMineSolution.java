package gr.aueb.cf.ch10;

import java.util.ArrayList;

public class CryptoAppMineSolution {

    public static void main(String[] args) {
        final int KEY = 300; // μεγαλυτερο απο το μεγεθος των ASCII ΠΟΥ ΕΙΝΑΙ 128
        String s = "Coding#";

        String encrypted = encrypt(s, KEY).toString();
        System.out.println(encrypted);

        String decrypted = decrypt(encrypt(s, KEY), KEY).toString();
        System.out.println(decrypted);
    }

    public static ArrayList<Integer> encrypt (String s, int key) {
        ArrayList<Integer> encrypted = new ArrayList<>();
        int i = 1;
        int prev = cipher(s.charAt(0), -1, key);
        encrypted.add(prev);

        while (s.charAt(i) != '#') {
            encrypted.add(cipher(s.charAt(i), prev, key));
            prev = cipher(s.charAt(i), prev, key);
            i++;
        }
        encrypted.add(-1);
        return encrypted;
    }

    public static ArrayList<Character> decrypt (ArrayList<Integer> encrypted, int key) {
        ArrayList<Character> decrypted = new ArrayList<>();
        int i = 1;
        int c;
        char prev = decipher(encrypted.get(0), -1, key);
        decrypted.add(prev);
        while ((c = encrypted.get(i)) != -1) {
            decrypted.add((decipher(c, prev, key)));
            prev = (char)c;
            i++;
        }
        decrypted.add('#');
        return decrypted;
    }

    public static int cipher (char ch, int prev, int key) {
        if (prev == -1) return ch;
        return (ch + prev) % key;
    }

    public static char decipher (int in, int prev, int key) {
        if (prev == -1) return (char) in;
        return (char) ((in - prev + key) % key);
    }
}
