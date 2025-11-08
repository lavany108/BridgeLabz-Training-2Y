package Collections.CW;
import java.util.*;

public class EmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        if (list.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList before: " + list);
            list.clear();
            System.out.println("Now ArrayList: " + list);
        }
    }
}