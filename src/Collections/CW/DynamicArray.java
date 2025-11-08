package Collections.CW;
import java.util.*;

public class DynamicArray {
    public static void main(String[] args) {
        Integer[] fixedArray = {10, 20, 30, 40};
        ArrayList<Integer> genericArray = new ArrayList<>(Arrays.asList(fixedArray));
        System.out.println("Fixed Array: " + Arrays.toString(fixedArray));
        System.out.println("Dynamic Array: " + genericArray);
    }
}
