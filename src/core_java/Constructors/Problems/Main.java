package core_java.Constructors.Problems;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Amount= " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount= " + amount);
        } else {
            System.out.println("Insufficient balance!!");
        }
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    public void showAccountDetails() {
        System.out.println("Account Number is " + accountNumber);
        System.out.println("Account Holder is " + accountHolder);
        System.out.println("Balance= " + getBalance());
    }
}
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, "Lavanya", 5000.0);

        sa.showAccountDetails();
        sa.deposit(2000);
        sa.withdraw(1000);
        System.out.println("Final Balance: " + sa.getBalance());
    }
}
