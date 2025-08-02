package src.main.java.org.example.lists.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {

    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add(0, "Madurai");
        placesToVisit.add("Tenkasi");
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        System.out.println("-----After Remove-----");
        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        getElements(placesToVisit);

        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);
        printItinerary4(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Chennai");
        list.addLast("Ooty");
        // Queue Methods to add the element in the last we need to use offer
        list.offer("Kerala");
        list.offerFirst("Tirunelveli");
        list.offerLast("Kanyakumari");
        // Stack Methods
        list.push("Tirchy");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Tirchy");

        System.out.println(list);
        String s1 = list.remove(); // Remove first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // Remove first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // Remove last element
        System.out.println(s3 + " was removed");

        // Queue / Deque poll methods
        String p1 = list.poll(); // Remove first element
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst(); // Remove first element
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast(); // Remove last
        System.out.println(p3 + " was removed");

        list.push("Tenkasi");
        list.push("Tirunelveli");
        list.push("Kerala");

        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");
    }

    private static void getElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("Get First Element = " + list.getFirst());
        System.out.println("Get Last Element = " + list.getLast());

        System.out.println("Tirunelveli is at index " + list.indexOf("Tirunelveli"));
        System.out.println("Tirunelveli is at last index " + list.lastIndexOf("Tirunelveli"));

        // Queue retrieval method
        System.out.println("Element from element " + list.element());

        // Stack retrieval method
        System.out.println("Element from peek() " + list.peek());
        System.out.println("Element from peekFirst() " + list.peekFirst());
        System.out.println("Element from peekLast() " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trips starts at " + list.getFirst());
        for(int i = 0; i < list.size() - 1; i++) {
            System.out.println("--> From: " + list.get(i) + " to " + list.get(i+1));
        }
        System.out.println("Trips ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trips starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trips ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trips starts at " + list.getFirst());
        String previousTown = list.getFirst();
        String town = "";
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trips ends at " + list.getLast());
    }

    public static void printItinerary4(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if("Tirunelveli".equals(iterator.next())) {
                //list.remove();// This will cause concurrent modification exception
                iterator.remove();
            }
        }
    }
}
