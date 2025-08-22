package src.main.java.org.example.challenges.generics.challenge;

import src.main.java.org.example.challenges.generics.challenge.util.QueryItem;

import java.util.Random;

public abstract class Student implements QueryItem {

    private String name;

    private String course;

    private int yearStarted;

    private int studentId;

    protected static Random random = new Random();

    private static String[] firstNames = {"Muthu", "Divi", "Hema", "Hepsi", "Victor"};

    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2025);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == Integer.parseInt(value);
            default -> false;
        };
    }

    @Override
    public int compareTo(Integer anotherId) {
        return Integer.compare(studentId, anotherId);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public abstract int compareTo(Double anotherId);
}
