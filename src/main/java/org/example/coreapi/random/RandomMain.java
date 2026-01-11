package src.main.java.org.example.coreapi.random;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", random.nextInt((int) 'A', (int) 'Z' + 1));
        }
        System.out.println("-".repeat(20));
        for(int i = 0; i < 10; i++) {
            System.out.printf("%1$d %n", random.nextInt());
        }
        System.out.println("-".repeat(20));

        random.ints().limit(10).forEach(System.out::println);

        System.out.println("-".repeat(20));

        random.ints(0, 10).limit(10).forEach(System.out::println);

        System.out.println("-".repeat(20));

        random.ints(2, 10, 20).forEach(System.out::println);
    }

}
