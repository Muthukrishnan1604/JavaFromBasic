package src.main.java.org.example.challenges.oops.inheritance;

/*
Your challenge is to create the Worker class, the Employee class,
and either the SalariedEmployee or the HourlyEmployee class.
For each class, create the attributes and methods shown on this diagram.
Create a main method that will create
either a SalariedEmployee or HourlyEmployee, and call the methods,
getAge, collectPay, and the method shown for the specific type of class you decide to implement.
 */

import java.time.LocalDate;

public class Worker {

    private String name;

    private String birthDate;

    private String endDate;


    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return  "Worker { name = " + this.name + " " +
                ", Date of Birth = " + this.birthDate + " , End Date = " + this.endDate;
    }

    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        int birthYear = Integer.parseInt(this.birthDate.substring(6));
        if(currentYear >= birthYear)
            return currentYear - birthYear;
        else
            return -1;
    }

    public double collectPay() {
        return 1.0d;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }
}
