package src.main.java.org.example.challenges.lambda.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class LambdaChallenge {

    private static Random random = new Random();

    public static void main(String[] args) {

        String[] names = {"Bob", "Anna", "Malayalam", "DiVYa", "MuTHU"};
        Supplier<Integer> supplier = () -> random.nextInt(0, names.length);

        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("--> Transform to Uppercase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));

        backedByArray.forEach(System.out::println);

        List<String> newList = new ArrayList<>(List.of(names));

        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") + 1)));
        newList.forEach(li -> System.out.println(li));

    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1) ;
    }

    public static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString() ;
    }

}
