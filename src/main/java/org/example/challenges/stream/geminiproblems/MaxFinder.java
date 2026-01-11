package src.main.java.org.example.challenges.stream.geminiproblems;

/*
Max Finder: Find the Employee object (fields: String name, int salary, String dept) who has the highest salary within a specific department (e.g., "IT").

Input: IT Dept: [Emp1(50k), Emp2(70k), Emp3(60k)]

Expected Output: Emp2
 */

import java.util.*;
import java.util.stream.Collectors;

record Employees(String name, int salary, String dept) {
}

public class MaxFinder {

    public static void main(String[] args) {

        List<Employees> employees = List.of(
                new Employees("Alice", 50000, "IT"),
                new Employees("Bob", 70000, "IT"),
                new Employees("Charlie", 60000, "IT"),
                new Employees("David", 90000, "HR"),
                new Employees("Eve", 45000, "HR")
        );

        Optional<Employees> result = employees.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Employees::dept, Collectors.toList()))
                .entrySet()
                .stream()
                .filter((i) -> "IT".equalsIgnoreCase(i.getKey()))
                .flatMap(i -> i.getValue().stream())
                .max(Comparator.comparing(Employees::salary));

        System.out.println(result);
    }

}
