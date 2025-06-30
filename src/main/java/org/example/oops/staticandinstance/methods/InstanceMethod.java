package src.main.java.org.example.oops.staticandinstance.methods;

/*
Instance methods can access instance methods and instance variables directly.
Instance methods can also access static methods and static variables directly.
 */

public class InstanceMethod {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.calculate("Muthu loves", " Divya");
    }

    public static void test() {
        System.out.println("Inside the test method");
    }
}
