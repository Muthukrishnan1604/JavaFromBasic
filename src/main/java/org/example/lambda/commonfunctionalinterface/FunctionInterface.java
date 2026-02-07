package src.main.java.org.example.lambda.commonfunctionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionInterface {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "Victor", "Divi", "Hepsi", "Muthu", "Hema"
        ));

        Function<Integer, String> myFunction = input -> "%s converted to String".formatted(String.valueOf(input));

        UnaryOperator<Integer> unaryOperator = (input) -> input * 100;

        Consumer<String> consumer = input -> {
            System.out.println(input);
            System.out.println("Before spliting ");
            System.out.println(input.charAt(0) + " - " + input );
        };

        System.out.println(myFunction.apply(100));

        System.out.println(unaryOperator.apply(1000));

        list.forEach(consumer);

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());

        System.out.println("-".repeat(30));

        list.forEach(System.out::println);

        String[] emptyString = new String[10];

        System.out.println(Arrays.toString(emptyString));

        Arrays.fill(emptyString, "");

        System.out.println(Arrays.toString(emptyString));

        Arrays.setAll(emptyString, i -> "" + (i + 1) + ". ");
        System.out.println(Arrays.toString(emptyString));
        
        Arrays.setAll(emptyString, i -> "" + (i + 1) + ". "
         + switch (i) {
            case 0 -> "one";
            case 1 -> "two";
            case 2 -> "three";
            default -> "";
        });
        System.out.println(Arrays.toString(emptyString));

    }

}
