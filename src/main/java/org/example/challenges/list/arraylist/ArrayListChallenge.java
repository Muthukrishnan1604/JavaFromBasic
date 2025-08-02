package src.main.java.org.example.challenges.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        List<String> groceryList = new ArrayList<>();

        while (flag) {
            printActions();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> addItems(groceryList);
                case 2 -> removeElement(groceryList);
                default -> flag = false;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }

    private static void removeElement(List<String> groceryList) {
        System.out.println("Remove item(s) [separate items by comma]:");

        String[] items = sc.nextLine().split(",");
        for(String item : items) {
            String trimmed = item.trim();
            if(groceryList.indexOf(trimmed) > 0) {
                groceryList.remove(trimmed);
            } else {
                System.out.println(item + " Element not exist");
            }

        }
    }

    private static void addItems(List<String> groceryList) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = sc.nextLine().split(",");
        for(String item : items) {
            String trimmed = item.trim();
            if(groceryList.indexOf(trimmed) < 0) {
                groceryList.add(trimmed);
            } else {
                System.out.println(item + " Element already exist in the list");
            }
        }
    }

    private static void printActions() {
        String textBlock = """
                Available actions:
                
                0 - to shutdown
                
                1- to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

}
