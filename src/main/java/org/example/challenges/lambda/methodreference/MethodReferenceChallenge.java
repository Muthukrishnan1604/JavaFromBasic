package src.main.java.org.example.challenges.lambda.methodreference;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MethodReferenceChallenge {

    private static final Random random = new Random();

    public static void main(String[] args) {
        String[] list = {" MutHU ", "DIvi", "He mA", "SamANthA ", " Asin"};

        List<UnaryOperator<String>> unaryOperatorList = new ArrayList<>(
                List.of(String::toUpperCase,
                        String::trim,
                        s -> s += " " + getRandomCharacter('D', 'M'),
                        s -> s += " " + reverse(s, 0, s.indexOf(" ")),
                         MethodReferenceChallenge::reverse,
                         String::new,
                         String::valueOf
                        )
        );

        applyChanges(list, unaryOperatorList);

    }

    private static String reverse(String input) {
       return reverse(input, 0, input.length());
    }

    private static String reverse(String input, int start, int end) {
        return new StringBuilder(input.substring(start, end)).reverse().toString();

    }

    private static char getRandomCharacter(char start, char end) {
        return (char) random.nextInt((int) start, (int) end + 1);
    }

    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions) {
        List<String> backedByArray = Arrays.asList(names);

        for(var function : stringFunctions) {
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }
}
