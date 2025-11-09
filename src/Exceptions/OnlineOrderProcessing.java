package Exceptions;
import java.util.Random;

public class OnlineOrderProcessing {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random random = new Random();
        int result = random.nextInt(3);
        if (result == 1) {
            throw new OutOfStockException("Order OUT OF STOCK.");
        } else if (result == 2) {
            throw new PaymentFailedException("Payment processing declined. Please check your card details.");
        } else {
            System.out.println("Order Placed Successfully!!");
        }
    }
    public static void main(String[] args) {
        OnlineOrderProcessing processor = new OnlineOrderProcessing();
        for (int i = 1; i <= 3; i++) {
            try {
                processor.placeOrder();
            } catch (OutOfStockException e) {
                System.err.println("Failed!! " + e.getMessage());
                System.out.println("Please remove the item or try later.");
            } catch (PaymentFailedException e) {
                System.err.println("Failed!! " + e.getMessage());
                System.out.println("Review your card details or try an alternative method.");
            } catch (Exception e) {
                System.err.println("UNEXPECTED ERROR!! " + e.getMessage());
            }
        }
    }
}