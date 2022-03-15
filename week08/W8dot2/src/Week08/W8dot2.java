package Week08;

public class W8dot2 {

    public static void main(String[] args) {
	// write your code here
        BankAccount account = new BankAccount(123, 5.00);
        System.out.println("...Creating account number " + account.getAccount() + " with an initial balance of " + account.getBalance());
        account.makeDeposit(10.50);
        account.makeDeposit(3.25);
        account.makeWithdrawal(1.50);
        System.out.println("The balance in account number " + account.getAccount() + " is " + account.getBalance());
        System.out.println("Goodbye...");

    }



}



