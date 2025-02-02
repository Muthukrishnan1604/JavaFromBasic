package src.main.java.org.example.basics.operators;

/*
    If you want to check all the condition mentioned inside the statement is true then use AND operator [ && ]

    If you want to check if any one of the condition mentioned inside the statement is true then use OR operator [ || ]

*/

public class LogicalOperator {

    public static void main(String... args) {
        int result = 90;

        // check result is greater than 80 and less than 100

        if(result > 80 && result < 100) {
            System.out.println("Result " + result + " is greater than 80 and less than 100");
        }

        if(result > 90 && result < 100) {
            System.out.println("Result " + result + " is greater than 90 and less than 100");
        } else {
            System.out.println("Result " + result + " is either not greater than 90 nor less than 100");
        }

        // Check if any one condition is satisfying

        if(result > 90 || result > 80) {
            System.out.println("Result " + result + " is greater than 90 or greater than 80");
        }

        if(result > 90 || result > 100) {
            System.out.println("Result " + result + " is greater than 90 or greater than 100");
        } else {
            System.out.println("Result " + result + " is either greater than 90 nor greater than 100");
        }

    }

}
