package src.main.java.org.example.lists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"Apples", "Bananas", "Milks", "Eggs"};

        ArrayList<String> arrayList2 = new ArrayList<>(List.of("pickles", "biscuits", "Chocolates"));

        ArrayList<String> arrayList3 = new ArrayList<>(List.of("Maggi", "Dhal", "Masala"));

        ArrayList<String> arrayList4 = new ArrayList<>(List.of("biscuits", "Dhal"));


        List<String> list = List.of(items); // This will create Immutatble collection

        System.out.println(list);

        System.out.println(list.getClass().getName());

        ArrayList<String> arrayList = new ArrayList<>(list);

        System.out.println(arrayList.getClass().getName());

        addToList(arrayList);


        addAllToList(arrayList, arrayList2);

        printList(arrayList);

        removeAllFromList(arrayList, arrayList3);

        printList(arrayList);

        removeFirstElementFromList(arrayList);

        System.out.println(arrayList.removeAll(arrayList4));

        System.out.println(arrayList);

        System.out.println("Fourth Element = " + arrayList.get(4));

        if(arrayList.contains("pickles")) {
            System.out.println("List contains pickles");
        }

        System.out.println("Array List Contain duplicate elements");

        arrayList.add("Yogurt");

        System.out.println(arrayList);

        System.out.println("First occurance =" + arrayList.indexOf("Yogurt"));

        System.out.println("Last Occurance = " + arrayList.lastIndexOf("Yogurt"));

        System.out.println("If element not found it will return " + arrayList.lastIndexOf("yogurt"));

        arrayList.remove(1);

        System.out.println(arrayList);

        arrayList.remove("Yogurt");

        System.out.println(arrayList);

        System.out.println("Retain all will delete all the elements except the elements mentioned in the retain all");

        System.out.println(arrayList.retainAll(List.of("Bananas", "Eggs", "pickles", "Chocolates")));

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println("IsEmpty = " + arrayList.isEmpty());

        arrayList.addAll(List.of("Bananas", "Eggs", "pickles", "Chocolates"));

        arrayList.addAll(0, Arrays.asList("Milk", "Butter", "Bread", "Mustard"));

        System.out.println(arrayList);

        arrayList.sort(Comparator.naturalOrder());

        System.out.println(arrayList);

        arrayList.sort(Comparator.reverseOrder());

        System.out.println(arrayList);

        var groceryArray = arrayList.toArray(new String[arrayList.size()]);

        System.out.println(Arrays.toString(groceryArray));
    }

    private static void removeFirstElementFromList(ArrayList<String> arrayList) {
        System.out.println("To remove element from the first");
        arrayList.removeFirst();
        printList(arrayList);
    }

    private static void removeAllFromList(ArrayList<String> arrayList, ArrayList<String> arrayList3) {
        System.out.println(arrayList.removeAll(arrayList3));
    }

    private static void addAllToList(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        arrayList.addAll(arrayList2);
    }

    private static void addToList(ArrayList<String> arrayList) {
        arrayList.add("Yogurt");
        printList(arrayList);
    }

    private static void printList(ArrayList<String> arrayList) {
        System.out.println(arrayList);
    }

}
