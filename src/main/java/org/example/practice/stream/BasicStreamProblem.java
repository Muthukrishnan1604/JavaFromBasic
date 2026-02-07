package src.main.java.org.example.practice.stream;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class BasicStreamProblem {

    public static void main(String[] args) {
        filterEvenNumber(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        mapToUpperCase(List.of("apple", "banana", "cherry"));
        countShortWords(List.of("sun", "moon", "star", "planet", "galaxy"));
    }

    static private void filterEvenNumber(List<Integer> input) {
        Predicate<Integer> isEven = inputNumber -> inputNumber % 2 == 0;

        List<Integer> result = input.stream()
                .filter(Objects::nonNull)
                .filter(isEven)
                .peek(System.out::println)
                .toList();

        System.out.println(result);
    }

    static private void mapToUpperCase(List<String> input) {

        List<String> result = input.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);
    }

    private static void countShortWords(List<String> input) {
        Predicate<String> isLengthLessThan5 = inputString -> inputString.length() < 5;

        Long result = input.stream()
                .filter(Objects::nonNull)
                .filter(isLengthLessThan5)
                .count();

        System.out.println(result);
    }
}
