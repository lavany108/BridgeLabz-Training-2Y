package Exceptions;

public class ATM {
    private double balance = 10000.00;
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientFundsException(
                    "Withdrawal failed! Insufficient funds. Current Balance: ₹" +
                            String.format("%.2f", balance) +
                            ". You need ₹" +
                            String.format("%.2f", shortfall) +
                            " more."
            );
        } else {
            balance -= amount;
            System.out.println("Transaction Successful!!");
            System.out.println("Withdrew= ₹" + String.format("%.2f", amount));
            System.out.println("New Balance= ₹" + String.format("%.2f", balance));
        }
    }
    public static void main(String[] args) {
        ATM myAtm = new ATM();
        double initialWithdrawal = 5000.00;
        double largeWithdrawal = 6000.00;
        System.out.println("Initial Balance= ₹" + String.format("%.2f", myAtm.balance));
        System.out.println("withdrawing money= ₹" + String.format("%.2f", initialWithdrawal));
        try {
            myAtm.withdraw(initialWithdrawal);
        } catch (InsufficientFundsException e) {
            System.err.println("ERROR!! " + e.getMessage());
        }
        System.out.println("withdrawing money= ₹" + String.format("%.2f", largeWithdrawal));

        try {
            myAtm.withdraw(largeWithdrawal);
        } catch (InsufficientFundsException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        System.out.println("Final Account Balance= ₹" + String.format("%.2f", myAtm.balance));
    }
}