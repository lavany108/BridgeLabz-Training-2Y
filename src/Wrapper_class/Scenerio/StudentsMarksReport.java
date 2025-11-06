package Wrapper_class.Scenerio;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Objects;

public class StudentsMarksReport {
    public static void main(String[] args) {
        List<Object> rawMarks = Arrays.asList(
                "85",
                95,
                Integer.valueOf(88),
                "null",
                "72",
                null,
                "invalid_data"
        );
        List<Integer> validMarks = new ArrayList<>();
        for (Object item : rawMarks) {
            if (Objects.nonNull(item)) {
                try {
                    Integer mark;
                    if (item instanceof String) {
                        String s = (String) item;
                        if (!s.equalsIgnoreCase("null")) {
                            mark = Integer.parseInt(s);
                            validMarks.add(mark);
                        }
                    } else if (item instanceof Integer) {
                        mark = (Integer) item;
                        validMarks.add(mark);
                    } else if (item instanceof Number) {
                        mark = ((Number) item).intValue();
                        validMarks.add(mark);
                    }
                } catch (NumberFormatException e) {
                }
            }
        }

        OptionalDouble average = validMarks.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Raw Input= " + rawMarks);
        System.out.println("Valid Marks= " + validMarks);

        if (average.isPresent()) {
            System.out.printf("Average Valid Mark: %.2f%n", average.getAsDouble());
        } else {
            System.out.println("No valid marks found!!");
        }
    }
}
