package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GeminiPracticeQuestion1 {

    public static void main(String[] args) {

        List<String> inputList = Arrays.asList("apple", "bat", "cherry", "date", "eggplant");

        List<String> result = inputList.stream()
                .filter(Objects::nonNull)
                .filter(str -> str.length() > 3)
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);

    }

}
