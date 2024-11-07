package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση των break και continue
 * to break έχει την έννοια του found ότι βρήκες κάτι δλδ
 */
public class BreakContinueApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        boolean found = false;

        while (true) { // αέναο loop αν δεν παίξει break
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num == 5) {
                continue; // δεν συνεχίζει παρακάτω και ξαναπάει στην αρχή της while δηλ δεν αθροίζει το 5
            }
            // if (num ==5 ) continue; θα μπορούσε να γραφτεί και έτσι εφόσον είναι μία εντολή/ ισχύει και για while
            sum += num;
            if (num == 10) {
                found = true;
                System.out.println("Bingo!!!");
                break; // σε πετάει έξω από την while την διακόπτει δλδ
            }
        }
        System.out.println("Sum: " + sum);
    }
}
