package src.main.java.org.example.stream;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperationsPart2 {

    public static void main(String[] args) {
        int maxSeat = 100;
        int seatsInRow = 10;

        var stream = Stream.iterate(0, i -> i < maxSeat, i -> i + 1)
                .map(i -> new Seat((char) ('A' + i / seatsInRow), i % seatsInRow + 1))
                .sorted(Comparator.comparing(Seat::price).thenComparing(Seat::toString))
                .mapToDouble(Seat::price)
                .boxed()
                .map("%.2f"::formatted);

        stream.forEach(System.out::println);
    }

}
