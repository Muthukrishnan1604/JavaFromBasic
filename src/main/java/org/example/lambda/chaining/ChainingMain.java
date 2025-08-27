package src.main.java.org.example.lambda.chaining;

import java.util.function.Function;

public class ChainingMain {

    public static void main(String[] args) {
        String name = "Muthu";
        Function<String, String> upperCase = String::toUpperCase;

        System.out.println(upperCase.apply(name));

        Function<String, String> lastName = s -> s.concat(" Krishna");

        Function<String, String> upperCaseLastName = lastName.andThen(upperCase);

        System.out.println(upperCaseLastName.apply(name));

        Function<String, String> chaining = lastName
                .andThen(String::toUpperCase)
                .andThen(s -> s.substring(0, s.lastIndexOf('U')));

        System.out.println(chaining.apply(name));



    }

}
