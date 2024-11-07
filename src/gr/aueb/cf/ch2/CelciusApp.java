package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Mετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ (Fahrenheit) στη κλίμακα κελσίου (Celsius)
 */
public class CelciusApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fanhrenheit = 0;
        int celsius = 0;

        System.out.println("Please provide temp in Fahrenheit");
        fanhrenheit = in.nextInt();
        celsius = 5 * (fanhrenheit - 32)/9; //δίνω παρενθέσεις για να μη λάβω μηδέν αποτέλεσμα

        System.out.printf("%d\u00B0F = %d\u00B0C", fanhrenheit, celsius); // unicodes


    }
}
