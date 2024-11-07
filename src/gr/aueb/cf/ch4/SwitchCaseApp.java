package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch instead of if-then-else if
 * Gets a user's choice based on a menu
 * and returns a feedback/confirmation
 */

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do { // ταιριάζει για μενου η do while
            System.out.println("Please select one of the following:");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");
            System.out.println("Please provide a choice:");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one-player game");
                    break;
                case 2:
                    System.out.println("Start two-player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Quit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break; // δεν είναι απαραίτητο εδώ γιατί είναι στο τέλος
            }
        } while (choice !=4);

        System.out.println("Goodbye");
    }
}
