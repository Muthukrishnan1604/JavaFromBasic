package src.main.java.org.example.challenges.generics.sorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    public static void main(String[] args) {

        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge).reversed();
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);

        Person muthu = new Person("Muthu", 27);
        Person divi = new Person("Divi", 28);
        Person hema = new Person("Divi", 27);

        List<Person> people = new ArrayList<>(Arrays.asList(muthu, divi, hema));

        sortList(people, nameComparator, ageComparator).forEach(System.out::println);

    }

    private static <T> List<? extends T> sortList(List<T> list, Comparator<T> primaryComparator, Comparator<T> secondaryComparator) {
        if(list == null || list.isEmpty()) {
            return null;
        }
        list.sort(primaryComparator.thenComparing(secondaryComparator));
        return list;
    }
}
