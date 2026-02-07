package src.main.java.org.example.strings;

/*
Interview Tips and Common Questions
== vs. equals(): This is a classic.

== checks if two references point to the exact same object in memory.

equals() checks if two String objects have the same sequence of characters.

Always use equals() or equalsIgnoreCase() for content comparison of Strings.

When to use equalsIgnoreCase()? When case sensitivity is not important, e.g., comparing user input where capitalization might vary.

What's the return value of compareTo()? Explain the negative, zero, positive convention.

How does contentEquals() differ from equals()? contentEquals() can compare a String with any CharSequence (like StringBuilder or StringBuffer), while equals() strictly compares a String with another String object.

How to check if a string contains another string (case-insensitively)? You'd typically convert both to toLowerCase() (or toUpperCase()) and then use contains().

"Hello World".toLowerCase().contains("world")

Performance implications: While generally fast, be aware that methods like contains(), startsWith(), endsWith(), equals() typically involve iterating through characters, so their performance is often proportional to the length of the strings (O(N)).

Null checks: Emphasize the importance of null checks before calling instance methods on strings to avoid NullPointerException.

if (myString != null && myString.equals("expected"))

A safer alternative: if ("expected".equals(myString)) (if "expected" is a literal, it's never null).

Practical Application Scenarios
User Authentication: Comparing entered passwords with stored ones (usually equals for hashed passwords, or equalsIgnoreCase for usernames).

Data Validation: Ensuring input matches required patterns (e.g., startsWith("http://"), matches("[A-Z]{3}\\d{4}")).

Sorting: Implementing custom sorting logic for lists of strings using compareTo() or compareToIgnoreCase().

Search Functionality: Finding specific keywords or phrases within larger text bodies (contains()).

File Processing: Checking file extensions (endsWith(".txt")).
 */

public class StringComparisonMethod {

    public static void main(String[] args) {
        String input = "Hello Divya!";

        String lowerCaseInput = input.toLowerCase();

        if(!input.isEmpty() && input.equals(lowerCaseInput)) {
            System.out.println("Values match exactly");
        }

        if(!input.isEmpty() && input.equalsIgnoreCase(lowerCaseInput)) {
            System.out.println("Values match by ignoring the case");
        }

        if(input.startsWith("Hello")) {
            System.out.println("Starts with Hello");
        }

        if(input.endsWith("Divya!")) {
            System.out.println("Ends with Divya!");
        }

        if(input.contains("Divya")) {
            System.out.println("Input contains Divya in it");
        }

        if(input.contentEquals("Hello Divya!")) {
            System.out.println("Content Equals will be used for checking String builder");
        }

    }
}
