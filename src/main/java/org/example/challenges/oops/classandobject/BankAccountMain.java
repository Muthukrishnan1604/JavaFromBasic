package src.main.java.org.example.challenges.oops.classandobject;

import java.util.Random;
import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Krishna Bank!!!");
        System.out.println("Do you want to create account press 1 for creating new account else press 2");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if(userInput == 1) {
            createNewAccount(sc);
        }

        sc.close();
    }

    private static void createNewAccount(Scanner sc) {
        BankAccount newAccount = new BankAccount();
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        System.out.println("Enter your name");
        newAccount.setCustomerName(sc.nextLine());

        while (!newAccount.isValidNumber()) {
            System.out.println("Enter your contact number");
            newAccount.setPhoneNumber(sc.nextLine());
        }

        System.out.println("Enter your email address");
        newAccount.setEmail(sc.nextLine());

        System.out.println("Enter initial deposit amount");
        newAccount.deposit(sc.nextInt());
        sc.nextLine(); // Clear the newline character left in the buffer

        newAccount.setAccountNumber(Integer.MAX_VALUE);

        System.out.println("Enter withdraw amount");
        newAccount.withdraw(sc.nextInt());
        sc.nextLine(); // Clear the newline character again
    }

}
