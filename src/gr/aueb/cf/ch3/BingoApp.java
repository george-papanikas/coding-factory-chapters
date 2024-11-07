package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Κάνει Bingo όταν ο χρήστης μαντέψει ένα Secret Key
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;

        while (true) {
            System.out.println("Please provide a secret num");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo");
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }
}

