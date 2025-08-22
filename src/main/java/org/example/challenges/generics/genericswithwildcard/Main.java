package src.main.java.org.example.challenges.generics.genericswithwildcard;

import src.main.java.org.example.challenges.generics.genericswithbound.DataProcessor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.0);
        doubleList.add(20.21);
        doubleList.add(30.40);

        List<String> stringList = new ArrayList<>();
        stringList.add("Muthu");
        stringList.add("Divi");
        stringList.add("Divya");

        Sorter.sortList(integerList);
        Sorter.sortList(doubleList);
        Sorter.sortList(stringList);

        for(Object obj : Sorter.merge(integerList, stringList)) {
            if(obj instanceof Integer val)
                System.out.println(val);
            else if(obj instanceof String s)
                System.out.println(s);
            else
                System.out.println(obj);
        }
    }

}
