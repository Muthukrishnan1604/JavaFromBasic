package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.List;
import java.util.Objects;

/*
Problem Statement

Sum of Integers: Given a list of integers, find the sum of all elements specifically using the sum() method of an IntStream.

Input: List.of(1, 2, 3, 4, 5)

Output: 15
 */

public class SumOFIntegers {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);

        int sumOFInteger = integerList.stream()
                .filter(Objects::nonNull)
                .mapToInt(integer -> integer)
                .sum();


        int sumUsingReduce = integerList.stream()
                .filter(Objects::nonNull)
                .reduce(0, Integer::sum);

        System.out.println(sumOFInteger);

        System.out.println(sumUsingReduce);

    }

}
