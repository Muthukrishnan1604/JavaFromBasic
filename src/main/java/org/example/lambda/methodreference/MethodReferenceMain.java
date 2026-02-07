package src.main.java.org.example.lambda.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class MethodReferenceMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Muthu", "Divi", "Hema", "Jemi", "Nancy"));

        list.forEach(System.out::println);

        BinaryOperator<Integer> calculate = Integer::sum;
        BinaryOperator<Double> calculate2 = Double::sum;

        calculator(calculate, 10, 15);
        calculator(calculate, 15, 20);
        calculator(calculate2, 15.10, 20.00);

        Supplier<PlainOld> createObject = PlainOld::new;
        PlainOld newPojo = createObject.get();
        System.out.println("Getting Array");
        seedArray(createObject, 15);

    }

    private static <T> void calculator(BinaryOperator<T> operator, T value1, T value2) {
        T result = operator.apply(value1, value2);
        System.out.println("Result of operation: " + result);

    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count) {
        PlainOld[] array = new PlainOld[count];

        Arrays.setAll(array, i -> reference.get());
        return array;
    }
}

class PlainOld {

    private static int last_id = 1;

    private int id;

    public PlainOld() {
        id = PlainOld.last_id;
        last_id++;
        System.out.println("Creating a plain old object " + id);
    }
}