package Wrapper_class;
import java.util.Scanner;


public class PrimitivetoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int primitiveInt = scanner.nextInt();
        scanner.close();
        Integer wrapperInteger = primitiveInt;
        System.out.println("Primitive value=    " + primitiveInt);
        System.out.println("Wrapper value:  " + wrapperInteger);
    }
}