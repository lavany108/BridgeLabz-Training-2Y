package core_java.Methods.Level3;

public class NumberChecker6 {
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPerfectNumber(int n) {
        return n > 0 && sumOfDivisors(n) == n;
    }
    public static boolean isAbundantNumber(int n) {
        return n > 0 && sumOfDivisors(n) > n;
    }
    public static boolean isDeficientNumber(int n) {
        return n > 0 && sumOfDivisors(n) < n;
    }
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrongNumber(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 145};
        for (int num : testNumbers) {
            System.out.println("Perfect: " + isPerfectNumber(num));
            System.out.println("Abundant: " + isAbundantNumber(num));
            System.out.println("Deficient: " + isDeficientNumber(num));
            System.out.println("Strong: " + isStrongNumber(num));
        }
    }
}
