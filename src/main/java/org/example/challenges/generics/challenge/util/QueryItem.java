package src.main.java.org.example.challenges.generics.challenge.util;

public interface QueryItem extends Comparable {

    public boolean matchFieldValue(String fieldName, String value);

    int compareTo(Integer anotherId);
}
