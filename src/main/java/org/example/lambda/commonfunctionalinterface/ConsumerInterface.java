package src.main.java.org.example.lambda.commonfunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Victor", "Divi", "Hepsi", "Muthu"
        ));

        for (String val : list) {
            System.out.println(val);
        }

        list.forEach(System.out::println);

        Consumer<Main.Person> consumer =  (person) -> {
            System.out.println(person);
        };

        consumer.accept(null);

        System.out.println("-".repeat(20));

        String prefix = "nato";

        list.forEach(s -> {
            char first = s.charAt(0);
            System.out.println(prefix + " " + s + " means " + first);
        });

        String s = "Enclosing method's myString";


    }

}
