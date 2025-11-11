package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMerger {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        Map<String, Integer> mergedMap = new HashMap<>();
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
        mergedMap.putAll(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int map2Value = entry.getValue();
            if (mergedMap.containsKey(key)) {
                int map1Value = mergedMap.get(key);
                int sum = map1Value + map2Value;
                mergedMap.put(key, sum);
            } else {
                mergedMap.put(key, map2Value);
            }
        }
        System.out.println(mergedMap);
    }
}