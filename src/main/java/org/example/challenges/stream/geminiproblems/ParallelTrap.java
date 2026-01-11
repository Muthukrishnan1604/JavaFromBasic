package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelTrap {

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 1000).boxed().toList();
        int[] sum = {0}; // An array to act as a mutable container

        numbers.parallelStream()
                .peek(System.out::println)
                .forEach(n -> sum[0] += n);

        System.out.println("Total Sum: " + sum[0]);
    }

}
