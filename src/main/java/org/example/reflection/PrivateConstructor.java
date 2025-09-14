package src.main.java.org.example.reflection;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class PrivateConstructor {

    private String privateString;

    private Integer privateIntegerValue;

    private static final String PRIVATE_FINAL_FIELD = "Testing";

    private PrivateConstructor() {
        System.out.println("Inside private constructor");
    }

    private PrivateConstructor(int privateIntegerValue) {
        this.privateIntegerValue = privateIntegerValue;
        System.out.println("Inside private constructor with parameter with value " + privateIntegerValue);

    }

    public String getPrivateString() {
        return privateString;
    }

    public Integer getPrivateIntegerValue() {
        return privateIntegerValue;
    }

    private static int getLengthOfString(String string) {
        return string.length();
    }

    private static int sumOfAllStringLength(String[] string) {
        AtomicInteger sum = new AtomicInteger();
        Arrays.stream(string).forEach(s -> {
            sum.addAndGet(getLengthOfString(s));
        });
        return sum.get();
    }
}
