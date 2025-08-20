package java_fundamentals;
import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius=input.nextDouble();
        double height=input.nextDouble();
        double volume= radius * radius * height * Math.PI;
        System.out.println(volume);
    }
}
