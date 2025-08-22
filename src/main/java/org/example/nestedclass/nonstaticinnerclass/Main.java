package src.main.java.org.example.nestedclass.nonstaticinnerclass;

import src.main.java.org.example.nestedclass.staticinnerclass.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(1001, "Muthu", 2019, "Test"),
                new StoreEmployee(1002, "Divya", 2021, "Best"),
                new StoreEmployee(1003, "Hema", 2026, "Fest")));

        System.out.println("Before sort");

        for (var storeEmployee : storeEmployees) {
            System.out.println(storeEmployee);
        }

        StoreEmployee storeEmployee = new StoreEmployee();

        var comparator = storeEmployee.new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (var emp : storeEmployees) {
            System.out.println(emp);
        }

    }

}
