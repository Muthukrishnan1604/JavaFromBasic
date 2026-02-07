package src.main.java.org.example.challenges.stream;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class PrintStream {

    public static void main(String[] args) {

        AtomicInteger seed = new AtomicInteger(46);

        Stream.Builder<String> stringBuilder = Stream.builder();

        String[] strings = new String[15];

        List<String> list = new ArrayList<>();

        for(int i = 1; i <= 15; i++) {
            stringBuilder.add("B" + i);
            strings[i - 1] = "I" + (i + 15);
            list.add("N" + (i + (15 * 2)));
        }
        Stream<String> stringStream1 = stringBuilder.build();
        Stream<String> stringStream2 = Arrays.stream(strings);
        Stream<String> stringStream3 = list.stream();
        Stream<String> stringStream4 = Stream.iterate(46, i -> i + 1).map(i -> "G" + i).limit(15);
        Stream<String> stringStream5 = Stream.of("O61","O62","O63","O64","O65","O66","O67","O68","O69","O70","O71", "O72", "O73", "O74", "O75");
        Stream<String> stringStream = Stream.concat(Stream.concat(Stream.concat(Stream.concat(stringStream1, stringStream2), stringStream3), stringStream4), stringStream5);

        stringStream.forEach(System.out::println);

        stringStream1.forEach(System.out::println);
    }

}
