package core_java.ControlFlow.Level2;
import java.util.Scanner;

public class PowerOfNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        if (num<0 || power<0){
            System.out.println("Enter positive integers only!!");
        } else {
            int result = 1;
            for (int i=1;i<=power;i++) {
                result*=num;
            }
            System.out.println(result);
        }
    }
}
