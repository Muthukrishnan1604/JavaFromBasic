package src.main.java.org.example.oops.constructor;

public class BankAccountMainForConstructor {

    public static void main(String[] args) {
        System.out.println("Welcome to Krishna Bank!!!");
        createNewAccountWithDefaultConstructor();
        createAccountWithParameterConstructor();
        createAccountWithConstructorChaining();
    }

    private static void createAccountWithConstructorChaining() {
        ConstructorChaining constructorChaining = new ConstructorChaining();
        constructorChaining.withdraw(2000);
        constructorChaining.deposit(15000);
        constructorChaining.withdraw(4000);
    }

    private static void createNewAccountWithDefaultConstructor() {
        BankAccountConstructor newAccount = new BankAccountConstructor();
        newAccount.setAccountNumber(12345);
        newAccount.setAccountBalance(11000);
        newAccount.setCustomerName("Muthu");
        newAccount.setPhoneNumber("8763525263");
        newAccount.deposit(10000);
        newAccount.withdraw(12000);
    }

    private static void createAccountWithParameterConstructor() {
        BankAccountConstructor parameterConstructor = new BankAccountConstructor(1234, 10000,
                "Krishna", "muthu@gmail.com", "8752019380");
        parameterConstructor.withdraw(2000);
        parameterConstructor.deposit(15000);
        parameterConstructor.withdraw(24000);
    }

}
