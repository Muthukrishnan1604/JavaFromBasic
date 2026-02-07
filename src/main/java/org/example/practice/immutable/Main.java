package src.main.java.org.example.practice.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Test", "Test-1", "Test-2"));

        Random record = new Random("Test", stringList);

        System.out.println(record);

        stringList.add("Test-3");

        System.out.println(record);

        List<String> recordData = record.stringList();

        recordData.add("Test-4");

        System.out.println(record);
    }

}
