package core_java.Array.Level1;
import java.util.Scanner;

public class Multiplication6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            multiplicationResult[j] = num * i;
        }
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            System.out.println(num + " * " + i + " = " + multiplicationResult[j]);
        }
    }
}

