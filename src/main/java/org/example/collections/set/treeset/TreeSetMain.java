package src.main.java.org.example.collections.set.treeset;

import src.main.java.org.example.collections.set.Contact;
import src.main.java.org.example.collections.set.ContactData;
import src.main.java.org.example.collections.set.linkedhashset.LinkedHashset;

import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        Comparator<Contact> myContactComparator = Comparator.comparing(Contact::getName);

        NavigableSet<Contact> sorted = new TreeSet<>(myContactComparator);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justName = new TreeSet<>();
        phones.forEach(phone -> justName.add(phone.getName()));
        System.out.println(justName);

        NavigableSet<Contact> fullSet = new TreeSet<>(myContactComparator);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        System.out.println("-".repeat(80));
        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.sort(sorted.comparator());
        fullList.forEach(System.out::println);

        Contact min =  Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullSet, fullSet.comparator());

        Contact first = fullSet.first();
        Contact last = fullSet.last();

        System.out.println("-".repeat(50));
        System.out.printf("min = %s, first = %s %n", min.getName(), first.getName());
        System.out.printf("max = %s, last = %s %n", max.getName(), last.getName());

        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);
        System.out.println("First Element = " + copiedSet.pollFirst());
        System.out.println("Last Element = " + copiedSet.pollLast());

        copiedSet.forEach(System.out::println);

        Contact durai = new Contact("Durai");
        Contact latha = new Contact("Latha");
        Contact hepsi = new Contact("Hepsi");
        Contact victor = new Contact("Victor");

        for(Contact c : List.of(durai, latha, hepsi, victor)) {
            System.out.printf("Ceiling(%s)=%s%n", c.getName(), fullSet.ceiling(c));
            System.out.printf("Higher(%s)=%s%n", c.getName(), fullSet.higher(c));
        }
        System.out.println("-".repeat(30));

        // Note ceiling will return greater than or equal to element while Higher return only element greater than that

        NavigableSet<Integer> integers = new TreeSet<>();
        integers.addAll(List.of(8, 2, 3, 4, 5, 6, 10));

        System.out.println(integers);

        System.out.println(integers.ceiling(6)); // This will return equal to value or greater value if nothing found it will return null

        System.out.println(integers.higher(9));// If we give the number which does not exist in that case it will return higher element or null if nothing exist

        System.out.println(integers.lower(2));// If we give the number which does not exist in that case it will return lower element or null

        System.out.println(integers.floor(2));// If we give the number which does not exist in that case it will return higher element

        NavigableSet<Contact> descendingSet = new TreeSet<>(fullSet.descendingSet());

        Contact lastContact = descendingSet.pollLast();
        System.out.println("Removed last contact = " + lastContact);
        // Note if we remove the element or modify the element in the descending set it will reflect the same in actual set
        System.out.println("Normal Treeset");
        System.out.println("-".repeat(40));
        fullSet.forEach(System.out::println);
        System.out.println("-".repeat(40));
        System.out.println("Descending Treeset");
        System.out.println("-".repeat(40));
        descendingSet.forEach(System.out::println);

        System.out.println("-".repeat(40));

    }
}
