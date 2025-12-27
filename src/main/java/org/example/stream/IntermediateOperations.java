package src.main.java.org.example.stream;

import java.util.stream.IntStream;

public class IntermediateOperations {

    public static void main(String[] args) {

        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                .filter(Character::isAlphabetic)
                .filter(i -> Character.toUpperCase(i) > 'E')
                .forEach(d -> System.out.printf("%c", d));
        System.out.println();
        // Distinct to filter all the duplicates

        System.out.println("Distinct Operation");
        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                .filter(Character::isAlphabetic)
                .map(Character::toUpperCase)
                .distinct()
                .forEach(d -> System.out.printf("%c", d));

        // filter / takeWhile - Allows you to reduce the elements in the output stream

        System.out.println();
        System.out.println("Drop While");
        // dropWhile
        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                .filter(Character::isAlphabetic)
                .dropWhile(i -> Character.toUpperCase(i) <= 'E')
                .forEach(d -> System.out.printf("%c", d));

        // limit(long maxSize) - This reduces your stream to the size specified in the arguments

        // skip(long skipLimit) - Skip the number of elements mentioned in the param
        System.out.println("Skipping E");
        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                .filter(Character::isAlphabetic)
                .skip(5)
                .forEach(d -> System.out.printf("%c", d));
    }

}
