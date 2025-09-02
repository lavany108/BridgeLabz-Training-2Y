package core_java.ControlFlow.Level1;
import java.util.Scanner;

public class SumTilZeroWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Number= ");
            double number = sc.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }
        System.out.println("Sum= " + total);
    }
}


