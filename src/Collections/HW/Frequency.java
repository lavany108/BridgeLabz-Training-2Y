package Collections.HW;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = findFrequency(fruits);
        System.out.println("Input List: " + fruits);
        System.out.println("Frequency Map: " + frequencyMap);
    }
    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String item : list) {
            if (freqMap.containsKey(item)) {
                freqMap.put(item, freqMap.get(item) + 1);
            }
            else {
                freqMap.put(item, 1);
            }
        }
        return freqMap;
    }
}
