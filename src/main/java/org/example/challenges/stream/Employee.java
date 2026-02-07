package src.main.java.org.example.challenges.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
    String name;
    String department;
    double salary;

    // Constructor, Getters, and toString() assumed
    public Employee(String n, String d, double s) { name=n; department=d; salary=s; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    @Override
    public String toString() { return name; }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 60000),
                new Employee("Jane", "HR", 50000),
                new Employee("Bob", "IT", 70000),
                new Employee("Alice", "Finance", 80000),
                new Employee("Eve", "HR", 55000),
                new Employee("Mike", "Finance", 90000)
        );

        Predicate<Employee> isITEmployee = (employee) -> "IT".equals(employee.getDepartment());

        Predicate<Employee> isSalaryGreaterThan55K = (employee) -> employee.getSalary() > 55_000;

        List<Employee> result = employees.stream()
                .filter(isITEmployee)
                .toList();

        System.out.println(result);

        List<Employee> employeeList = new ArrayList<>();

        Map<String, List<Employee>> mapValue = employees.stream()
                .filter(Objects::nonNull)
                .filter(isSalaryGreaterThan55K)
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(mapValue);

        Map<String, Double> highestSalariedEmployeeForEachDepartment = employees.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

        System.out.println(highestSalariedEmployeeForEachDepartment);

        var highestSalariedEmployeeForEachDepartmentq = employees.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.joining(",", "\"", "\""))));

        System.out.println(highestSalariedEmployeeForEachDepartmentq);

        String output = employees.stream()
                .collect(Collectors.teeing(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get),
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getSalary)), Optional::get), (max, min) -> "Min Salary: $%.2f | Max Salary: $%.2f".formatted(min.getSalary(), max.getSalary())));

        System.out.println(output);
    }
}


