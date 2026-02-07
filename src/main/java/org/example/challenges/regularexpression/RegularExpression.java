package src.main.java.org.example.challenges.regularexpression;

public class RegularExpression {

    public static void main(String[] args) {

        String input1 = "Hello, World!";

        System.out.println(input1.contains("Hello, World!"));

        String regex = "[a-zA-Z]+\\p{Punct}";

        String input = "Hi Hello, World! Muthu";

        System.out.println(input.matches(regex));

        System.out.println(input.replaceAll(regex, ""));

    }

}
