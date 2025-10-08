package src.main.java.org.example.challenges.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BankCustomer {

    private static int lastCustomerId = 1;

    private final String customerName;

    private final int customerId;

    private final List<BankAccount> accounts = new ArrayList<>();

    public BankCustomer(String customerName, double checkingAmount, double savingsAmount) {
        this.customerName = customerName;
        this.customerId = lastCustomerId++;
        accounts.add(new BankAccount(AccountType.CHECKING, checkingAmount));
        accounts.add(new BankAccount(AccountType.SAVINGS, savingsAmount));
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public List<BankAccount> getAccounts() {
        return new ArrayList<>(this.accounts);
    }

    @Override
    public String toString() {
        String[] accountStrings = new String[accounts.size()];
        Arrays.setAll(accountStrings, i -> accounts.get(i).toString());
        return "Customer: %s (id:%015d)%n\t%s%n".formatted(customerName, customerId, String.join("\n\t", accountStrings));
    }

}
