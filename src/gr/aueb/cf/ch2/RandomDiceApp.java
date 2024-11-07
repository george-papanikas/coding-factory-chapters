package gr.aueb.cf.ch2;

/**
 * Ρίχνει δύο ζάρια
 */
public class RandomDiceApp {

    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * (6 -1 + 1)) + 1;// η random επιστρέφει double οπότε απαραίτητο το typecast στη προκειμένη
        die2 = (int) (Math.random() * (6 -1 + 1)) + 1;//το typecast δεν γίνεται στο +1 μόνο στο διπλανό του

        System.out.printf("Die1: %d, Die2: %d", die1, die2);
    }
}

