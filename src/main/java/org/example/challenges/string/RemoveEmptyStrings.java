package src.main.java.org.example.challenges.string;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveEmptyStrings {

    public static void main(String[] args) {
        String[] input = {"Java", " ", "", "Streams", "are", "cool"};

        System.out.println(removeEmptyString(input));

    }

    private static List<String> removeEmptyString(String[] inputList) {
        Predicate<String> nonEmptyChecker = String::isBlank;
        return Arrays.stream(inputList)
                .filter(Objects::nonNull)
                .filter(nonEmptyChecker.negate())
                .toList();
    }
}
