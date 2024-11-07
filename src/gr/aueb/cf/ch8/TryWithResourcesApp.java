package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // final Scanner in = new Scanner(System.in); (1)
        int num;

        try (in) { // για να βάλω το in μέσα θα πρέπει να είναι effectively final δηλ (1) ή να μην αλλάζει μέσα στη try
            // αλλιώς βάζω try (Scanner in = new Scanner(System.in))
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("Ooops Error");
        }

    }

}
