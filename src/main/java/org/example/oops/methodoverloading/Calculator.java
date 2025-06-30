package src.main.java.org.example.oops.methodoverloading;

public class Calculator {
    // --- 1. Basic Overloading (Different Number of Parameters) ---
    // Method 1: Adds two integers
    public int add(int a, int b) {
        System.out.println("Calling add(int, int)");
        return a + b;
    }

    // Method 2: Adds three integers (Overloaded version)
    public int add(int a, int b, int c) {
        System.out.println("Calling add(int, int, int)");
        return a + b + c;
    }

    // --- 2. Overloading (Different Types of Parameters) ---
    // Method 3: Adds two doubles
    public double add(double a, double b) {
        System.out.println("Calling add(double, double)");
        return a + b;
    }

    // --- 3. Overloading (Different Order of Parameters - if types are same) ---
    // Method 4: Prints a string followed by an integer
    public void print(String message, int number) {
        System.out.println("Calling print(String, int): " + message + " " + number);
    }

    // Method 5: Prints an integer followed by a string (Overloaded version with different order)
    public void print(int number, String message) {
        System.out.println("Calling print(int, String): " + number + " " + message);
    }

    // --- 4. Overloading with Different Return Types (Allowed if parameters differ) ---
    // Method 6: Returns an integer sum
    public int multiply(int a, int b) {
        System.out.println("Calling multiply(int, int) with int return type");
        return a * b;
    }

    // Method 7: Returns a double product (Overloaded, different parameters allow different return type)
    public double multiply(double a, double b, double c) {
        System.out.println("Calling multiply(double, double, double) with double return type");
        return a * b * c;
    }

    /*
    // Uncommenting this would cause a COMPILE-TIME ERROR:
    // Only return type is different, parameters are same as multiply(int, int) above.
    public double multiply(int a, int b) {
        return (double) a * b;
    }
    */

    // --- 5. Overloading with Different Access Modifiers (Allowed if parameters differ) ---
    // Method 8: Public method
    public void displayValue(int value) {
        System.out.println("Calling public displayValue(int): " + value);
    }

    // Method 9: Private overloaded method
    private void displayValue(String text) {
        System.out.println("Calling private displayValue(String): " + text);
    }

    // A public method to demonstrate calling the private overloaded method
    public void callPrivateDisplayValue() {
        displayValue("This is a private message.");
    }

    // --- 6. Overloading Static and Instance Methods ---
    // Method 10: Instance method
    public void showMessage(String msg) {
        System.out.println("Calling instance showMessage: " + msg);
    }

    // Method 11: Static overloaded method
    public static void showMessage(int code) {
        System.out.println("Calling static showMessage: Code " + code);
    }

    // --- 7. Overloading with Different Exceptions (Allowed if parameters differ) ---
    // Method 12: No exception
    public void processData(String data) {
        System.out.println("Processing string data: " + data);
    }

    // Method 13: Throws a checked exception (Overloaded)
    public void processData(int[] dataArray) throws ArrayIndexOutOfBoundsException {
        System.out.println("Processing array data. First element: " + dataArray[0]);
        // This line could potentially throw ArrayIndexOutOfBoundsException if array is empty
    }
}
