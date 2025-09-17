package OOPs.EncapsulationPolymorphismInterfaceAbstractClass;

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int num, String name, double balance) { super(num, name, balance); }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan() { System.out.println("Loan applied for Savings Account"); }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int num, String name, double balance) { super(num, name, balance); }

    @Override
    public double calculateInterest() { return getBalance() * 0.02; }

    @Override
    public void applyForLoan() { System.out.println("Loan applied for Current Account"); }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 20000; }
}

public class Task4 {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount(1001, "Alice", 15000),
                new CurrentAccount(1002, "Bob", 25000)
        };

        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " Interest: " + acc.calculateInterest());
        }
    }
}
