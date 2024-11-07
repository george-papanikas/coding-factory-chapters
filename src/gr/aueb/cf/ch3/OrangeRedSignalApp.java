package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει δύο δεξαμενές. Αν μια δεξαμενή έχει λιγότερο από 1/4 καύσιμα
 * τότε ανάβει πορτοκαλί σήμα, ενώ αν και οι δύο δεξαμενές έχουν < 1/4 τότε ανάβει
 * κόκκινο σήμα. Ο πιλότος (χρήστης) δίνει true ή  false ανάλογα αν tank <1/4 ή όχι, αντίστοιχα
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);




    }
}
