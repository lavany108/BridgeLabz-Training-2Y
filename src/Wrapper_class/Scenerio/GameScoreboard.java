package Wrapper_class.Scenerio;

import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import java.util.stream.Collectors;

public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] playerScores = {150, null, 220, 95, null, 300, null, 180};
        List<Integer> scoresList = Arrays.asList(playerScores);
        long nullScoreCount = scoresList.stream()
                .filter(Objects::isNull)
                .count();
        int totalScore = scoresList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("All Scores= " + scoresList);
        System.out.println("Players Not Played= " + nullScoreCount);
        System.out.println("Total Valid Score= " + totalScore);
    }
}
