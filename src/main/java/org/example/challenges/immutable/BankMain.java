package src.main.java.org.example.challenges.immutable;

public class BankMain {

    public static void main(String[] args) {
        /*
        BankAccount account = new BankAccount(AccountType.CHECKING, 500.00);
                System.out.println(account);

         */
        Bank citiBank = new Bank(321456);
        citiBank.addCustomer("Muthu", 1000.00, 1_00_000.00);

        BankCustomer muthu = citiBank.getCustomer("000000000000001");
        System.out.println(muthu);

        if(citiBank.doTransaction(muthu.getCustomerId(), AccountType.CHECKING, 350)) {
            System.out.println(muthu);
        }

        if(citiBank.doTransaction(muthu.getCustomerId(), AccountType.CHECKING, -1400)) {
            System.out.println(muthu);
        }

        BankAccount account = muthu.getAccount(AccountType.CHECKING);
        var transactions = account.getTransactions();

        transactions.forEach((k, v) -> System.out.println(k + ": " + v));
    }

}
