package OOPs.DesignPrinciples;

// Bank.java
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " in " + name);
    }

    public String getName() {
        return name;
    }
}
