package Exceptions;
import java.util.Random;

public class BankingTransactionSystem {
    public void processTransaction(double amount)
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        Random random = new Random();
        int failureCode = random.nextInt(4);
        System.out.println("Transaction: $" + String.format("%.2f", amount));
        if (failureCode == 1) {
            throw new NegativeAmountException("Error! Amount must be positive.");
        } else if (failureCode == 2) {
            throw new InsufficientFundsException("Error! Your current balance is too low for this transaction.");
        } else if (failureCode == 3) {
            throw new NetworkFailureException("Error! Could not connect to the bank server. Please try again.");
        } else {
            System.out.println("Transaction Completed Successfully!");
        }
    }

    public static void main(String[] args) {
        BankingTransactionSystem tx = new BankingTransactionSystem();
        double testAmount = 500.00;
        for (int i = 1; i <= 5; i++) {
            try {
                tx.processTransaction(testAmount);
            } catch (NegativeAmountException e) {
                System.err.println("Negative Amount " + e.getMessage());

            } catch (InsufficientFundsException e) {
                System.err.println("Insufficient balance " + e.getMessage());

            } catch (NetworkFailureException e) {
                System.err.println("Network Error " + e.getMessage());
            } catch (Exception e) {
                System.err.println("UNEXPECTED ERROR " + e.getMessage());
            }
        }
    }
}