package src.main.java.org.example.challenges.stream.geminiproblems;


/*
Problem Statement -

Find First: Given a list of integers, find the first element that is greater than 10. If no such element exists, return -1.

Input: List.of(5, 8, 12, 3, 15)

Expected Output: 12
 */

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FindFirstGreaterThan10 {

    public static void main(String[] args) {

            List<Integer> integerList = List.of(5, 8, 12, 3, 15);

            Integer findFirstValueGreaterThan10 = integerList.stream()
                    .filter(Objects::nonNull)
                    .filter(integer -> integer > 10)
                    .findFirst()
                    .orElse(-1);

            System.out.println(findFirstValueGreaterThan10);
    }

}
