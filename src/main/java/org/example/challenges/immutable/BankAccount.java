package src.main.java.org.example.challenges.immutable;

enum AccountType {
    CHECKING,
    SAVINGS
}

public class BankAccount {

    private static final String OBJECT_RETURNS = " [ BankAccount : Type = %s , Balance = %.2f ]";

    private final AccountType type;

    private final double balanceAmount;

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

    @Override
    public String toString() {
        return OBJECT_RETURNS.formatted(this.type.toString() ,this.balanceAmount);
    }
}
