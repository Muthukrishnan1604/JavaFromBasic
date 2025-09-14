package src.main.java.org.example.challenges.string.geminichallenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringPalindrome {

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("A man, a plan, a canal: Panama", null);
        //inputList.forEach(s -> System.out.println("Given Value " + s + " is" + (isPalindrome(s) ? " Palindrome" : " Not Palindrome")));

        System.out.println("-".repeat(30));
        inputList.forEach(s -> System.out.println("Given Value " + s + " is" + (isPalindromeApproach2(s) ? " Palindrome" : " Not Palindrome")));
    }

    public static boolean isPalindrome(String input) {
        String cleansedString = Optional.ofNullable(input).orElse("").replaceAll("[^0-9a-zA-Z]+", "");
        cleansedString = cleansedString.replaceAll(" ", "");
        System.out.println(cleansedString);

        StringBuilder reverseString = new StringBuilder(cleansedString);
        reverseString.reverse();

        return cleansedString.equalsIgnoreCase(reverseString.toString());
    }

    public static boolean isPalindromeApproach2(String input) {
        String cleansedString = Optional.ofNullable(input).orElse("").replaceAll("[^0-9a-zA-Z]+", "");
        cleansedString = cleansedString.replaceAll(" ", "");
        System.out.println(cleansedString);

        int left = 0, right = cleansedString.length() - 1;
        char tmp;

        char[] reversedString = cleansedString.toCharArray();

        while (left < right) {
            tmp = reversedString[left];
            reversedString[left] = reversedString[right];
            reversedString[right] = tmp;
            left++;
            right--;
        }

        String result = new String(reversedString);
        return cleansedString.equalsIgnoreCase(result);
    }
}
