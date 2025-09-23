package src.main.java.org.example.challenges.genai.map;

import java.util.Optional;
import java.util.stream.Collectors;

public class ChangeToUpperCase {

    public static void main(String[] args) {
        convertToUpperCase("muthu");
    }

    private static String convertToUpperCase(String input) {
        if(input != null && !input.isBlank()) {
            String result = input.chars()
                    .mapToObj(i -> (char) (i - 32))
                    .map(i -> Character.toString(i))
                    .collect(Collectors.joining());

            System.out.println(result);
            return result;
        }
        return "";
    }

}
