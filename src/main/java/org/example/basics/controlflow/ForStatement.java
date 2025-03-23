package src.main.java.org.example.basics.controlflow;

/*
To repeat same statement for some number of time we will use the for loop

syntax -> for(init; expression; increment or decrement)

if I want to come out from the loop after particular value we can use break statement
 */

public class ForStatement {

    public static void main(String[] args) {
        printNumberUsingForLoop(10);
    }

    public static void printNumberUsingForLoop(int input) {
        for(int i = 0; i <= input; i++) {
            System.out.println(i);
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10_000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10_000.0, rate);
            if(rate == 4.0) {
                break;
            }
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return  (amount * (interestRate / 100));
    }
}
