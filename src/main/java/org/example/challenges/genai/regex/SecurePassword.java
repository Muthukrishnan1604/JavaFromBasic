package src.main.java.org.example.challenges.genai.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecurePassword {

    public static void main(String[] args) {

        /*
        Challenge 4: The "Secure Password" Check
Goal: Most websites require a password to be somewhat complex. Your Task: Write a regex that matches a password only if:

It is exactly 8 characters long.

It consists only of uppercase letters, lowercase letters, and numbers.

It must end with two digits.
         */

        Pattern regex = Pattern.compile("^[A-Za-z0-9]{6}[0-9]{2}$");

        /*
        Challenge 5: The "HTML Tag" Stripper
Goal: You have a string like <h1>Hello World</h1> and you want to extract just the text "Hello World". Your Task: 1. Write a regex that matches an HTML tag (anything inside < >). 2. Use replaceAll to replace those tags with an empty string "".

Hint: Think about using .*? (the lazy wildcard) so it doesn't accidentally delete the text between the tags!
         */

        String htmlContent = """
                <h1>Hello World!</h1>
                """;

        String regex2 = "(<.*>)(.*?)(<.*>)";
        System.out.println(htmlContent.replaceAll(regex2, "$1"));
        System.out.println(htmlContent.replaceAll(regex2, "$2"));
        System.out.println(htmlContent.replaceAll(regex2, "$3"));

        String regex3 = "^[(]([0-9]{3})[)]\\s([0-9]{3})[-]([0-9]{4})$";
        String input = "(123) 456-7890";

        System.out.println(input.replaceAll(regex3, "$1"));
    }

}
