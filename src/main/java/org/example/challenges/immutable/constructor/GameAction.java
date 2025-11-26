package src.main.java.org.example.challenges.immutable.constructor;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}
