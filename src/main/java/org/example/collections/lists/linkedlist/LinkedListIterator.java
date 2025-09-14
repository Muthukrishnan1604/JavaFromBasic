package src.main.java.org.example.collections.lists.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
Note: One the iteration index completed if we try to iterate the list through iterator it won't work because cursor has no next element
we need to change the cursor index to reiterate the list else we need to create new iterator or we need to use hasPrevious to iterator in the reverse order
 */

public class LinkedListIterator {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Muthu");
        linkedList.push("Divya");
        linkedList.offer("Hema");
        linkedList.offerFirst("Vidya");
        System.out.println(linkedList);
        listIterator(linkedList);
        iterator(linkedList);
    }

    private static void listIterator(LinkedList<String> linkedList) {
        ListIterator<String> iterator = linkedList.listIterator(1);

        while (iterator.hasNext()) {
            iterator.add("Test");
            System.out.print(iterator.nextIndex()+ ".");
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()) {
            System.out.println("Inside iterator it won't work because it has no next element");
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()) {
            System.out.println("Inside 2 iteration");
            System.out.println(iterator.previous());
        }

    }

    private static void iterator(LinkedList<String> linkedList) {
        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
