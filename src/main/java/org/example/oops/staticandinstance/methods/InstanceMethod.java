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
        String test = null;

        try{
            System.out.println(test.repeat(20));
        } catch (IllegalArgumentException | NullPointerException runtimeException) {
            System.out.println("Null Pointer Exception");
        } catch (Exception exception) {
            System.out.println("Inside Exception catch block");
        }
    }
}
