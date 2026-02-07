package src.main.java.org.example.collections.map.linkedhashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    public static int lastId = 1;

    private String name;

    private int id;

    private List<Course> courseList;

    public Student(String name, List<Course> courseList){
        this.name = name;
        this.courseList = courseList;
        id = lastId++;
    }

    public Student(String name, Course course){
        this(name, new ArrayList<>(List.of(course)));
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addCourse(Course course) {
        this.courseList.add(course);
    }

    @Override
    public String toString() {
        String[] coursenames = new String[courseList.size()];
        Arrays.setAll(coursenames, i -> courseList.get(i).name());

        return "[%d] : %s".formatted(id, String.join(",", coursenames));
    }

}
