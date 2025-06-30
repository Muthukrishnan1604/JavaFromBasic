package src.main.java.org.example.oops.methodoverloading;

public class SmartCalculator extends Calculator{

    public String add(String s1, String s2) { // Overloaded method in subclass
        System.out.println("Calling SmartCalculator's add(String, String)");
        return s1 + s2;
    }

}
