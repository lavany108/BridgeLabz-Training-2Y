package Collections.CW;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("Original list: " + list);
        System.out.println("Unique list: " + uniqueList);
    }
}
