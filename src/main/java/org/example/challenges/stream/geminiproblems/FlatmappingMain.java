package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Student {
    private final String name;

    private final List<String> enrolledCourse;

    public Student(String name, List<String> enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse != null && !enrolledCourse.isEmpty() ? new ArrayList<>(enrolledCourse) : new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<String> getEnrolledCourse() {
        return new ArrayList<>(this.enrolledCourse);
    }

    @Override
    public String toString() {
        return "Student [ Name = " + this.name + " , EnrolledCourse = " + this.enrolledCourse + " ]";
    }
}

public class FlatmappingMain {

    public static void main(String[] args) {
        List<Student> input = List.of(new Student("Victor", Arrays.asList("Maths", "Tamil", "Science", "English")),
                new Student("Divi", Arrays.asList("Maths", "Tamil", "Science", "English", "Physics", "Chemistry")),
                new Student("Muthu", Arrays.asList("Maths", "Tamil", "Science", "English", "Physics", "Chemistry")),
                new Student("Hepsi", Arrays.asList("Maths", "Tamil", "Science", "English")),
                new Student("Hema", Arrays.asList("Maths", "Tamil", "Science", "English", "Physics", "Chemistry")));

    }

}
