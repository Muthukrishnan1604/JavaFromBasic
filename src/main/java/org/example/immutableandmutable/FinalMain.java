package src.main.java.org.example.immutableandmutable;

import src.main.java.org.example.immutableandmutable.external.util.Logger;
import src.main.java.org.example.immutableandmutable.subpackage.ChildClass;

import java.time.LocalDate;

public class FinalMain {

    public static void main(String[] args) {

        Baseclass parent = new Baseclass();
        ChildClass child = new ChildClass();
        Baseclass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("-".repeat(30));
        childReferredToAsBase.recommendedMethod();
        System.out.println("-".repeat(30));
        child.recommendedMethod();
        System.out.println("-".repeat(30));
        parent.recommendedStatic();
        System.out.println("-".repeat(30));
        childReferredToAsBase.recommendedStatic();
        System.out.println("-".repeat(30));
        child.recommendedStatic();
        System.out.println("-".repeat(30));
        Baseclass.recommendedStatic();
        System.out.println("-".repeat(30));
        ChildClass.recommendedStatic();
        System.out.println("-".repeat(30));

        String x = "Muthu ";
        StringBuilder builder = new StringBuilder("Divi My wife ");
        doSomething(x, 007, builder);

        System.out.println("After Method, x argument: " + x);
        System.out.println("After Method, builder " + builder);

        parent.setTest("Before method");

        System.out.println("Before Method, test field value " + parent.getTest());
        doSomething(x, 007, parent);
        System.out.println("After Method, test field value " + parent.getTest());

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", step 2 is def");
        Logger.logToConsole(tracker.toString());
        System.out.println("After Logging, tracker = " + tracker);
    }

    private static void doSomething(String x, int y, final StringBuilder z) {
        final String c = x + y;
        x = c;
        System.out.println("c = " + c);
        z.append(y);
        //z = new StringBuilder(); -- This will throw compiler error
    }

    private static void doSomething(String x, int y, final Baseclass z) {
        final String c = x + y;
        System.out.println("c = " + c);
        z.setTest("Inside doSomething");
    }
}
