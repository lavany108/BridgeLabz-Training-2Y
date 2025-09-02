package core_java.ControlFlow.Level1;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Enter a Natural number!!");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even number");
                } else {
                    System.out.println("Odd number");
                }
            }
        }
    }
}

