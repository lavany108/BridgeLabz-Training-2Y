package Exceptions;
import java.util.Random;

public class TransactionManager {

    private double balance = 500.00;
    private static final String VALID_ACCOUNT = "A123";
    public void verifyAccount(String accountID) throws AccountNotFoundException {
        Random random = new Random();
        if (!accountID.equals(VALID_ACCOUNT) || random.nextInt(10) < 3) {
            throw new AccountNotFoundException(
                    "Verification failed: Account ID " + accountID + " is not recognized."
            );
        }
        System.out.println("Account verification successful for " + accountID + ".");
    }
    public void processTransaction(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Transaction failed: Insufficient funds. Available: $" +
                            String.format("%.2f", balance) + ", Required: $" +
                            String.format("%.2f", amount)
            );
        }
        balance -= amount;
        System.out.println("Transaction processed. Remaining balance: $" + String.format("%.2f", balance));
    }
    public void executeTransaction(String accountID, double amount) throws Exception {
        verifyAccount(accountID);
        processTransaction(amount);
    }
    public static void main(String[] args) {
        TransactionManager manager = new TransactionManager();
        String testInvalidAccount = "B456";
        double testValidAmount = 50.00;
        double testOverdraftAmount = 1000.00;
        try {
            manager.executeTransaction(testInvalidAccount, testValidAmount);
        } catch (AccountNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println( e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
        try {
            manager.executeTransaction(VALID_ACCOUNT, testOverdraftAmount);
        } catch (AccountNotFoundException e) {
            System.err.println("Unexpected Error Type: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}