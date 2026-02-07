package src.main.java.org.example.challenges.immutable;

import java.util.*;

enum AccountType {
    CHECKING,
    SAVINGS
}

public class BankAccount {

    private static final String OBJECT_RETURNS = " [ BankAccount : Type = %s , Balance = %.2f ]";

    private final AccountType type;

    private double balanceAmount;

    private final Map<Long, Transaction> transactions = new LinkedHashMap<>();

    public BankAccount(AccountType type, double balanceAmount) {
        this.type = type;
        this.balanceAmount = balanceAmount;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public Map<Long, String> getTransactions() {
        Map<Long, String> transactionMap = new LinkedHashMap<>();
        for(var tx : transactions.entrySet()) {
            transactionMap.put(tx.getKey(), tx.getValue().toString());
        }
        return transactionMap;
    }

    void commitTransaction(int routingNumber, long transactionId, String customerId, double transactionAmount) {
        try{
            balanceAmount += transactionAmount;
            Transaction transaction = new Transaction(routingNumber, Integer.parseInt(customerId), transactionId, transactionAmount);
            System.out.println("Transaction committed successfully");
            transactions.putIfAbsent(transactionId, transaction);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Transaction Failed Due to Invalid Customer ID");
        }

    }

    @Override
    public String toString() {
        return OBJECT_RETURNS.formatted(this.type.toString() ,this.balanceAmount);
    }
}
