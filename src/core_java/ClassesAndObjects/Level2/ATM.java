package core_java.ClassesAndObjects.Level2;

public class ATM {
    String accountHolder;
    long accountNumber;
    double balance;
    ATM(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        ATM account = new ATM("John", 1234567890L, 5000);
        account.displayBalance();
        account.deposit(1500);
        account.withdraw(2000);
        account.displayBalance();
    }
}

