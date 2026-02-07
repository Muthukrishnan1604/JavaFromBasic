package src.main.java.org.example.challenges.stream.geminiproblems;


/*
Problem Statement -

String Joining: Take a list of strings and join them into a single formatted string, separated by commas and enclosed in square brackets.

Input: List.of("Alice", "Bob", "Charlie")

Expected Output: "[Alice, Bob, Charlie]"
 */

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringJoining {

    public static void main(String[] args) {

        List<String> stringList = List.of("Alice", "Bob", "Charlie");

        String result = stringList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(result);

    }

}
