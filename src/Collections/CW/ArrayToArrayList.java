package Collections.CW;
import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C++"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + list);
    }
}
