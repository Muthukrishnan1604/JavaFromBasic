package src.main.java.org.example.challenges.string;

import java.util.Arrays;
import java.util.List;

public class Pangram {

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("ab cdyygdgqedqwertyyuioplkjhgfdsazxcvbnm", null, "test");
        inputList.forEach(input ->  {
             System.out.println(isPangram(input));
        });
    }

    private static boolean isPangram(String input) {
        if(input != null && !input.isBlank()) {
            long count = input.toLowerCase().chars()
                    .mapToObj(i -> (char) i)
                    .filter(Character::isAlphabetic)
                    .distinct()
                    .count();
            System.out.println("Is Pangram " + (count == 26));
            return count == 26;
        }
        return false;
    }

}
