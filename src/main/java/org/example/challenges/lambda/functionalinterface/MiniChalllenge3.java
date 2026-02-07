package src.main.java.org.example.challenges.lambda.functionalinterface;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MiniChalllenge3 {

    public static void main(String[] args) {

        Predicate<Integer> isSecondIndex = index -> index % 2 == 1;

        UnaryOperator<String> unaryOperator = (s) -> {
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                if(isSecondIndex.test(i)) {
                    builder.append(s.charAt(i));
                }
            }
            return builder.toString();
        };

        System.out.println(everySecondCharacter(unaryOperator, "Muthu"));
        System.out.println(everySecondCharacter(unaryOperator, "1234567890"));

    }

    public static String everySecondCharacter(UnaryOperator<String> unaryOperator, String value) {
        return  unaryOperator.apply(value);
    }

}
