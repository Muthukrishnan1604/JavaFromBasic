package src.main.java.org.example.nestedclass.staticinnerclass;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        simpleExample();

        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee(1001, "Muthu", 2019),
                new Employee(1002, "Divya", 2018),
                new Employee(1003, "Divi", 2021)
        ));

        sortWithName(employeeList);

        employeeList.sort(new Employee.EmployeeComparator<>("yearStarted"));
        System.out.println("-".repeat(10) + " Sort by Year " + "-".repeat(10));

        for (var e : employeeList) {
            System.out.println(e);
        }
    }

    private static void sortWithName(List<Employee> employeeList) {
        var comparator = new EmployeeComparator<>();
        employeeList.sort(comparator);
        System.out.println("-".repeat(10) + " Sort by Name " + "-".repeat(10));
        for (var e : employeeList) {
            System.out.println(e);
        }
    }

    private static void simpleExample() {
        StaticInnerClass.InnerClass innerClass = new StaticInnerClass.InnerClass(10);
        System.out.println(innerClass.getValueFromOuterClass());
        System.out.println(innerClass.getValueFromOuterClass());
        System.out.println(innerClass.getValueFromOuterClass());
        System.out.println(innerClass.getValueFromOuterClass());
    }

}
