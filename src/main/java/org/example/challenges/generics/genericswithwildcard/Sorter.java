package src.main.java.org.example.challenges.generics.genericswithwildcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorter {

    public static void sortList(List<? extends Comparable> value) {
        Collections.sort(value);
        System.out.println(value);
    }

    public static <T, U> List<? super Object>  merge(List<T> type1List, List<U> type2List) {

        List<? super Object> objects = new ArrayList<>();
        objects.addAll(type1List);
        objects.addAll(type2List);

        return objects;
    }

}
