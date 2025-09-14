package src.main.java.org.example.collections.lists.arraylist;

public record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DIARY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
