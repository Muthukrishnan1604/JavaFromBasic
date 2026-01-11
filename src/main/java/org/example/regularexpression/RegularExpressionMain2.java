package src.main.java.org.example.regularexpression;

import java.util.Arrays;
import java.util.Scanner;

public class RegularExpressionMain2 {

    public static void main(String[] args) {

        String paragraph = """
                Double, double toil and trouble;
                Fire burn and caldron bubble.
                Fillet of a fenny snake,
                In the caldron boil and bake;
                Eye of newt and toe of frog,
                Wool of bat and tongue of dog,
                Adder's fork and blind-worm's sting,
                Lizard's leg and howlet's wing,
                For a charm of powerful trouble,
                Like a hell-broth boil and bubble.
                """;

        // Split based on the number of lines
        String[] result = paragraph.split("\\n");

        System.out.println(Arrays.toString(result));

        System.out.println("This paragraph has " + result.length + " lines");

        String[] splitBySpace = paragraph.split("\\s");

        System.out.println("This paragraph has " + splitBySpace.length + " words");

        String replaceString = paragraph.replaceAll("[a-zA-Z]+ble", "[GRUB]");

        System.out.println(replaceString);

        Scanner sc = new Scanner(paragraph);

        System.out.println(sc.delimiter());
        sc.useDelimiter("\\R");

        /*
        while (sc.hasNext()) {
            String element = sc.next();
            System.out.println(element);
        }
        */

        System.out.println(sc.findInLine("[a-zA-Z]+ble"));
        System.out.println(sc.findInLine("[a-zA-Z]+ble"));
        System.out.println(sc.findInLine("[a-zA-Z]+ble"));

        sc.tokens()
                .map(str -> str.replaceAll("\\p{Punct}", ""))
                .flatMap((str -> Arrays.stream(str.split("\\s+"))))
                .filter(s -> s.matches("[a-zA-Z]+ble"))
                .map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);

        sc.close();
    }

}
