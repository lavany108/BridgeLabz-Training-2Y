package OOPs.DesignPriciples;

// Customer.java
public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name + " withdrew " + amount);
        } else {
            System.out.println("Insufficient balance for " + name);
        }
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}
