package core_java.ControlFlow.Level1;
import java.util.Scanner;

public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a number greater than 0!!");
        } else {
            int formulaSum = n * (n + 1) / 2;
            int whileSum = 0, i = 1;
            while (i <= n) {
                whileSum += i;
                i++;
            }
            System.out.println("Sum using formula= " + formulaSum);
            System.out.println("Sum using while loop= " + whileSum);
            if (formulaSum == whileSum) {
                System.out.println("Both results Match!");
            } else {
                System.out.println("Results Do not Match!");
            }
        }

    }
}

