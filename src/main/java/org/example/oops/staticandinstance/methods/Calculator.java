package src.main.java.org.example.oops.staticandinstance.methods;

public class Calculator {

    public static void calculate(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    public void calculate(String a, String b) {
        System.out.println("Concat of two String " + (a + b));
        InstanceMethod.test();
    }
}
