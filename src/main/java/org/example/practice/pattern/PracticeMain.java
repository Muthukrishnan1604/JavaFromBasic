package src.main.java.org.example.practice.pattern;

import src.main.java.org.example.collections.set.Contact;

import java.util.*;

public class PracticeMain {

    public static void main(String[] args) throws ClassNotFoundException {
        InnerClass.InnerClassHelper innerClassHelper = new InnerClass.InnerClassHelper();
        InnerClass.InnerClassHelper.doSomething();

        InnerClass.doSomething();

        Map<String, List<Integer>> integerMap = new HashMap<>();

        integerMap.put("One", Arrays.asList(1, null));
        integerMap.put("Two", List.of(2, 21, 22));
        integerMap.put("Three", List.of(3, 30));

        for(Map.Entry<String, List<Integer>> input : integerMap.entrySet()) {
            System.out.println(input.getKey());
            System.out.println(input.getValue());
        }


        var result = Collections.frequency(List.of(1, 2, 2, 4, 5, 7, 7, 7), 7);
        System.out.println(result);

        var result2 = Collections.nCopies(10, new Contact("Test"));
        System.out.println(Collections.frequency(result2, new Contact("Test")));

        System.out.println(Collections.disjoint(List.of(10, 12, 13, 14, 15, 17, 17, 17), List.of(1, 2, 2, 4, 5, 7, 7, 7)));

    }

}
