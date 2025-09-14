package src.main.java.org.example.challenges.string.geminichallenges;

import java.util.ArrayList;
import java.util.List;

public class ReverseTheOrderOFWords {

    public static void main(String[] args) {
        String input = "Divya";
        String lineSeperator = "-".repeat(50);
        System.out.println(lineSeperator);
        System.out.println(input);
        System.out.println(lineSeperator);
        System.out.println(reverseWords(input));

        System.out.println(lineSeperator);
        System.out.println("Approach 2");
        System.out.println(lineSeperator);
        System.out.println(reverseWordsApproach2(input));
    }

    private static String reverseWords(String input) {
        String[] splitBySpace = input.split(" ");
        StringBuilder reverse = new StringBuilder();

        for(int i = splitBySpace.length - 1; i >= 0; i--) {
            reverse.append(splitBySpace[i]);
            reverse.append(" ");
        }
        return reverse.toString();
    }

    private static String reverseWordsApproach2(String input) {
        List<String> splitBySpace = splitBySpace(input);
        StringBuilder reverse = new StringBuilder();

        for(int i = splitBySpace.size() - 1; i >= 0; i--) {
            reverse.append(splitBySpace.get(i));
            reverse.append(" ");
        }

        return reverse.toString();
    }

    private static List<String> splitBySpace(String input) {
        int indexOfSpace = input.indexOf(" "), i = 0;
        List<String> result = new ArrayList<>();

        while (indexOfSpace < input.length()) {
            if(indexOfSpace == -1) {
                result.add(input.substring(i, input.length()));
                break;
            }
            result.add(input.substring(i, indexOfSpace));
            i = indexOfSpace + 1;
            indexOfSpace = input.indexOf(" ", i, input.length());
        }
        return  result;
    }
}
