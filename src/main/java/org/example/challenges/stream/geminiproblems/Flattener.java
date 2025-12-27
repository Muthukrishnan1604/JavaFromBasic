package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Flattener {

    public static void main(String[] args) {

        Employee muthu = new Employee("Muthu");

        Employee divi = new Employee("Divi");

        Employee hema = new Employee("Hema");

        List<Department> departmentList = List.of(new Department("ECE", Arrays.asList(muthu, divi)),
                new Department("Medical", List.of(divi)),
                new Department("CSC", Arrays.asList(muthu, hema)),
                new Department("EIE", Arrays.asList(hema, divi)));

        Set<String> result = departmentList.stream()
                .filter(Objects::nonNull)
                .flatMap(i -> i.getEmployeeList().stream().map(Employee::name))
                .collect(Collectors.toSet());

        System.out.println(result);
    }

}
