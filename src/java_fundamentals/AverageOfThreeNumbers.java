package java_fundamentals;
import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double firstNum=input.nextDouble();
        double secondNum=input.nextDouble();
        double thirdNum=input.nextDouble();
        double average= (firstNum+secondNum+thirdNum)/3;
        System.out.println(average);
    }
}
