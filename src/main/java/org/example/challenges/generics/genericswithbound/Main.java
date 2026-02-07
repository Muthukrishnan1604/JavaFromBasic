package src.main.java.org.example.challenges.generics.genericswithbound;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        DataProcessor<Integer> integerDataProcessor = new DataProcessor<>(integerList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.0);
        doubleList.add(20.21);
        doubleList.add(30.40);
        DataProcessor<Double> doubleDataProcessor = new DataProcessor<>(doubleList);

        System.out.println(integerDataProcessor.sumList());

        System.out.println(doubleDataProcessor.sumList());
    }

}
