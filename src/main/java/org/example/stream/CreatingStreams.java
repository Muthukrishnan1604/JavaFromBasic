package src.main.java.org.example.stream;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Different way to create streams
 */
public class CreatingStreams {

    public static void main(String[] args) {

        List<String> inputList = new ArrayList<>(Arrays.asList("Test", "Muthu", "Divi"));

        Stream<String> stream = inputList.stream();

        System.out.println(stream.collect(Collectors.joining(",")));

        String[] stringArray = {"Muthu", "Divi", "Hema"};

        Stream<String> arrayStream = Arrays.stream(stringArray);

        System.out.println(arrayStream.sorted((Comparator.reverseOrder())).collect(Collectors.joining(",")));

        Stream.Builder<String> builder = Stream.builder();
        Stream<String> builderStream = builder.add("Test").add("Muthu").build();
        System.out.println(builderStream.collect(Collectors.joining(",")));

        Stream<String> streamOf = Stream.of("1", "2");
        System.out.println(streamOf.collect(Collectors.joining(",")));

        Stream<String> stream1 = Stream.of("One", "Two", "Three").sorted(Comparator.reverseOrder());

        Stream<String> stream2 = Stream.of("Four", "Five", "Six").map(String::toUpperCase);

        Stream<String> concatedStream = Stream.concat(stream1, stream2).map(s -> s.charAt(0) + " - " + s);

        concatedStream.forEach(System.out::println);

        Random random = new Random();

        Stream.generate(() -> random.nextInt(2))
                .limit(10)
                .forEach(System.out::println);

        UnaryOperator<String> unaryOperator = s -> s.concat(String.valueOf(new Random().nextInt(10, 100)));

        String iterateStream = Stream.iterate("Test - ", unaryOperator)
                .peek(System.out::println)
                .limit(10)
                .collect(Collectors.joining(","));

        System.out.println(iterateStream);

        var iterateStream2 = Stream.iterate(1, n -> n + 1)
                .peek(System.out::println)
                .limit(10)
                .toList();

        System.out.println(iterateStream2);

        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);

        IntStream.iterate(1, n -> n < 100, n -> n + 1)
                .filter(CreatingStreams::isPrime)
                .forEach(System.out::println);
    }

    public static boolean isPrime(int input) {
        if(input <= 2) {
            return input == 2;
        }

        for(int i = 2; i <= input/2; i++) {
            if(input % i == 0)
                return false;
        }
        return true;
    }
}
