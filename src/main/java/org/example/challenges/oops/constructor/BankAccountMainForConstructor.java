package src.main.java.org.example.challenges.oops.constructor;

import src.main.java.org.example.challenges.oops.constructor.BankAccountConstructor;

import java.util.Scanner;

public class BankAccountMainForConstructor {

    public static void main(String[] args) {
        System.out.println("Welcome to Krishna Bank!!!");
        System.out.println("Do you want to create account press 1 for creating new account else press 2");

        createNewAccount();
    }

    private static void createNewAccount() {
        BankAccountConstructor newAccount = new BankAccountConstructor();

    }

}
