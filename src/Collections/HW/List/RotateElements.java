package Collections.HW.List;
import java.util.*;

public class RotateElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;
        System.out.println("Original List: " + numbers);
        List<Integer> rotatedList = rotateList(numbers, rotateBy);
        System.out.println("Rotated List by " + rotateBy + ": " + rotatedList);
    }
    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size;
        List<Integer> rotated = new ArrayList<>();
        for (int i = positions; i < size; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < positions; i++) {
            rotated.add(list.get(i));
        }
        return rotated;
    }
}