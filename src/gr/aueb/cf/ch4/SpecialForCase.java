package gr.aueb.cf.ch4;

public class SpecialForCase {

    public static void main(String[] args) {
        int counter = 0;

        for (;;) { // το ;; σημαίνει while true (αέναο loop)
            System.out.print("forever ");
            counter++;
            if (counter % 20 == 0) System.out.println();
            if (counter == 100) break;
        }
    }
}
