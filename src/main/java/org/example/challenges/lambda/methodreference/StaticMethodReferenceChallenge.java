package src.main.java.org.example.challenges.lambda.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class StaticMethodReferenceChallenge {

    // TODO: Write a static method that checks if a string is not empty.
    public static boolean isNonEmpty(String s) {
        Predicate<String> isNonEmpty = String::isEmpty;
        Predicate<String> isNonBlank = String::isBlank;

        return isNonEmpty.negate().and(isNonBlank.negate()).test(s) ;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "", "world", "java", "  ");

        // TODO: Use a static method reference to the `isNonEmpty` method
        // to filter the list.
        List<String> nonEmptyWords = words.stream()
                .filter(Objects::nonNull)
                .filter(StaticMethodReferenceChallenge::isNonEmpty)
                .toList();
        System.out.println("Original words: " + words);
        System.out.println("Non-empty words: " + nonEmptyWords);
    }
}