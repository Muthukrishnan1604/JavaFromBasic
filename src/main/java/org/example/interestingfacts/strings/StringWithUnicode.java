package src.main.java.org.example.interestingfacts.strings;

/*
If we add unicode in between the String it will convert that
into a specific character and it will show it as String
 */

public class StringWithUnicode {

    public static void main(String... args) {
        String unicodeString = "\u0056\u0061\u006E\u0061\u006B\u0061\u006D\u0020" +
                "\u0064\u0061\u0020\u006D\u0061\u0070\u0075\u006C\u0061\u0020\u0075\u006E" +
                "\u0069\u0063\u006F\u0064\u0065\u0020\u006C\u0061\u0020\u0069\u0072\u0075\u006E\u0074\u0068\u0075";
        System.out.println(unicodeString);
    }
}
