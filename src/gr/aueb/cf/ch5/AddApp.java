package gr.aueb.cf.ch5;

/**
 * Προσθέτει δύο ακεραίους με τη χρήση της μεθόδου add
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10; // a, b πραγματικές παράμετροι (τοπικές μεταβλητές της main
        int b = 20;
        int sum = 0;

        sum = add(a, b); // Επειδή η add ανήκει στη κλάση AddApp δεν χρειάζεται να τη καλέσω με το πλήρες όνομα της AddApp.add

        System.out.println(sum);
    }

    public static int add(int a, int b) { // τυπικές παράμετροι μεθόδου
//        int a; απαγορεύεται καθώς έχω δηλώσει ήδη την α
//        int sum = 0;
//        sum = a + b;
//        return sum;
        return a + b;
    }
}
