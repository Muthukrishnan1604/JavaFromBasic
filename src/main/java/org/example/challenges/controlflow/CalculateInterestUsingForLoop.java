package src.main.java.org.example.challenges.controlflow;

/*
Using a new for statement, call the calculateInterest method with the dollar amount of 100.
And this time, use the interest rates between 7.5 and 10,
but increment by a quarter of a percent each time, meaning 0.25 percent.
And print the results to the console window.
 */

public class CalculateInterestUsingForLoop {

    public static void main(String[] args) {
        calculateInterest(1000);
    }

    public static void calculateInterest(int amount) {
        for(double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount = (amount * (rate / 100));
            System.out.println(amount + " at " + rate + "% interest = $" + interestAmount);
        }
    }
}
