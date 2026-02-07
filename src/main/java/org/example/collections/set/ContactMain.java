package src.main.java.org.example.collections.set;

import java.util.*;

public class ContactMain {

    public static void main(String[] args) {
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phone = ContactData.getData("phone");

        printData("Email List", emails);
        printData("Phone List", phone);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phone);

        printData("Set Email Data", emailContacts);
        printData("Set Phone Data", phoneContacts);

        Set<Contact> unionEmailAndPhone = new HashSet<>();
        unionEmailAndPhone.addAll(emailContacts);
        unionEmailAndPhone.addAll(phoneContacts);
        printData("Union of Email and Phone", unionEmailAndPhone);

        Set<Contact> intersectionEmailAndPhone = new HashSet<>(emailContacts);
        // Retains all will return common elements in both set object
        intersectionEmailAndPhone.retainAll(phoneContacts);
        printData("Intersection of Email and Phone", intersectionEmailAndPhone);

        Set<Contact> intersectionEmailAndPhone1 = new HashSet<>(phoneContacts);
        // Retains all will return common elements in both set object
        intersectionEmailAndPhone1.retainAll(emailContacts);
        printData("Intersection of Phone and Email", intersectionEmailAndPhone1);

        Set<Contact> AMinusB = new HashSet<>(emailContacts);
        // Retains all will return common elements in both set object
        AMinusB.removeAll(phoneContacts);
        printData("(A - B) emails (A) - phones (B)", AMinusB);

        Set<Contact> BMinusA = new HashSet<>(phoneContacts);
        // Retains all will return common elements in both set object
        BMinusA.removeAll(emailContacts);
        printData("(B - A) phones (B) - emails (A) ", BMinusA);

        Set<Contact> symmetricDifference = new HashSet<>(unionEmailAndPhone);
        symmetricDifference.removeAll(intersectionEmailAndPhone);
        printData("(A U B) - (A n B)  phones (B) - emails (A) ", symmetricDifference);


    }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("-".repeat(20));
        System.out.println(header);
        System.out.println("-".repeat(20));
        contacts.forEach(System.out::println);
    }
}
