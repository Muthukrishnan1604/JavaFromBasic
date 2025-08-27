package src.main.java.org.example.challenges.lambda.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}

public class ConstructorReferenceChallenge {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // TODO: Use a constructor reference to map each name in the `names` list
        // to a new `Person` object.
        Function<String, Person> personCreator = Person::new; // Your code here

        List<Person> people = new ArrayList<>();
        for (String name : names) {
            people.add(personCreator.apply(name));
        }

        System.out.println(people);
    }
}