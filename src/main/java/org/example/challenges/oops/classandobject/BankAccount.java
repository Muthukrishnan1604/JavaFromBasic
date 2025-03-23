package src.main.java.org.example.challenges.oops.classandobject;

public class BankAccount {

    private String customerName;

    private long accountNumber;

    private int accountBalance;

    private String email;

    private String phoneNumber;

    public boolean isValidNumber() {
        return isValidNumber;
    }

    private boolean isValidNumber;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.toCharArray().length == 10) {
            this.phoneNumber = phoneNumber;
            this.isValidNumber = true;
        } else {
            this.isValidNumber = false;
            System.out.println("Phone number is not valid please enter it again");
        }
    }

    public void deposit(int amountToDeposit) {
        System.out.println("Account balance before deposit for account number " + accountNumber + " is " + accountBalance);
        if(amountToDeposit >= 0) {
            this.accountBalance += amountToDeposit;
            System.out.println("Account balance after deposit for account number " + accountNumber + " is " + accountBalance);
        } else {
            System.out.println("put valid amount");
        }
    }

    public void withdraw(int amountToWithdrawn) {
        System.out.println("Account balance before withdraw for account number " + accountNumber + " is " + accountBalance);
        if(amountToWithdrawn >= 0 && this.accountBalance >= 0 && this.accountBalance >= amountToWithdrawn) {
            this.accountBalance -= amountToWithdrawn;
            System.out.println("Account balance after withdrawn for account number " + accountNumber + " is " + accountBalance);
        } else {
            System.out.println("Amount not available to withdrawn");
        }
    }

}
