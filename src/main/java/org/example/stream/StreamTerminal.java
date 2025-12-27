package src.main.java.org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamTerminal {

    public static void main(String[] args) {

        var result = IntStream.iterate(0, i -> i <= 1000, i -> i + 3)
                        .summaryStatistics();

        System.out.println(result);
        System.out.println(result.getMax());
        System.out.println(result.getMin());
        System.out.println(result.getAverage());
        System.out.println(result.getSum());
        System.out.println(result.getCount());

        var leapYearData = IntStream.iterate(2000, i -> i <= 2025, i -> i + 1)
                .filter(i -> i % 4 == 0)
                .peek(System.out::println)
                .summaryStatistics();

        System.out.println(leapYearData);

        // Check all values are greater than 5
        var matchingElement = IntStream.iterate(5, i -> i <= 20, i -> i + 1)
                .allMatch(i -> i >= 5);

        System.out.println(matchingElement);

        // Check any values are greater than 5
        var matchingElement1 = IntStream.iterate(1, i -> i <= 4, i -> i + 1)
                .anyMatch(i -> i >= 5);

        System.out.println(matchingElement1);

        // Check no values are greater than 5
        var matchingElement2 = IntStream.iterate(1, i -> i <= 4, i -> i + 1)
                .noneMatch(i -> i >= 5);

        System.out.println(matchingElement2);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        int[] intArray = integerList.stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(intArray));
    }

}
