package core_java.ControlFlow.Level1;

import java.util.Scanner;

public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int experience = sc.nextInt();
        if (experience > 5) {
            double bonus = 0.05 * salary;  // 5% of salary
            System.out.println("Bonus Amount= " + bonus);
        } else {
            System.out.println("No bonus for Years of service less than 5");
        }
    }
}
