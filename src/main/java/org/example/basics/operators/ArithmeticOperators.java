package src.main.java.org.example.basics.operators;

/*
  Addition operator is represented by +
  Subtraction operator is represented by -
  Division operator is represented by /
  Multiplication operator is represented by *
  Modulo operator is represented by % - It will return the remainder value

  Note - input1 and input2 are operands
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        int input1 = 11;
        int input2 = 20;

        System.out.println("Addition example " + (input1 + input2));

        System.out.println("Subtraction example " + (input2 - input1));

        System.out.println("Multiplication example " + (input1 * input2));

        System.out.println("Division example " + (input2 / input1));

        System.out.println("Remainder example " + (input1 % input2));

     }
}
