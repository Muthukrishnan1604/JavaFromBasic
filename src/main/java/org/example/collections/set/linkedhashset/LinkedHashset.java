package src.main.java.org.example.collections.set.linkedhashset;

/*
Helps us to maintain the insertion order in the set. But time complexity is little bit high compared to Hashset due to
Doubly linked list
*/

import src.main.java.org.example.collections.set.Contact;
import src.main.java.org.example.collections.set.ContactData;
import src.main.java.org.example.oops.inheritance.composition.PersonalComputer;

import java.util.Comparator;
import java.util.List;

public class LinkedHashset {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");


    }

}
