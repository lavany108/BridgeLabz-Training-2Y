package Wrapper_class;

public class InputConversionUtility {public static int safeParseInt(String input) {
    try {
        int result = Integer.parseInt(input);
        return result;
    } catch (NumberFormatException e) {
        return -1;
    }
}
    public static void main(String[] args) {
        String[] testInputs = {"123", "abc", "45.6", "0", "-99"};
        for (String input : testInputs) {
            int result = safeParseInt(input);
            String status = (result != -1 || input.equals("-1") || input.equals("0")) ? "Success" : "Failure (Handled)";
            System.out.printf("Input: \"%s\" \n Result=w %d (Status: %s)%n", input, result, status);
        }
    }
}
