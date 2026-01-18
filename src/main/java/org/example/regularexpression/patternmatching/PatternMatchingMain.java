package src.main.java.org.example.regularexpression.patternmatching;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingMain {

    public static void main(String[] args) {

        String sentence = "I like B.M.W motorcycles.";

        boolean matched = Pattern.matches("^[A-Z].*[.]$", sentence);
        System.out.println(matched + ": " + sentence);

        Pattern firstPattern = Pattern.compile("[A-Z].*?[.]");
        var matcher = firstPattern.matcher(sentence);
        System.out.println(matcher.matches() + ": " + sentence);

        System.out.println("Sentence Length " + sentence.length());
        System.out.println("Matched Ending Index: " + matcher.end());

        System.out.println(matcher.lookingAt() + ":" + sentence);
        System.out.println("Matched Ending Index: " + matcher.end());
        System.out.println("Matched on : " + sentence.substring(0, matcher.end()));

        matcher.reset();
        System.out.println(matcher.find() + ":" + sentence);
        System.out.println("Matched Ending Index: " + matcher.end());
        System.out.println("Matched on : " + sentence.substring(matcher.start(), matcher.end()));

        System.out.println("Matched on : " + matcher.group());

        String htmlSnippet = """
                
                <h1>My Heading</h1>
                <H2>Sub-Heading</H2>
                <p>This is a paragraph about something.</p>
                <p>This is another paragraph about something else.</p>
                <h3>Summary</h3>              
                """;

        Pattern htmlPattern = Pattern.compile("<[Hh](\\d)>(.*)</[Hh](\\d)>");
        Matcher htmlMatcher = htmlPattern.matcher(htmlSnippet);

        while (htmlMatcher.find()) {
            System.out.println("group: " + htmlMatcher.group());
            System.out.println("group: " + htmlMatcher.group(0));
            System.out.println("group: " + htmlMatcher.group(1));
            System.out.println("group: " + htmlMatcher.group(2));

            System.out.println(htmlMatcher.start(0));
        }

        htmlMatcher.reset();
        htmlMatcher.results().forEach(matchResult -> System.out.println(matchResult.group(1) + " " + matchResult.group(2) + " " + matchResult.group(3)));

        String tabbedText = """ 
                group1  group2  group3
                1   2   3
                a   b   d
                """;

        tabbedText.lines()
                .flatMap(s ->  Pattern.compile("\\t").splitAsStream(s))
                .forEach(System.out::println);

        htmlMatcher.reset();
        String updatedSnippet = htmlMatcher.replaceFirst((mr) ->
                "<em>" + mr.group(2) + "</em>");
        System.out.println("-".repeat(30));
        System.out.println(updatedSnippet);
        System.out.println(htmlMatcher.start() + " : " + htmlMatcher.end());
        System.out.println(htmlMatcher.group(2));

        htmlMatcher.usePattern(
                Pattern.compile("<([hH]\\d)>(.*)</\\1>"));
        htmlMatcher.reset();
        System.out.println("-".repeat(30));
        System.out.println("Using Back Reference: \n" +
                htmlMatcher.replaceFirst(mr -> "<em>$2</em>"));

        String replacedHTML = htmlMatcher.replaceAll((mr) ->
                "<em>" + mr.group(2) + "</em>");
        System.out.println("-".repeat(20));
        System.out.println(replacedHTML);
    }

}
