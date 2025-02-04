package src.main.java.org.example.basics.operators;

/*
  equivalent operator is represented by == it is used to check two primitive types are same
  Not equal to operator is represented by != it is used to check value is not equal to
  Greater than operator is represented by >
  Greater than equal to operator is represented by >=
  Less than operator is represented by <
  Less than equal to operator is represented by <=

  Note - isSmart and number are operands
 */

public class RelationalOperators {

    public static void main(String[] args) {
        System.out.println("Hello Krishna!");

        boolean isSmart = false;

        int number = 10;

        if(isSmart == false) {
            System.out.println("He is not smart");
        }

        if(isSmart != true) {
            System.out.println("He is not smart from second if condition");
        }

        if(number < 100) {
            System.out.println("Number is less than 100");
        }

        if(number > 1) {
            System.out.println("Number is greater than 1");
        }

        if(number >= 10) {
            System.out.println("Number is greater than or equal to 10");
        }

        if(number <= 10) {
            System.out.println("Number is less than or equal to 10");
        }
    }

}
