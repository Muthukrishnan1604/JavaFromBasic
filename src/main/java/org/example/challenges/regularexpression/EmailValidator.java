package src.main.java.org.example.challenges.regularexpression;

import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {

        String emailText = """
                
                """;

        Pattern pattern = Pattern.compile("([\\p{Alnum}-._]+)@(\\w+\\.\\w{2,})");

    }

}
