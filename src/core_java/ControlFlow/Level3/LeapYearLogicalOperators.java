package core_java.ControlFlow.Level3;
import java.util.Scanner;

public class LeapYearLogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("This program works only for years >= 1582!!");
        } else {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("Leap Year");
            } else {
                System.out.println(" Not a Leap Year");
            }
        }
    }
}
