package gr.aueb.cf.ch11;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {}

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API

    /**
     * Deposits a certain amount of money.
     *
     * @param amount
     *          the amount of money to be deposited.
     * @throws Exception
     *          if the amount is negative.
     */

    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative amount exception");
            }

            balance += amount;

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from an account.
     *
     * @param amount
     *         the amount to be withdrawn
     * @param ssn
     *         the given ssn
     * @throws Exception
     *          If the ssn is not valid or the balance is not sufficient
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn not valid exception");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance exception");
            }

            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the account
     *
     * @return
     *      the account's balance
     */
    public double getAccountBalance() {
        return getBalance();
        // return balance
    }

    /**
     * Returns the account's state in string format
     *
     * @return
     *      the string representation of the account's state
     */
    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", "
                + lastname + ", " + ssn + ", " + balance + ")"; //ο,τι ειναι μεσα σε ενα expression που υπαρχει ενα str γινεται str
    }

    private boolean isSsnValid(String ssn) { // γινεται κατω απο τον γκισε δεν ειναι για το κοινο αυτη η πραξη
        return this.ssn.equals(ssn);
    }
}
