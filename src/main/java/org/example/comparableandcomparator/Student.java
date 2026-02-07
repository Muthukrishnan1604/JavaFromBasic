package src.main.java.org.example.comparableandcomparator;

import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student> {

    private String name;

    private static int Last_ID = 1000;

    private static Random random = new Random();

    private int id;

    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = Last_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
    }

}
