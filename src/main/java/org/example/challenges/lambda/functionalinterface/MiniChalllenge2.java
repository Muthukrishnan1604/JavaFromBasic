package src.main.java.org.example.challenges.lambda.functionalinterface;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MiniChalllenge2 {

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

        System.out.println(print(unaryOperator, "Muthu"));
    }

    public static <T extends String> T print(UnaryOperator<T> unaryOperator, T value) {
        return  unaryOperator.apply(value);
    }

}
