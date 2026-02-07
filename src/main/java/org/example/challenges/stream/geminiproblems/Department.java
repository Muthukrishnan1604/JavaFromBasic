package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Employee> employeeList = new ArrayList<>();

    private String departmentName;

    public Department(String departmentName, List<Employee> employeeList) {
        this.departmentName = departmentName;
        this.employeeList.addAll(employeeList);
    }

    public List<Employee> getEmployeeList() {
        return List.copyOf(this.employeeList);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Department [ DepartmentName = " + this.departmentName + ", Employees = [ " + this.employeeList + " ] ";
    }

}
