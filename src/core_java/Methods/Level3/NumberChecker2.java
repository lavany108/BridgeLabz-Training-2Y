package core_java.Methods.Level3;
import java.util.Arrays;

public class NumberChecker2 {
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
    public static int[] getDigitsArray(int n) {
        String numStr = String.valueOf(Math.abs(n));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
       for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == originalNumber;
    }
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " +
                (secondLargest == Integer.MIN_VALUE ? "Not Found" : secondLargest));
    }
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " +
                (secondSmallest == Integer.MAX_VALUE ? "Not Found" : secondSmallest));
    }
    public static void main(String[] args) {
        int number = 153;
        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);
        System.out.println("Number: " + number);
        System.out.println("Digits Count: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Duck Number? " + isDuckNumber(digits));
        System.out.println("Armstrong Number? " + isArmstrongNumber(digits, number));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
