package core_java.Level1_11sep;

class BankAccount {
    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Not a valid BankAccount object.");
        }
    }
}
public class BankAcc {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Alice", 5000.0);
        BankAccount acc2 = new BankAccount(102, "Bob", 7500.0);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        System.out.println("Total Accounts Created= " + BankAccount.getTotalAccounts());
    }
}
