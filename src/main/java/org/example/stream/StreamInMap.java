package src.main.java.org.example.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StreamInMap {

    public static void main(String[] args) {

        Map<Character, int[]> myMap = new LinkedHashMap<>();
        int bingoIndex = 1;

        for(char c : "BINGO".toCharArray()) {
            int[] numbers = new int[15];
            int labelNo = bingoIndex;
            Arrays.setAll(numbers, i -> i + labelNo);
            myMap.put(c, numbers);
            bingoIndex += 15;
        }

        myMap.entrySet().stream()
                .map(e -> e.getKey() + " has range " + e.getValue()[0] + " - " +
                        e.getValue()[e.getValue().length - 1])
                .forEach(System.out::println);
    }

}
