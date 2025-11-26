package src.main.java.org.example.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {

        // From collection object
        List<String> stringList = Arrays.asList("Test", "Test2", "Muthu", "Divi", "Hema", null);

        List<String> stringList2 = List.of("Test", "Test2", "Muthu", "Divi", "Hema");

        System.out.println(stringList2);

        Stream<String> stringStream = stringList2.stream();

        Stream<String> stringStream1 = Stream.of(Integer.toString(1), "Muthu", "Divi");

        Stream.Builder<String> stringBuilder = Stream.builder();

        Stream<String> stringStream2 = stringBuilder.add("Muthu").add("Divi").add("Hema").build();

        Stream<String> stringStream3 = Stream.iterate("Test", input -> input.concat(String.valueOf(new Random().nextInt(100, 1000)))).limit(10);

        stringStream3.forEach(System.out::println);

        int[] input = {1, 3, 5, 8};

        Arrays.stream(input);
    }

}
