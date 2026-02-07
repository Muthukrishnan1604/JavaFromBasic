package src.main.java.org.example.collections.lists.arraylist;

import java.util.*;

public class CollectionArrayListMain {

    public static void main(String[] args) {
        Collection<String> list = new HashSet<>();

        String[] names = {"Muthu", "Divya", "Hema", "Muthu"};

        list.addAll(Arrays.asList(names));

        System.out.println(list);

        list.add("Krishna");
        list.add("Santha");

        list.addAll(Arrays.asList("Pradeep", "Vijay", "Vanaja"));

        System.out.println(list);
        System.out.println(list.contains("Vijay"));

        list.removeIf(str -> str.startsWith("P"));
        System.out.println("List contains Pradeep " + list.contains("Pradeep"));
        
    }

}
