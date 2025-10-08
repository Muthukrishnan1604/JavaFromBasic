package src.main.java.org.example.challenges.genai.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheFruits {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "Apple", "Banana", "Cherry", "banana");

        Function<String, String> output = Function.identity();

        Map<String, Long> frequency = fruits.stream()
                .filter(Objects::nonNull)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);

        Map<String, Integer> length = fruits.stream()
                .filter(Objects::nonNull)
                .map(String::toLowerCase)
                .collect(Collectors.toMap(Function.identity(), String::length, (fruit1, fruit2) -> fruit2));

        System.out.println(length);

    }

}
