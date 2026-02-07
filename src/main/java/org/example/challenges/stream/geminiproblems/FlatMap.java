package src.main.java.org.example.challenges.stream.geminiproblems;

/*
FlatMap Practice: Given a list containing multiple lists of integers, flatten them into a single sequential list of integers.

Input: List.of(List.of(1, 2), List.of(3, 4), List.of(5))

Expected Output: [1, 2, 3, 4, 5]
 */

import java.util.Collection;
import java.util.List;
import java.util.Objects;

/*
FlatMap Practice: Given a list containing multiple lists of integers, flatten them into a single sequential list of integers.

Input: List.of(List.of(1, 2), List.of(3, 4), List.of(5))

Expected Output: [1, 2, 3, 4, 5]
 */

public class FlatMap {

    public static void main(String[] args) {

        List<List<Integer>> input = List.of(List.of(1, 2), List.of(3, 4), List.of(5));

        List<Integer> result = input.stream()
                .filter(Objects::nonNull)
                .filter(integers -> !integers.isEmpty())
                .flatMap(Collection::stream)
                .toList();

        System.out.println(result);

    }

}
