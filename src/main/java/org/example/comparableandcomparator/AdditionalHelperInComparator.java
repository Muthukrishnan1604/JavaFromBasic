package src.main.java.org.example.comparableandcomparator;

import java.util.*;

record Employee(long employeeId, String name, String lastName) {

}

public class AdditionalHelperInComparator {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(new Employee(1L, "Muthu", "Krishna"),
                new Employee(2L, "Divi", "Muthu"),
                new Employee(4L, "Baby", "Muthu"),
                new Employee(3L, "Hema", "Priya")));

        Comparator<Employee> employeeComparator = (e1, e2)  -> e2.lastName().compareTo(
                e1.lastName());

        employees.sort(employeeComparator.reversed());

        employees.forEach(System.out::println);

        System.out.println("In Arrays doing the same logic");

        Employee[] employees1 = {new Employee(1L, "Muthu", "Krishna"),
                new Employee(4L, "MyBaby", "Muthu"),
                new Employee(2L, "Divi", "Muthu"),
                new Employee(3L, "Hema", "Priya")};

        Arrays.sort(employees1, employeeComparator.reversed());

        System.out.println(Arrays.toString(employees1));

        System.out.println("-".repeat(20));

        employees.sort(Comparator.comparing(Employee::lastName).thenComparing(Employee::name));

        System.out.println(employees);

    }
}
