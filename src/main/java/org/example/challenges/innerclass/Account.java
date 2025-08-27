package src.main.java.org.example.challenges.innerclass;

/*
Challenge: The Financial Transaction System 💰
Question: A financial institution wants to design a system for managing user accounts and their transactions.
You need to create a class structure in Java for this system.

Design a main class called Account. It should have private fields for the accountNumber and balance.

Create a non-static inner class called Transaction. A Transaction object should be tied to a specific Account instance.
It should have private fields for the amount and type (e.g., "DEPOSIT" or "WITHDRAWAL").
The Transaction class must have a method to execute a transaction, which updates the balance of the outer Account class.

Create a static nested class called AuditLog. This class should not require an Account instance.
It should contain a static method logTransaction(String accountNumber, String transactionType, double amount) that prints a
formatted log message.
It should also have a static counter for the total number of transactions logged across all accounts.

Your task is to write the complete code for the Account class and its nested classes,
demonstrating how to use a Transaction to change an Account's state and
how to use the independent AuditLog to record the transaction.
 */

public class Account {

    private String accountNumber;

    private double balance;

    private class Transaction {

        private double amount;

        private TransactionTypes type;

        public Transaction(double amount, TransactionTypes type) {
            this.amount = amount;
            this.type = type;
        }

        public double getAmount() {
            return amount;
        }

        public TransactionTypes getType() {
            return type;
        }

        private void executeTransaction(String transactionTypes, double amount) {
            if(amount > 0) {
                if(transactionTypes.equalsIgnoreCase("Deposit")) {
                    balance += amount;
                    AuditLog.logTransaction(Account.this.getAccountNumber(), transactionTypes, amount);
                    AuditLog.counter();
                } else if ((transactionTypes.equalsIgnoreCase("Withdrawal")) &&  balance >= amount){
                    Account.this.balance -= amount;
                    AuditLog.logTransaction(Account.this.getAccountNumber(), transactionTypes, amount);
                    AuditLog.counter();
                }
            }
            else {
                System.out.println("Enter valid amount");
            }
        }
    }


    private static class AuditLog {
        private static long totalNumberOfTransaction = 0;

        private static void logTransaction(String accountNumber, String transactionType, double amount) {
            System.out.printf("Account Number = %s has done %s for amount %.2f%n", accountNumber, transactionType, amount);
        }

        private static void counter() {
            totalNumberOfTransaction++;
        }
    }

    public static void main(String[] args) {

        Account account = new Account();
        account.setAccountNumber("123456");

        Transaction transaction = account.new Transaction(1000, TransactionTypes.DEPOSIT);
        transaction.executeTransaction(transaction.getType().name(), transaction.getAmount());

        transaction = account.new Transaction(1000, TransactionTypes.DEPOSIT);
        transaction.executeTransaction(transaction.getType().name(), transaction.getAmount());

        transaction = account.new Transaction(1000, TransactionTypes.WITHDRAWAL);
        transaction.executeTransaction(transaction.getType().name(), transaction.getAmount());

        System.out.println(account.balance);
        System.out.println(AuditLog.totalNumberOfTransaction);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}
