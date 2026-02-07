package src.main.java.org.example.challenges.stream.geminiproblems;

/*
Problem Statement -

Average Calculation: Find the average age of all Person objects in a list. Handle the empty list case by returning 0.0.

Input: [Alice(20), Bob(30), Charlie(40)]

Expected Output: 30.0

 */

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Average Calculation: Find the average age of all Person objects in a list. Handle the empty list case by returning 0.0.

Input: [Alice(20), Bob(30), Charlie(40)]

Expected Output: 30.0
 */

public class AverageOFAge {

    public static void main(String[] args) {

        List<Person> personList = List.of(new Person("Divi", 25),
                new Person("Muthu", 30),
                new Person("Hema", 20));

        Double result = personList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.averagingDouble(Person::age));

        Double result1 = personList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.teeing(Collectors.summingDouble(Person::age), Collectors.counting(), (sum, count) -> sum / count));

        System.out.println(result);

        System.out.println(result1);
    }

}
