package core_java.ControlFlow.Level2;
import java.util.Scanner;

public class PowerOfNumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        if (num < 0 || power < 0) {
            System.out.println("Enter positive integers only!!");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= num;
                counter++;
            }
            System.out.println(result);
        }
    }
}


