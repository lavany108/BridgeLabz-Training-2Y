package FunctionalInterfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 50;

        Function<String, Integer> messageLength = msg -> msg.length();
        String message = "A sample message!!";
        int length = messageLength.apply(message);
        System.out.println("Message Length: " + length);
        if (length > limit) {
            System.out.println("Warning: Message exceeds the character limit!");
        } else {
            System.out.println("Message is within the limit.");
        }
    }
}
