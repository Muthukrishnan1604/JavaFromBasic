package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/*
Problem Statement -

Convert to Uppercase: Take a list of strings (including potential nulls or mixed cases) and transform each string to its uppercase version.

Input: List.of("Muthu", "Divi", "div", "KriShna")
 */

public class ConvertToUpperCase {

    public static void main(String[] args) {

        List<String> stringList = List.of("Muthu", "Divi", "div", "KriShna");

        Function<String, String> toUpperCase = String::toUpperCase;

        List<String> result = stringList.stream()
                .filter(Objects::nonNull)
                .map(toUpperCase)
                .toList();

        List<String> result1 = stringList.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);

        System.out.println(result1);

    }

}
