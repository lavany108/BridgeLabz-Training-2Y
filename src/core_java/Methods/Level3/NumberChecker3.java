package core_java.Methods.Level3;

public class NumberChecker3 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }
    public static void displayFrequency(int[][] freq) {
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + "\t" + freq[i][1]);
            }
        }
    }
    public static void main(String[] args) {
        int number = 42124;
        System.out.println("Number: " + number);
        int count = countDigits(number);
        System.out.println("Count of Digits: " + count);
        int[] digits = getDigitsArray(number);
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumDigits);
        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);
        boolean harshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number? " + harshad);
        int[][] frequency = digitFrequency(digits);
        displayFrequency(frequency);
    }
}

