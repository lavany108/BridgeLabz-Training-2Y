package core_java.level1;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        double areaInCm = area * 6.4516;
        System.out.println("Area of triangle: " + area + " square inches or " + areaInCm + " square centimeters");
    }
}
