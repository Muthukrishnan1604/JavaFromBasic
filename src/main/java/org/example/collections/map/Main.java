package src.main.java.org.example.collections.map;

import src.main.java.org.example.collections.set.Contact;
import src.main.java.org.example.collections.set.ContactData;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Contact> phone = ContactData.getData("Phone");
        List<Contact> email = ContactData.getData("email");

        List<Contact> fullContact = new ArrayList<>(phone);
        fullContact.addAll(email);

        fullContact.forEach(System.out::println);
        System.out.println("-".repeat(40));

        Map<String, Contact> contacts = new HashMap<>();

        for(Contact contact : fullContact) {
            contacts.put(contact.getName(), contact);
        }

        contacts.put("Muthu", fullContact.getFirst());


        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(40));

        System.out.println(contacts.get("Muthu"));
        System.out.println(contacts.get("Divi"));

        Contact defaultContact = new Contact("Divi");
        System.out.println(contacts.getOrDefault("Divi", defaultContact));

        System.out.println("-".repeat(40));
        contacts.clear();

        for(Contact contact : fullContact) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if(duplicate != null) {
                /*System.out.println("duplicate = " + duplicate);
                System.out.println("current = " + contact);*/
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }

        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(40));
        contacts.clear();

        for(Contact contact : fullContact) {
            Contact duplicateContact = contacts.putIfAbsent(contact.getName(), contact);
            if(duplicateContact != null) {
                contacts.put(contact.getName(), contact.mergeContactData(duplicateContact));
            }
        }

        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(40));
        contacts.clear();

        fullContact.forEach(contact -> contacts.merge(contact.getName(), contact,
                (prev, curr) -> {
                    System.out.println("Previous - " + prev + " : current - " + curr);
                    Contact merged = prev.mergeContactData(curr);
                    System.out.println("merged - " + merged);
                    return merged;
                }));
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(40));
        for(String contactName : new String[] {"Muthu", "Divi", "Hema", "Hepsi"}) {
            contacts.computeIfAbsent(contactName, Contact::new);
        }
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(40));
        for(String contactName : new String[] {"Muthu", "Divi", "Hema", "Hepsi"}) {
            contacts.computeIfPresent(contactName, (k, v) -> {
                Contact contact = new Contact(k);
                contact.addEmail("Fun Panrom");
                return contact;
            });
        }
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));
        System.out.println("-".repeat(40));

        Contact contact = contacts.replace("Hepsi", new Contact("Hepsi", "Hepzhi@funpanrom.com"));
        System.out.println(contact);
        System.out.println("-".repeat(40));

        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));
        System.out.println(contacts.get("Hepsi"));

        System.out.println("-".repeat(40));

        contacts.remove("Hepsi");


    }

}
