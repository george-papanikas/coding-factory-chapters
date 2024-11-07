package gr.aueb.cf.ch5;

/**
 * Float/ Double Expressions
 */

public class Expression {

    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;
        double result = 0.0;
        double mod = 0.0;

        result = num1 / num2; // 6,25
        mod = num1 % num2; // 0,5

        System.out.printf("%,.2f / %.2f = %,.2f\n", num1, num2, result); // το .2 αφήνει δύο δεκαδικά ψηφία με , βάζει διαχ χιλιάδων με ,16 αφήνει και
        // 16 κενά με ,016 τα κενα τα γεμιζει με 0
        System.out.printf("%.2f %% %.2f = %.2f", num1, num2, mod); // το % είναι ειδικός χαρακτήρας το γράφω 2 φορές για να εμφανιστεί
    }
}
