package src.main.java.org.example.challenges.string.geminichallenges;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        isAnagram("Muthu", "Divya");
    }

    private static boolean isAnagram(String input1, String input2) {
        
        Map<Character, Integer> result = new HashMap<>();
        Character key;
        if(input1.length() != input2.length()) {
            return false;
        } else if(input1.length() == 1) {
            return input1.equalsIgnoreCase(input2);
        } else {
            extracted(input1, result);
        }
        System.out.println(result);

        return true;
    }

    private static void extracted(String input1, Map<Character, Integer> result) {
        Character key;
        for(int i = 0; i < input1.length(); i++) {
            key = input1.charAt(i);
            if(result.containsKey(key)) {
                result.put(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }
        }
    }
}
