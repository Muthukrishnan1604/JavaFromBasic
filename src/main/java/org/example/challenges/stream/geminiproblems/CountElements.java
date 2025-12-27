package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Problem Statement -

Count Elements: Count how many strings in a list start with the letter "J" (case-sensitive).

Input: List.of("Java", "JavaScript", "Python", "C++", "Julia")

Output: 3
 */

public class CountElements {

    public static void main(String[] args) {

        List<String> stringList = List.of("Java", "JavaScript", "Python", "C++", "Julia");

        // Efficient Way
        Long count = stringList.stream()
                .filter(Objects::nonNull)
                .filter(str -> str.startsWith("J"))
                .count();

        // Another Way
        Long count1 = stringList.stream()
                .filter(Objects::nonNull)
                .filter(str -> str.startsWith("J"))
                .collect(Collectors.counting());


        System.out.println(count);

        System.out.println(count1);
    }

}
