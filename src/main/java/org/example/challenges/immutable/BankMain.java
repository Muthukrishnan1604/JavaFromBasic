package src.main.java.org.example.challenges.immutable;

public class BankMain {

    public static void main(String[] args) {
        /*
        BankAccount account = new BankAccount(AccountType.CHECKING, 500.00);
                System.out.println(account);

         */

        BankCustomer muthu = new BankCustomer("Muthu", 1000.00, 1_00_000.00);
        System.out.println(muthu);

        var accounts = muthu.getAccounts();
        accounts.clear();
        System.out.println(muthu);

        accounts.add(new BankAccount(AccountType.CHECKING, 1_50_000));

        System.out.println(muthu);
    }

}
