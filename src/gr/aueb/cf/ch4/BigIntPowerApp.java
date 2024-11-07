package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Yπολογίζει το α^n με BigInteger.
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a;// λίγο υπερβολή θα μπορούσα και σε int
        BigInteger n;
        BigInteger result = new BigInteger("1");

        System.out.println("Please insert two its, base and power");
        /*
         * Όλες οι κλάσεις όπως η BigInt παρέχουν μια μέθοδο value of
         * που κάνει typecast από το primitive στη κλαση
         */
        a = BigInteger.valueOf(in.nextInt());
        n = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= n.intValue(); i++) { // πρέπει να είναι όμοια μέσα στη for όλα οπότε η Int Value μετατρέπει την n σε int
            result = result.multiply(a);  //result *= a; είναι λάθος γιατί οι κλασεις δουλεύουν με μεθόδους και οι τελεστές εφαρμόζονται σε primitives
        }
        System.out.printf("%,d^%,d = %,d", a, n, result); // και οι BigInt είναι %d στη printf
    }
}

//package gr.aueb.cf.ch4;
//
//import java.math.BigInteger;
//import java.util.Scanner;
///**
// * Yπολογίζει το α^n με BigInteger.
// */
//public class BigIntPowerApp {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a;// λίγο υπερβολή θα μπορούσα και σε int
//        int n;
//        BigInteger result = BigInteger.ONE;
//
//        System.out.println("Please insert two its, base and power");
//        /*
//         * Όλες οι κλάσεις όπως η BigInt παρέχουν μια μέθοδο value of
//         * που κάνει typecast από το primitive στη κλαση
//         */
//        a = in.nextInt();
//        n = in.nextInt();
//
//        for (int i = 1; i <= n; i++) { // πρέπει να είναι όμοια μέσα στη for όλα οπότε η Int Value μετατρέπει την n σε int
//            result = result.multiply(BigInteger.valueOf(a);  typecast toν primitive α σε bigint
//        }
//        System.out.printf("%,d^%,d = %,d", a, n, result); // και οι BigInt είναι %d στη printf
//    }
//}