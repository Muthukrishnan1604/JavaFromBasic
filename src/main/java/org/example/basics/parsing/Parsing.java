package src.main.java.org.example.basics.parsing;

/*
Parsing will help us to convert from one type to another

For example -> If user enter the value in String format and then with that value if we try to
perform addition it will concat the value and won't perform addition
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Parsing {

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        String userDOB = "1999";

        int dob = Integer.parseInt(userDOB);
        System.out.println(currentYear - dob);
    }
}
