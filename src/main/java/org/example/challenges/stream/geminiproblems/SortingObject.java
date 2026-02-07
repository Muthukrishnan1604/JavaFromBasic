package src.main.java.org.example.challenges.stream.geminiproblems;

/*
Problem Statement -

Sorting Objects: Given a list of Person objects (fields: String name, int age), sort the list by age in descending order.

Input: [Alice(25), Bob(30), Charlie(20)]

Expected Output: [Bob(30), Alice(25), Charlie(20)]
 */

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortingObject {

    public static void main(String[] args) {

        List<Person> personList = List.of(new Person("Divi", 25),
                new Person("Muthu", 30),
                new Person("Hema", 20));

        List<Person> result = personList.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Person::age).reversed())
                .toList();

        System.out.println(result);

    }

}
