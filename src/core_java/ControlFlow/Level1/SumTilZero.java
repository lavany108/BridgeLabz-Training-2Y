package core_java.ControlFlow.Level1;
import java.util.Scanner;

public class SumTilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.print("Number= ");
        number = sc.nextDouble();
        while (number != 0) {
            total += number;
            System.out.print("Enter Number");
            number = sc.nextDouble();
        }
        System.out.println("Sum= " + total);
    }
}
