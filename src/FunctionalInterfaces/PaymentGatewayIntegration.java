package FunctionalInterfaces;

interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed (default behavior).");
    }
}
class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm.");
    }
}
class PhonePe implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePe.");
    }
    public void refund(double amount) {
        System.out.println("PhonePe refund of ₹" + amount + " completed successfully!");
    }
}
public class PaymentGatewayIntegration{
    public static void main(String[] args) {
        PaymentProcessor paytm = new Paytm();
        PaymentProcessor phonepe = new PhonePe();
        paytm.pay(1000);
        paytm.refund(500);
        phonepe.pay(1500);
        phonepe.refund(700);
    }
}
