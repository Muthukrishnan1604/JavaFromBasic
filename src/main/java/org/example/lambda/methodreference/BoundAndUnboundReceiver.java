package src.main.java.org.example.lambda.methodreference;

/*
In Java, "bound" and "unbound" receivers are concepts related to method references, a feature introduced in Java 8 to provide a more concise way
to write lambda expressions. They specify how the object on which an instance method is called is provided.

Bound Receiver:

A bound receiver is a method reference where the instance of the object is explicitly provided as part of the method reference itself.
The method is "bound" to a specific object. The syntax is objectReference::instanceMethodName.

The method reference is tied to a particular object instance.

The functional interface's method signature has one less parameter than the referenced instance method because the object is already supplied.

Example:
If you have a String object str and want to reference its length() method, you would use str::length. This creates a Supplier<Integer> functional interface, which takes no arguments and returns an Integer. The method reference already knows which object it's calling length() on.

Java

String name = "Java";
// The method reference is bound to the 'name' object.
// The functional interface is a Supplier, taking no arguments.
Supplier<Integer> lengthSupplier = name::length;
System.out.println(lengthSupplier.get()); // Prints 4

Unbound Receiver:

An unbound receiver is a method reference where the instance of the object is not provided in the reference itself.
Instead, the object is passed as the first parameter to the functional interface's abstract method.
The method is "unbound" from a specific object. The syntax is ClassName::instanceMethodName.

The method reference is tied to a class, not a specific object.

The functional interface's method signature must have an extra parameter at the beginning to represent the object on which the method will be invoked.

Example:
To reference the length() method of the String class in an unbound manner, you would use String::length. This creates a Function<String, Integer> functional interface,
which takes a String object as an argument and returns an Integer. When you call the function, you pass the String object you want to operate on.

Java

// The method reference is unbound, tied to the String class.
// The functional interface is a Function, taking a String argument.
Function<String, Integer> lengthFunction = String::length;
System.out.println(lengthFunction.apply("Java")); // Prints 4
System.out.println(lengthFunction.apply("Programming")); // Prints 11
 */

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BoundAndUnboundReceiver {

    public static void main(String[] args) {
        calculate((s1, s2) -> s1.concat(s2), "Hello ", "Muthu");
        calculate(String::concat, "Hello ", "Muthu");

        BinaryOperator<String> binaryOperator = String::concat;

        BiFunction<String, String, String> biFunction = String::concat;

        /*
            UnaryOperator<String> unaryOperator = String::concat;// Unary operator accept only one parameter,
            if we have two parameter java will consider first parameter as instance and then it will call the instance method in unary operator it will throw compiler error
        */

        UnaryOperator<String> unaryOperator = String::toUpperCase;

        System.out.println(binaryOperator.apply("Hello", "Hema"));
        System.out.println(biFunction.apply("Hello", "Divi"));
        System.out.println(unaryOperator.apply("Hello"));

        String result = "Hello".transform(unaryOperator);
        System.out.println(result);

        Function<String, Integer> getLength = String::length;

        Integer res = "Muthu".transform(getLength);
        System.out.println(res);

        String name = "Muthu";

    }

    private static <T> void calculate(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
    }

}
