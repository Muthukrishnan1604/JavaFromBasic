package src.main.java.org.example.challenges.controlflow;

/*
Create a method called printDayOfWeek, that takes an int parameter called day, but doesn't return any values.
Use the enhanced switch statement, to return the name of the day, based on the parameter passed to the switch statement, so that 0 will return "Sunday", 1 will return "Monday", and so on.  Any number not between 0 and 6, should return "Invalid Day". Note that return here, means the value returned from the enhanced switch statement.
Use the enhanced switch statement as an expression, returning the result to a String named dayOfTheWeek.
Print both the day variable and the dayOfTheWeek variable.

 */

public class NewSwitchChallenge {

    public static void main(String[] args) {
        printDayOfWeek(1);
        printDayOfWeek(10);
        printDayOfWeek(0);
        printDayOfWeekUsingIfElse(7);
        printDayOfWeekUsingIfElse(10);
        printDayOfWeekUsingIfElse(0);
        printDayOfWeekUsingIfElse(2);
        printDayOfWeekUsingIfElse(3);

    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> {
                System.out.println("Using yield");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }

    public static void printDayOfWeekUsingIfElse(int day) {
        String dayOfTheWeek = "Invalid day";

        if(day == 0) {
            dayOfTheWeek = "Sunday";
        } else if (day == 1) {
            dayOfTheWeek = "Monday";
        } else if (day == 2) {
            dayOfTheWeek = "Tuesday";
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
        } else if (day == 4) {
            dayOfTheWeek = "Thursday";
        } else if (day == 5) {
            dayOfTheWeek = "Friday";
        } else if (day == 6) {
            dayOfTheWeek = "Saturday";
        }

        System.out.println(day + " stands for " + dayOfTheWeek);
    }


}
