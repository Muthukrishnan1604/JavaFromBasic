package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.List;
import java.util.Objects;

public class MultiplyTheList {

    public static void main(String[] args) {

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0);

        Double result = doubleList.stream()
                .filter(Objects::nonNull)
                .reduce(1.0, (a, b) -> a * b);

        System.out.println(result);

    }

}
