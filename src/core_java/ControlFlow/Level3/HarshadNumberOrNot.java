package core_java.ControlFlow.Level3;
import java.util.Scanner;

public class HarshadNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int ogNum = number;
        while (ogNum != 0) {
            int digit = ogNum % 10;
            sum += digit;
            ogNum = ogNum / 10;
        }
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println(" Not a Harshad Number.");
        }
    }
}


