package Exceptions;

class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}