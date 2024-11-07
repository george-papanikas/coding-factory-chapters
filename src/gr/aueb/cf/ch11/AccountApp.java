package gr.aueb.cf.ch11;

import gr.aueb.cf.ch11.Account;

public class AccountApp {

    public static void main(String[] args) {
        Account alice = new Account(1, "GR12345", "Alice", "W.", "F12345", 350.0);

        try {
            alice.deposit(100);
            System.out.println("Successful deposit");
            System.out.println("The new balance is: " + alice.getAccountBalance());

            alice.withdraw(50, "F12345");
            System.out.println("Successful withdraw");
            System.out.println(alice.accountToString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
