package src.main.java.org.example.lambda.commonfunctionalinterface;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Divi", "Muthu", "Hema", "Hepsi", "Victor"};
        String[] randomList = randomlySelectedValues(15, names, () -> random.nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s) {

        String[] selectedValues = new String[count];
        for(int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}
