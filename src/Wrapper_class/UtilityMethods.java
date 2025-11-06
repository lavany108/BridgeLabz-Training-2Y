package Wrapper_class;

public class UtilityMethods {

    public static void main(String[] args) {
        String intString = "123";
        try {
            int parsedInt = Integer.parseInt(intString);
            System.out.println("1. Integer.parseInt(\"" + intString + "\"): " + parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing integer: " + e.getMessage());
        }
        String doubleString = "3.14";
        try {
            double parsedDouble = Double.parseDouble(doubleString);
            System.out.println("2. Double.parseDouble(\"" + doubleString + "\"): " + parsedDouble);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing double: " + e.getMessage());
        }
        String boolString = "true";
        boolean parsedBoolean = Boolean.parseBoolean(boolString);
        System.out.println("3. Boolean.parseBoolean(\"" + boolString + "\"): " + parsedBoolean);
        int numberToConvert = 10;
        String binaryString = Integer.toBinaryString(numberToConvert);
        System.out.println("Integer.toBinaryString(" + numberToConvert + "): " + binaryString);
        char digitChar = '5';
        boolean isDigitResult = Character.isDigit(digitChar);
        System.out.println("Character.isDigit('" + digitChar + "'): " + isDigitResult);
        char lowerChar = 'a';
        char upperCharResult = Character.toUpperCase(lowerChar);
        System.out.println("Character.toUpperCase('" + lowerChar + "'): " + upperCharResult);
    }
}