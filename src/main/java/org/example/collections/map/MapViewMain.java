package src.main.java.org.example.collections.map;

import src.main.java.org.example.collections.set.Contact;
import src.main.java.org.example.collections.set.ContactData;

import java.util.*;

/*
if we update anything in view it will impact the map
 */

public class MapViewMain {

    public static void main(String[] args) {

        Map<String, Contact> contacts = new HashMap<>();

        ContactData.getData("phone").forEach(contact -> contacts.put(contact.getName(), contact));

        ContactData.getData("email").forEach(contact -> contacts.put(contact.getName(), contact));

        Set<String> keysView = contacts.keySet();

        System.out.println(keysView);

        Set<String> copyofKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyofKeys);

        if(contacts.containsKey("Muthu Krishnas")) {
            System.out.println("Muthu is present");
        }

        System.out.println(contacts.get("Muthu Krish"));

        System.out.println(keysView);
        System.out.println(copyofKeys);
        keysView.remove("Muthu Krish");
        System.out.println(keysView);
        System.out.println(copyofKeys);
        contacts.forEach((k, v) -> System.out.println(v));


        keysView.retainAll(List.of("Muthu", "Divya", "Hema"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        keysView.clear();

        System.out.println(contacts);

        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("Phone").forEach(c -> contacts.put(c.getName(), c));

        System.out.println(keysView);

        var values = contacts.values();
        values.forEach(System.out::println);

        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);

        contacts.put(null, new Contact("Null Contact"));

        System.out.println(keysView);
    }

}
