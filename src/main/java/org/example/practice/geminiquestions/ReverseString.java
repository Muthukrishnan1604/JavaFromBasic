package src.main.java.org.example.practice.geminiquestions;

/*
Write a Java program to reverse a given string without using any built-in reverse() methods.
The input can be a single word or a sentence.
 */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {
        List<String> inputList = List.of("Malayalam", "kerala", "Tamilnadu");

        inputList.forEach(input -> {
            System.out.println("Brute Force Approach -> " + reverseStringBruteForce(input));
            System.out.println("Efficient Approach -> " + reverseString(input));
            System.out.println("Stream Approach -> " + reverseStringUsingStream(input));
        });

    }

    private static String reverseString(String input) {
        int leftIndex = 0, rightIndex = input.length() - 1;
        char[] characterArray = input.toCharArray();
        char temp;
        while (leftIndex <= rightIndex) {
            temp = characterArray[leftIndex];
            characterArray[leftIndex] = characterArray[rightIndex];
            characterArray[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return new String(characterArray);
    }

    private static String reverseStringBruteForce(String input) {
        StringBuilder builder = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--) {
            builder.append(input.charAt(i));
        }
        return builder.toString();
    }

    private static String reverseStringUsingStream(String input) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> String.valueOf(input.charAt(input.length() - 1 - i)))
                .collect(Collectors.joining(""));
    }
}
