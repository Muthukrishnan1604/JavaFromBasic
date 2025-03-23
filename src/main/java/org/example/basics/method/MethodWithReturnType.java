package src.main.java.org.example.basics.method;

/*
    If we mention the return type as void it won't return any value, but if your method want to
    return some value in the end we need to include the return statement

    even if we include return statement in the void method it will work we can use it when we need to break from
    some steps and come outside the block
 */


import java.time.LocalDate;

public class MethodWithReturnType {

    public static void main(String[] args) {
        int yearOfBirth = 1998;

        int age = calculateAge(yearOfBirth);

        String result = (age == -1) ? "Invalid input" : "Age of the person is " + age;

        System.out.println(result);

        testMethod();
    }

    public static int calculateAge(int yearOfBirth) {
        int currentYear = LocalDate.now().getYear();
        if(yearOfBirth > currentYear) {
            return -1;
        } else {
            return currentYear - yearOfBirth;
        }

    }

    public static void testMethod() {
        System.out.println("testing.........");
        return;
    }

}
