package src.main.java.org.example.oops.methodoverloading;

/*
Method Overloading Interview Preparation Points
Definition:

Method overloading means having two or more separate methods in a class with the same name but different parameters.

Key Characteristics (Rules):

Same Method Name: Methods must share the identical name.

Different Parameters: Parameters must differ in:

Number of parameters.

Type of parameters.

Order of parameters (if types are the same).

Return Type: May or may not be different (not part of signature for overloading).

Access Modifiers: May or may not be different.

Exceptions: May or may not throw different checked/unchecked exceptions.

Purpose/Advantages:

Code Reusability: Allows reusing the same method name for similar operations with different inputs.

Reduces Duplication: Minimizes redundant code.

Improved Readability/Usability: Don't have to remember multiple method names for similar functionalities.

Looks Like Single Method: To the calling code, it appears as a single method accepting various arguments.

Mechanism:

Each call with a different set of arguments is actually invoking a separate method.

The compiler determines which specific overloaded method to call based on the method name and the argument list (parameters) provided during compilation.

Type of Polymorphism:

Often referred to as Compile-Time Polymorphism (or Static Polymorphism / Early Binding).

Scope/Location:

Usually happens within a single class.

Can also be achieved by subclasses: A subclass inherits a version from the parent and can then define its own additional overloaded versions. (Note: This is not the primary definition but a common scenario).

Applicability:

Can overload both static and instance methods.
 */

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("--- 1. Overloading by Number of Parameters ---");
        System.out.println("Sum of 5, 10: " + calc.add(5, 10));         // Calls add(int, int)
        System.out.println("Sum of 1, 2, 3: " + calc.add(1, 2, 3));     // Calls add(int, int, int)

        System.out.println("\n--- 2. Overloading by Type of Parameters ---");
        System.out.println("Sum of 2.5, 3.5: " + calc.add(2.5, 3.5));   // Calls add(double, double)

        System.out.println("\n--- 3. Overloading by Order of Parameters ---");
        calc.print("Hello", 123);      // Calls print(String, int)
        calc.print(456, "World");      // Calls print(int, String)

        System.out.println("\n--- 4. Overloading with Different Return Types (Parameters must differ!) ---");
        System.out.println("Product of 4, 5: " + calc.multiply(4, 5));                  // Calls multiply(int, int)
        System.out.println("Product of 1.1, 2.2, 3.3: " + calc.multiply(1.1, 2.2, 3.3)); // Calls multiply(double, double, double)

        System.out.println("\n--- 5. Overloading with Different Access Modifiers (Parameters must differ!) ---");
        calc.displayValue(100);              // Calls public displayValue(int)
        calc.callPrivateDisplayValue();      // Calls public method which internally calls private displayValue(String)
        // calc.displayValue("Direct private call"); // Compile-time error: displayValue(String) has private access in Calculator

        System.out.println("\n--- 6. Overloading Static and Instance Methods ---");
        calc.showMessage("This is an instance message."); // Calls instance showMessage(String)
        Calculator.showMessage(999);                      // Calls static showMessage(int) (accessed via class name)

        System.out.println("\n--- 7. Overloading with Different Exceptions (Parameters must differ!) ---");
        calc.processData("Sample text"); // Calls processData(String)

        try {
            calc.processData(new int[]{10, 20, 30}); // Calls processData(int[])
            // To demonstrate exception, you could try: calc.processData(new int[]{});
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("\n--- Demonstrating overloading by subclasses (briefly) ---");
        SmartCalculator smartCalc = new SmartCalculator();
        System.out.println("SmartCalc: " + smartCalc.add(10, 20)); // Inherits and uses Calculator's add(int,int)
        System.out.println("SmartCalc: " + smartCalc.add("Hello", "World")); // SmartCalculator's own overloaded method
    }
}
