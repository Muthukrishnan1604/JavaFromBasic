package src.main.java.org.example.challenges.oops.constructor;

/*
Create a new class, called Customer, with three fields:
name
credit limit
email address.
Create the getter methods only for each field.  You don't need to create the setters.

Create three constructors for this class:
First, create a constructor for all three fields which should assign
the arguments directly to the instance fields.
Second, create a no-args constructor that calls another constructor,
passing some literal values for each argument.
And lastly, create a constructor with just the name and email parameters, which also calls another constructor.
 */

public class Customer {
    private String name;

    private double creditLimit;

    private String emailAddress;

    public Customer() {
        this("Krishna", "Krishna@gmail.com");
        System.out.println("Inside no arg constructor");
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        System.out.println("Inside three args constructor");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(String name, String emailAddress) {
        this(name, 100000d, emailAddress);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

}
