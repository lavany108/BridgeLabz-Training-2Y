package Maps;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java !! Java is fun, world.";
        String cleanText = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        String[] words = cleanText.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        System.out.println("Given Text: " + text);
        System.out.println("Word Frequency:- " + text);
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}