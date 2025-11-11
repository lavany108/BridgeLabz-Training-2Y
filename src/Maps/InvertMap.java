package Maps;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);
        Map<Integer, List<String>> invertedMap = new HashMap<>();
        System.out.println("Original Map: " + originalMap);
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            String originalKey = entry.getKey();
            Integer originalValue = entry.getValue();
            if (invertedMap.containsKey(originalValue)) {
                List<String> keysList = invertedMap.get(originalValue);
                keysList.add(originalKey);
            } else {
                List<String> newKeysList = new ArrayList<>();
                newKeysList.add(originalKey);
                invertedMap.put(originalValue, newKeysList);
            }
        }

        System.out.println("Inverted Map: " + invertedMap);
    }
}