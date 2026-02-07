package src.main.java.org.example.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Review {

    public static void main(String[] args) {

        String phoneList = """
                (800) 123-4567
                (800)123-4567
                (800) 123 4567
                800-123-4567
                800 123-4567
                800 123 4567
                8001234567
                """;

        Pattern phonePattern = Pattern.compile("\\(*[0-9]{3}[)\\s-]*[0-9]{3}[)\\s-]*[0-9]{4}");
        Matcher matcher = phonePattern.matcher(phoneList);
        matcher.results()
                        .forEach(mat -> System.out.println(mat.group()));
        System.out.println("-".repeat(20));

    }

}
