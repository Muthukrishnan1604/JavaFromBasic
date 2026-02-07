package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {

    public static void main(String[] args) {

        String input = "Java is fun and java is powerful";

        if(input != null) {
            Map<String, Long> result = Arrays.stream(input.split(" "))
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            System.out.println(result);
        }
    }

}
