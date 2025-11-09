package Exceptions;

class PaymentFailException extends Exception {
    public PaymentFailException(String message) {
        super(message);
    }
}