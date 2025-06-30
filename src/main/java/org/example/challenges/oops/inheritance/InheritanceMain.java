package src.main.java.org.example.challenges.oops.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Muthu", "16/04/1998", "16/07/2019");
        System.out.println(employee);
        System.out.println(employee.collectPay());
        System.out.println(employee.getAge());

        SalariedEmployee employee2 = new SalariedEmployee("Divi", "31/01/1998", "16/07/2019", 350000);
        System.out.println(employee2);
        System.out.println(employee2.collectPay());
        employee2.retire();

        Employee employee3 = new HourlyEmployee("Victor", "16/06/2015", "16/07/2025", 15.0d);
        System.out.println(employee3);
        System.out.println(employee3.collectPay());
        System.out.println(((HourlyEmployee) employee3).getDoublePay());
    }

}
