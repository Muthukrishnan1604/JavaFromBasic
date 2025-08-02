package src.main.java.org.example.lists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {

    public static void main(String... args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("Apples", "Fruits", 6);
        groceryArray[2] = new GroceryItem("Bananna", "Fruits", 8);
        groceryArray[2] = "Test"; // If we generally assign it as Object we can assign String value also to that field

        System.out.println(Arrays.toString(groceryArray));
        List arrayList = new ArrayList(); // If we didn't include the type inside diamond operator it will consider it as Object
        arrayList.add("Test");
        arrayList.add(groceryArray[0]);
        System.out.println(Arrays.toString(arrayList.stream().toArray()));

        // Above way is not advisable

        List<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Egg", "DIARY", 10));
        groceryList.add(new GroceryItem("Apple", "PRODUCE", 10));
        groceryList.add(1, new GroceryItem("Oranges", "PRODUCE", 10));
        groceryList.set(1, new GroceryItem("Yogurt", "DIARY", 5)); // Set will repllace that value in that index

        groceryList.remove(groceryList.size() - 1);

        System.out.println(groceryList);
        System.out.println(groceryList.size());
    }

}
