package Wrapper_class;

import java.util.Scanner;

public class CharacterWrapper {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            int letterCount = 0;
            int digitCount = 0;
            int specialCharCount = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLetter(c)) {
                    letterCount++;
                }
                else if (Character.isDigit(c)) {
                    digitCount++;
                }
                else if (Character.isWhitespace(c)) {
                }
                else {
                    specialCharCount++;
                }
            }
            System.out.println("Original String= \"" + input + "\"");
            System.out.println("Total Letters= " + letterCount);
            System.out.println("Total Digits= " + digitCount);
            System.out.println("Total Special Characters= " + specialCharCount);

        } catch (Exception e) {
            System.err.println("Error occurred during input: " + e.getMessage());
        }
    }
}

