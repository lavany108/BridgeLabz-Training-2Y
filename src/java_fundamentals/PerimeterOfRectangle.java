package java_fundamentals;
import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length=input.nextDouble();
        double width=input.nextDouble();
        double perimeter=2*(length+width);
        System.out.println(perimeter);
    }
}
