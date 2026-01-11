package src.main.java.org.example.challenges.stream.geminiproblems;

/*
Infinite Streams:

Description: Generate an infinite stream of even numbers starting from 0. Skip the first 5 results and collect the next 10 into a list.

Expected Output: [10, 12, 14, 16, 18, 20, 22, 24, 26, 28]
 */

import java.util.List;
import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {

        List<Integer> result = Stream.iterate(0, i -> i + 2)
                .skip(5)
                .limit(10)
                .toList();

        System.out.println(result);
    }

}
