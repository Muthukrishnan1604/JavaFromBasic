package src.main.java.org.example.challenges.stream.geminiproblems;

/*
Description: Given a list of integers, return a list containing the square ($n^2$) of each unique integer.

Input: List.of(2, 3, 2, 4, 3)Expected Output: [4, 9, 16]
 */


import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class DistinctSquare {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(2, 3, 2, 4, 3);

        Function<Integer, Integer> square = (integer) -> integer * integer;

        List<Integer> result = integerList.stream()
                .filter(Objects::nonNull)
                .distinct()
                .map(square)
                .toList();

        List<Integer> result1 = integerList.stream()
                .filter(Objects::nonNull)
                .distinct()
                .map(integer -> integer * integer)
                .toList();

        System.out.println(result);

        System.out.println(result1);

    }

}
