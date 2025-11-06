package MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Diya", "Kabir", "Lavanya");
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Names in Uppercase:");
        upperNames.forEach(System.out::println);
    }
}
