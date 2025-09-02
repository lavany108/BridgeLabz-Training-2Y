package core_java.ControlFlow.Level2;
import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amar's age= ");
        int ageAmar = sc.nextInt();
        System.out.print("Akbar's age= ");
        int ageAkbar = sc.nextInt();
        System.out.print("Anthony's age= ");
        int ageAnthony = sc.nextInt();
        System.out.print("Amar's height= ");
        int heightAmar = sc.nextInt();
        System.out.print("Akbar's height= ");
        int heightAkbar = sc.nextInt();
        System.out.print("Anthony's height= ");
        int heightAnthony = sc.nextInt();
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is Youngest Friend.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is youngest Friend.");
        } else {
            System.out.println("Anthony is youngest Friend.");
        }
        if (heightAmar>heightAkbar && heightAmar>heightAnthony) {
            System.out.println("Amar is tallest.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is tallest.");
        } else{
            System.out.println("Anthony is tallest.");
        }
    }
}



