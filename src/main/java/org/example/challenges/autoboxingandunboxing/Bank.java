package src.main.java.org.example.challenges.autoboxingandunboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    protected void addCustomer(String customerName, Double initialDeposit) {
        if(getCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialDeposit));
            System.out.println("New Customer added: " + customerName);
        } else {
            System.out.printf("Customer already exist");
        }
    }

    protected Customer getCustomer(String customerName) {
        for(var customer : getCustomers()) {
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer %s wasn't found %n", customerName);
        return null;
    }

    protected void printStatement(String name) {
        Customer customer = getCustomer(name);
        if(customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions:");
        for(double d : customer.transactions()) {
            System.out.printf("$%10.2f %s %n", d, (d < 0 ? "debit":"credit"));
        }
    }

    @Override
    public String toString() {
        return "Bank { " +
                "Name = " + name + " ,customers = " + customers + " }";
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);

        if(customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }
}
