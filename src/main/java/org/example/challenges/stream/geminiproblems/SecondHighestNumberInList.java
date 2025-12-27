package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SecondHighestNumberInList {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(12, 45, 7, 34, 9, 100, 2);

        Optional<Integer> result = integerList.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        result.ifPresent(System.out::println);
    }

}
