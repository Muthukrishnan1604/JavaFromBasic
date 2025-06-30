package src.main.java.org.example.oops.staticandinstance.methods;

/*
Static methods are declared using a static modifier.
Static methods can't access instance methods and instant variables directly.
They're usually used for operations that don't require any data from an instance of the class (from 'this').
If you remember, the this keyword is the current instance of a class.

Inside a static method, we can't use the this keyword.
Whenever you see a method that doesn't use instance variables,
that method should probably be declared as a static method.
For example, main is a static method and it's called by the Java virtual machine
when it starts the Java application.
 */

public class StaticMethod {

    public static void main(String[] args) {
        printHello();
        Calculator.calculate(10, 5);
    }

    public static void printHello() {
        System.out.println("Inside the print method ");
    }

}

