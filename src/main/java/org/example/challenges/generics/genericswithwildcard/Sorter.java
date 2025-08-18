package src.main.java.org.example.challenges.generics.genericswithwildcard;

import java.util.Collections;
import java.util.List;

public class Sorter {

    public static void sortList(List<? extends Comparable> value) {
        Collections.sort(value);
        System.out.println(value);
    }

}
