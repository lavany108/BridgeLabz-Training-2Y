package Maps;
import java.util.HashMap;
import java.util.Map;

public class FindMaxKey {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("A", 10);
        scoreMap.put("B", 20);
        scoreMap.put("C", 15);
        scoreMap.put("D", 5);
        String keyWithHighestValue = null;
        int maxValue = Integer.MIN_VALUE;
        System.out.println("Input Map: " + scoreMap);
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            String currentKey = entry.getKey();
            int currentValue = entry.getValue();
            if (currentValue > maxValue) {
                maxValue = currentValue;
                keyWithHighestValue = currentKey;
            }
        }
        System.out.println("The key with the maximum value is: " + keyWithHighestValue);
    }
}