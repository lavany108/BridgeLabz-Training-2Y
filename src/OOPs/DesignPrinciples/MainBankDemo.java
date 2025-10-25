package OOPs.DesignPrinciples;

// MainBankDemo.java
public class MainBankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer c1 = new Customer("Alice", 1000);
        Customer c2 = new Customer("Bob", 500);

        // Open accounts
        bank.openAccount(c1);
        bank.openAccount(c2);

        // Transactions
        c1.deposit(200);
        c1.withdraw(300);
        c1.viewBalance();

        c2.deposit(100);
        c2.viewBalance();
    }
}
