package java_fundamentals;

import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius= input.nextDouble();
        double farenheit= (celcius * 9 / 5) + 32;
        System.out.println(farenheit);
    }
}