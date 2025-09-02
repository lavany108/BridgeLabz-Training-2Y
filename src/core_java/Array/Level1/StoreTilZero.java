package core_java.Array.Level1;
import java.util.Scanner;

public class StoreTilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            values[index] = num;
            index++;
        }
        System.out.println("Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
            total += values[i];
        }
        System.out.println("\nTotal = " + total);
    }
}

