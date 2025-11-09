package Exceptions;
import java.util.Random;

public class FlightBooking {
    public void checkSeatAvailability(String seat) throws SeatUnavailableException {
        Random random = new Random();
        if (random.nextInt(10) < 3) {
            throw new SeatUnavailableException("Seat " + seat + " is no longer available.");
        }
        System.out.println("Seat " + seat + " is available.");
    }
    public void processPayment(double amount) throws PaymentFailException {
        Random random = new Random();
        if (random.nextInt(10) < 2) { // 20% chance of failure
            throw new PaymentFailException("Payment of $" + String.format("%.2f", amount) + " was declined by the bank.");
        }
        System.out.println("Payment of $" + String.format("%.2f", amount) + " processed successfully.");
    }
    public void bookTicket(String seat, double price) throws Exception {
        checkSeatAvailability(seat);
        processPayment(price);
        System.out.println("BOOKING SUCCESSFUL! Your e-ticket is confirmed.");
    }
    public static void main(String[] args) {
        FlightBooking app = new FlightBooking();
        for (int i = 1; i <= 3; i++) {
            try {
                app.bookTicket("34A", 150.99);
            } catch (SeatUnavailableException e) {
                System.err.println(e.getMessage());
                System.out.println("Please select a different seat for your flight.");
            } catch (PaymentFailedException e) {
                System.err.println( e.getMessage());
                System.out.println("Please check your card details or try an alternative payment method.");
            } catch (Exception e) {
                System.err.println(e.getClass().getSimpleName());
            } finally {
                System.out.println("Thank you for booking!");
            }
        }
    }
}