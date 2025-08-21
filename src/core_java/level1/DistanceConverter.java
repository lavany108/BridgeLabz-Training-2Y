package core_java.level1;
import java.util.Scanner;
public class DistanceConverter {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double feet = sc.nextDouble();
            double yards = feet / 3.0;
            double miles = yards / 1760.0;

            System.out.println("Distance in yards = " + yards + ", Distance in miles = " + miles);
        }
    }

