package core_java.ControlFlow.Level3;
import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int ogNum = num;
        while (ogNum != 0) {
            int digit = ogNum % 10;
            int cube = digit * digit * digit;
            sum += cube;
            ogNum = ogNum / 10;
        }
        if (sum == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println(" Not an Armstrong number");
        }

    }
}