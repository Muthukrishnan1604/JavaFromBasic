package src.main.java.org.example.practice.pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class InnerClass {

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IllegalArgumentException _) {
            System.out.println("Nothing to print");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void doSomething() throws ClassNotFoundException, NullPointerException {
        Object obj = Class.forName("src.main.java.org.example.oops.abstraction.Animal");
        Method[] methods = obj.getClass().getMethods();
        for(Method method : methods) {
            Arrays.stream(method.getParameters()).forEach(System.out::print);
            System.out.println();
        }
    }

    public static class InnerClassHelper {
        public static void doSomething() {
            System.out.println("Do something from inner class helper");
        }
    }

}
