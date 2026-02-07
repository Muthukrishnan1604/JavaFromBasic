package src.main.java.org.example.regularexpression;

public class RegularExpressionMain {

    public static void main(String[] args) {

        String helloWorld = "%s %s !".formatted("Hello", "World");

        String helloWorld2 = String.format("%s %s !", "Hello", "World");

        System.out.println(helloWorld);

        System.out.println(helloWorld == helloWorld2);

        System.out.println(format("Hi %s %s !", "Hello", "World"));

        String testString = "Anyone can Learn abc's, 123's, and any regular expressions";

        String replacement = "(-)";

        /*
            [] -> Ithula kudukurathu ethuna onu match ana kuda eduthukum
            | -> Ithuvum ethuna oru character iruntha eduthukum
            [a-z] -> Ithu a to z small case ethunalum accept pannikum
            * -> Zero or more times
            + -> one or more times
            ? -> Zero or one time
            { n } -> Pattern must appear exactly n times
            { n, } -> pattern must appear atleast n times
            { n, m } -> pattern must appear atleast n times not more than m times

            ^ -> Matches to start of text
            $ -> matches to end of text
            \b -> matches to word
         */

        String[] patterns = {
                "ab|bc", "[123]", "[A]"
        };

        for(String pattern : patterns) {
            String output = testString.replaceFirst(pattern, replacement);

            System.out.println("Pattern : " + pattern + " => " + output);
        }

        System.out.println("-".repeat(20));
        String[] patterns2 = {
                "[a-z A-Z]", "[0-9]", "[A-Z]"
        };

        for(String pattern : patterns2) {
            String output = testString.replaceFirst(pattern, replacement);

            System.out.println("Pattern : " + pattern + " => " + output);
        }

        System.out.println("-".repeat(20));

        String[] patterns3 = {
                "[a-zA-Z]*", "[0-9]+", "[A-Z]*"
        };

        for(String pattern : patterns3) {
            String output = testString.replaceFirst(pattern, replacement);

            System.out.println("Pattern : " + pattern + " => " + output);
        }

        System.out.println("-".repeat(20));

        String[] patterns4 = {
                "[a-zA-Z]*", "[0-9]{2}", "[A-Z]*"
        };

        for(String pattern : patterns4) {
            String output = testString.replaceFirst(pattern, replacement);

            System.out.println("Pattern : " + pattern + " => " + output);
        }

        System.out.println("-".repeat(20));

        String[] patterns5 = {
                "[a-zA-Z]*$", "^[a-zA-Z]{3}", "[aA]ny\\b"
        };

        for(String pattern : patterns5) {
            String output = testString.replaceFirst(pattern, replacement);

            System.out.println("Pattern : " + pattern + " => " + output);
        }
    }

    private static String format(String regex, String... args) {
        int index = 0, argsIndex = 0;

        while(index < regex.length() - 1) {

            if(regex.charAt(index) == '%' && regex.charAt(index + 1) == 's') {
                regex = regex.replaceFirst("%s", args[argsIndex]);
                argsIndex++;
            }

            index++;
        }

        return regex;
    }

}
