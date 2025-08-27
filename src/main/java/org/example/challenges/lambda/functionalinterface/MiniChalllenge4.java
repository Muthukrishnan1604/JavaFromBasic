package src.main.java.org.example.challenges.lambda.functionalinterface;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MiniChalllenge4 {

    public static void main(String[] args) {

        Supplier<String> mySupplier = () -> "I Love Divya more than Java";
        System.out.println(supplier(mySupplier));
    }

    public static String supplier(Supplier<String> supplier) {
        return  supplier.get();
    }

}
