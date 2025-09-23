package src.main.java.org.example.collections.map;

import java.util.*;
import java.util.logging.SocketHandler;

public class PracticeMap {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();

        String output = myMap.put("key1", "Value1");

        System.out.println("For the very first time if it add any value it will return null - " + output);

        output = myMap.put("key1", "Value1 with some other value");

        System.out.println("If value already exist in that key and if we try to add to it " +
                "through put it will return the previous element" + output);

        output = myMap.computeIfPresent("key1", (k, v) -> k + " " + v);

        System.out.println("-".repeat(40));
        System.out.println(output);
        System.out.println("-".repeat(40));


        output = myMap.computeIfAbsent("key2", s -> s.concat("Test"));

        System.out.println(output);

        myMap.putIfAbsent("Key3", "Value3");
        myMap.putIfAbsent("Key4", "Value4");
        myMap.putIfAbsent("Key5", "Value5");


        myMap.forEach((var k, var v) -> System.out.println("Key = " + k + " ,Value = " + v) );

        System.out.println(myMap.get("key3"));

        System.out.println(myMap.getOrDefault("key3", "Default Value"));

        System.out.println(myMap.size());

        Set<String> keyAvailableInMap = myMap.keySet();

        System.out.println(keyAvailableInMap);

        Comparator<String> stringComparator = Comparator.comparing(String::length);

        NavigableSet<String> navigableSet = new TreeSet<>(stringComparator);

        navigableSet.addAll(keyAvailableInMap);

        System.out.println(navigableSet);

        for(Map.Entry<String, String> value : myMap.entrySet()) {
            System.out.println(value.getValue() + " value received");
        }
        System.out.println("-".repeat(40));
        myMap.values().forEach(System.out::println);

        System.out.println("-".repeat(40));
        navigableSet.add("Key2");
        navigableSet.add("Key3");
        System.out.println(navigableSet);
        System.out.println(navigableSet.headSet("Value5", true));
    }

}
