package src.main.java.org.example.basics.method;

/*
Method overloading occurs when a class has multiple methods with the same name, but the methods are declared with different parameters.
So, you can execute multiple methods with the same name, but call it with different arguments.
Java can resolve which method it needs to execute based on the arguments being passed when the method is invoked.

A method's return type is not part of the signature.
A parameter name is also not part of the signature.

 */

public class MethodOverloading {

    public static void main(String[] args) {
        methodOverload(10);
        methodOverload(10, 20);
        methodOverload(10.0f, 20, 30);
        methodOverload("Muthu", 27);
    }

    public static void methodOverload(int input1) {
        System.out.println("Method Overloading " + input1);
    }

    /*
    Even though parameter name is different from the above method it will throw compile error
    method overloading does not consider the parameter name and return type it will consider only
    the order of arguments and number of arguments

    public static void methodOverload(int input2) {
        System.out.println("Method Overloading");
    }

    public static int methodOverload(int input1) {
        System.out.println("Method Overloading");
        return input1;
    }
     */

    public static void methodOverload(int input1, int input2) {
        System.out.println("Method Overloading with two parameter " + input1 + input2);
    }

    public static void methodOverload(float input1, int input2, int input3) {
        System.out.println(input2 + input3 + " Method Overloading with three parameter " + input1);
    }

    public static void methodOverload(String input1, int input2) {
        System.out.println(input1 + " testing the Method Overloading with two parameter " +  input2);
    }
}
