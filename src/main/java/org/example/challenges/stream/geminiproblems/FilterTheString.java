package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.List;
import java.util.function.Predicate;

/*
Problem Statemment -

Filter and Collect: Given a list of strings, filter out all strings that have a length less than 4 and collect the
remaining strings into a new list.

Input: List.of("Muthu", "Divi", "Div", "Krishna")Goal: Keep strings where length $\ge 4$.
 */
public class FilterTheString {

    public static void main(String[] args) {

        List<String> stringList = List.of("Muthu", "Divi", "Div", "Krishna");

        Predicate<String> greaterThan4 = (str) -> str.length() > 4;

        List<String> result = stringList.stream()
                .filter(str -> str.length() > 4)
                .toList();

        List<String> result2 = stringList.stream()
                .filter(greaterThan4)
                .toList();

        System.out.println(result);

        System.out.println(result2);

    }

}
