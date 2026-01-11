package src.main.java.org.example.challenges.stream.geminiproblems;

/*
17. Lazy Evaluation (Peek): Write a code snippet using peek() that attempts to print elements of a stream,
but fails to print anything because a terminal operation is missing.
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PeekMain {

    public static void main(String[] args) {

        List<Integer> result = Stream.iterate(0, i -> i + 2)
                .peek(System.out::println)
                .skip(5)
                .peek(System.out::println)
                .limit(10)
                .peek((integer -> System.out.println(integer + 10)))
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .toList();

        System.out.println(result);
    }

}
