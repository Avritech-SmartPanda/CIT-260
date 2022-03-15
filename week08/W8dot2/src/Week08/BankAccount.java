package Week08;

/**
 * @author Daphne
 */
public class BankAccount {
    // instance variable
    private Integer accountNumber;
    private double balance;

    /**
     * Constructs a bank account
     */
    public BankAccount() {
        this.accountNumber = 0;
        this.balance = 0;
    }

    /**
     * Constructs a bank account with an account number and initial balance
     *
     * @param accNumber  the account number
     * @param initialBalance the initial balance
     */
    public BankAccount(Integer accNumber, double initialBalance) {
        accountNumber = accNumber;
        balance = initialBalance;
    }

    /**
     * Gets the account number
     *
     * @return the account number
     */
    public Integer getAccount() {
        return accountNumber;        // returns value of instance var
    }

    /**
     * Gets the current balance
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;            // returns value of instance var
    }


    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void makeDeposit(double amount)
    {
        System.out.printf("...Making a deposit of $%.2f%n", amount);
        double newBalance = balance + amount;
        balance = newBalance;    // modifies instance var
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void makeWithdrawal(double amount)
    {
        System.out.printf("...Making a withdrawal of $%.2f%n", amount);
        double newBalance = balance - amount;
        balance = newBalance;
    }


}
