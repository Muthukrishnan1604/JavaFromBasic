package src.main.java.org.example.basics.readinginput;

/*
System.in --> which is disabled in all the ide
Scanner class
System.console
 */


import java.time.LocalDate;
import java.util.Scanner;

public class ReadingInputFromUser {

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    private static String getInputFromConsole(int currentYear) {
        String name = System.console().readln("What's your name");
        System.out.println("Hi " + name + ", Thanks for practicing");
        String dob = System.console().readLine("What year were you born?");
        return "you were " + (currentYear - Integer.parseInt(dob)) + " years old";
    }

    private static String getInputFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = sc.nextLine();
        System.out.println("Hi " + userName + ", Thanks for practicing");
        boolean isVaidDOB = false;
        int age = 0;

        do {
            System.out.println("Enter your year of birth from do while");
            String dob = sc.nextLine();
            age = validator(currentYear, dob);
            isVaidDOB =  age < 0 ? false : true;
        } while(!isVaidDOB);
        return "you were " + age + " years old";
    }

    public static int validator(int currentYear, String dateOfBirth) {
        try {
            int dob = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;

            if ((dob < minimumYear) || (dob > currentYear)) {
                return -1;
            }
            return currentYear - dob;
        } catch (Exception e) {
            System.out.println("Enter only numeric value");
            return -1;
        }
    }

}
