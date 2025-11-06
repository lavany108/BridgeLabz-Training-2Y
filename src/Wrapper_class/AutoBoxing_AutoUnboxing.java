package Wrapper_class;
import java.util.ArrayList;

public class AutoBoxing_AutoUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5);
        System.out.println("Numbers: " + numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}