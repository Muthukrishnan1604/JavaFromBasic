package src.main.java.org.example.arrays;

/*
 If we use three dots followed by the data type String... then this is known as Variable Arguments or VarArgs

 If we assign it as varargs we can pass multiple elements of the same type

 Points to remember:

 1. There can be only one variable arguments in a method
 2. The variable argument must be the last argument
 */


public class VariableArguments {
    public static void main(String... args) {
        System.out.println("Hello Muthu");

        String[] splitString = "Hello Divya Muthu".split(" ");
        printText(splitString);

        System.out.println("-".repeat(20));
        printText("Hello");

        String[] sArray = {"First", "Second", "Third"};
        System.out.println(String.join(",", sArray));

    }

    private static void printText(String... textList) {
        for(String t : textList) {
            System.out.println(t);
        }
    }
}
