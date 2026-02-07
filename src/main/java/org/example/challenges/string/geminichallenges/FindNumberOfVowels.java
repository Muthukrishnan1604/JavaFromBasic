package src.main.java.org.example.challenges.string.geminichallenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FindNumberOfVowels {

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Muthu Krishna", null, "Divya Muthu", "Hema");
        inputList.forEach(s -> System.out.println(findNumberOfVowels(s)));
    }

    public static int findNumberOfVowels(String input) {
        input = Optional.ofNullable(input).orElse("");
        Predicate<Character> vowelsPredicate = c-> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        input = input.toLowerCase();
        return (int) input.chars()
                .mapToObj(i -> (char) i)
                .filter(vowelsPredicate)
                .count();
    }
}
