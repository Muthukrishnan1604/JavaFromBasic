package src.main.java.org.example.ltiinterview;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {
        String input = "ssatpzccSsp";

        var result = input.chars()
                .mapToObj(i -> (char) i)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .findFirst();

        result.ifPresent(System.out::println);

    }

}
