package src.main.java.org.example.lambda.commonfunctionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {
        Predicate<Boolean> booleanPredicate = b -> b != true;
        BiPredicate<Boolean, Boolean> booleanPredicate2 = (b, b1) -> b != b1;

        System.out.println(predicate(booleanPredicate, false));
        System.out.println(predicate(booleanPredicate, true));

        System.out.println(biPredicate(booleanPredicate2, false, false));
        System.out.println(biPredicate(booleanPredicate2, false, true));

        Predicate<String> stringPredicate = s -> s.length() > 3;
        BiPredicate<String, Integer> stringPredicate2 = (s, i) -> s.length() > i;

        System.out.println(predicate(stringPredicate, "Muthu"));
        System.out.println(predicate(stringPredicate, "Div"));
        System.out.println(biPredicate(stringPredicate2, "Div", 2));

    }

    public static <T> boolean predicate(Predicate<T> predicate, T input) {
        return predicate.test(input);
    }

    public static <T, U> boolean biPredicate(BiPredicate<T, U> predicate, T input, U input1) {
        return predicate.test(input, input1);
    }
}
