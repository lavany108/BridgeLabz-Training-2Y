package core_java.ControlFlow.Level3;
import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        double firstNum = sc.nextDouble();
        System.out.print("Second number: ");
        double secondNum = sc.nextDouble();
        System.out.print("Operator: ");
        String op = sc.next();
        double result;
        switch (op) {
            case "+":
                result = firstNum + secondNum;
                System.out.println(result);
                break;
            case "-":
                result = firstNum - secondNum;
                System.out.println(result);
                break;
            case "*":
                result = firstNum * secondNum;
                System.out.println(result);
                break;
            case "/":
                if (secondNum != 0) {
                    result = firstNum / secondNum;
                    System.out.println(result);
                } else {
                    System.out.println("Division by zero is not allowed!!");
                }
                break;
            default:
                System.out.println("Invalid Operator!!");
                break;
        }
    }
}
