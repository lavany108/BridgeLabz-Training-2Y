package Wrapper_class.Scenerio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {5, 4, 3};
        ArrayList<Integer> objectRatings = new ArrayList<>(Arrays.asList(4, null, 5, 2, null, 1));
        List<Integer> finalRatings = new ArrayList<>();
        for (int rating : primitiveRatings) {
            finalRatings.add(rating);
        }
        finalRatings.addAll(objectRatings);

        System.out.println("Raw Ratings: " + finalRatings);
        OptionalDouble average = finalRatings.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average();
        if (average.isPresent()) {
            System.out.printf("Average Rating= %.2f%n", average.getAsDouble());
            System.out.println("Total Valid Ratings Count= " + finalRatings.stream().filter(Objects::nonNull).count());
        } else {
            System.out.println("No valid ratings found!!");
        }
    }
}
