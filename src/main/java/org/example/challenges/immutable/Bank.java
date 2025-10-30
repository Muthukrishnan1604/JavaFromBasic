package src.main.java.org.example.challenges.immutable;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private final int routingNumber;

    private long lastTransactionId = 1;

    private final Map<String, BankCustomer> customers;

    public Bank(int routingNumber) {
        this.routingNumber = routingNumber;
        this.customers = new HashMap<>();
    }

    public BankCustomer getCustomer(String id) {
        BankCustomer customer = this.customers.get(id);
        return customer;
    }

    public void addCustomer(String name, double checkingInitialDeposit, double savingsInitialDeposit) {
        BankCustomer customer = new BankCustomer(name, checkingInitialDeposit, savingsInitialDeposit);
        customers.put(customer.getCustomerId(), customer);
    }

    public boolean doTransaction(String id, AccountType type, double amount) {
        BankCustomer customer = customers.get(id);

        if(customer != null) {
            BankAccount customerAccount = customer.getAccount(type);
            if(customerAccount != null) {
                if((customerAccount.getBalanceAmount() + amount) < 0) {
                    System.out.println("Insufficient Balance");
                } else {
                    customerAccount.commitTransaction(this.routingNumber, lastTransactionId, id, amount);
                }
                return true;
            }
        } else {
            System.out.println("Invalid Customer Id");
        }

        return false;
    }
}
