package src.main.java.org.example.challenges.oops.inheritance;

public class SalariedEmployee extends Employee {

    private double annualSalary;

    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = this.annualSalary / 26;
        return isRetired ?  (0.9 * payCheck): payCheck;
    }

    public void retire() {
        terminate("12/12/2025");
        this.isRetired = true;
    }

}
