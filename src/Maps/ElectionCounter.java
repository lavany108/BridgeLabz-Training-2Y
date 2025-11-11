package Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class ElectionCounter {
    public static void main(String[] args) {
        Map<String, Integer> voteCounts = new HashMap<>();
        List<String> votes = Arrays.asList(
                "Alice", "Bob", "Alice", "Charlie", "Alice",
                "Bob", "Alice", "Charlie", "Bob", "Charlie",
                "Alice"
        );
        for (String candidate : votes) {
            int currentVotes = voteCounts.getOrDefault(candidate, 0);
            int newVotes = currentVotes + 1;
            voteCounts.put(candidate, newVotes);
        }
        String winner = null;
        int maxVotes = -1;
        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            String candidate = entry.getKey();
            int count = entry.getValue();
            System.out.println("Candidate " + candidate + ": " + count + " votes");
            if (count > maxVotes) {
                maxVotes = count;
                winner = candidate;
            }
        }
        if (winner != null) {
            System.out.println("The winner is " + winner + " with " + maxVotes + " votes!!");
        } else {
            System.out.println("No votes were cast.");
        }
    }
}