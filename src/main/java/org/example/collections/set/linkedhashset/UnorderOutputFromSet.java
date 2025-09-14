package src.main.java.org.example.collections.set.linkedhashset;

import java.util.*;

public class UnorderOutputFromSet {

    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparing(String::stripLeading);
        Set<String> inputList = new TreeSet<>(comparator);
        List<String> list = new ArrayList<>(Arrays.asList("Muthu", "Divi", "Hema", "Hepsi", "Muthu", " Muthu"));
        System.out.println(list);
        inputList.add("Krishna");
        inputList.addAll(list);

        System.out.println(inputList);
    }

}
