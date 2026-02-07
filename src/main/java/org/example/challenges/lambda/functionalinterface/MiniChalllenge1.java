package src.main.java.org.example.challenges.lambda.functionalinterface;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;

public class MiniChalllenge1 {

    public static void main(String[] args) {

        Consumer<String> printTheParts = (s) -> {
            String[] parts = s.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
        };

        String str = new String("Muthu");
        String str2 = "D I V Y A";

        printParts(printTheParts, str2);
        printParts(printTheParts, str);

        Consumer<String> printWords = (s) -> {
            String[] parts = s.split(" ");
            Arrays.asList(parts).forEach(System.out::println);
        };

        printParts(printWords, str2);

        Consumer<String> printWordsConcise = (s) -> {
            Arrays.asList(s.split(" ")).forEach(System.out::println);
        };

        printParts(printWordsConcise, str2);
    }

    public static <T extends String> void printParts(Consumer<T> consumer, T value) {
        consumer.accept(value);
    }

}
