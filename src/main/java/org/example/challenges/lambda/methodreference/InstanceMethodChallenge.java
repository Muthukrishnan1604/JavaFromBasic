package src.main.java.org.example.challenges.lambda.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class InstanceMethodChallenge {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        // The list `colors` is the specific object we'll reference.

        // TODO: Use an instance method reference to find the index of "green".
        // The functional interface `BiPredicate` takes two arguments (a List and a String)
        // and returns a boolean.
        BiPredicate<List<String>, String> containsGreen = List::contains;
        boolean isGreenPresent = containsGreen.test(colors, "green");
        System.out.println("Is 'green' present? " + isGreenPresent);
    }
}