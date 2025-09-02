package core_java.Array.Level2;
import java.util.Scanner;

public class FrequencyOfEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        long number = sc.nextLong();
        String numStr = Long.toString(number);
        int length = numStr.length();
        int[] digits = new int[length];
        int[] freq = new int[10];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
            freq[digits[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " = " + freq[i] + " times");
            }
        }
    }
}

