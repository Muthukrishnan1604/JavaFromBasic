package src.main.java.org.example.stream;

import java.util.List;
import java.util.stream.IntStream;

public class StreamTerminalPart2 {

    public static void main(String[] args) {

        List<Integer> integerList = IntStream.iterate(1, i -> i <=100, i -> i + 1)
                                    .map(i -> i + 5)
                                    .boxed()
                                    .toList();

        integerList.forEach(System.out::println);

    }

}
