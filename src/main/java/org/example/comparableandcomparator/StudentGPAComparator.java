package src.main.java.org.example.comparableandcomparator;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.getName()).compareTo(o2.gpa + o2.getName());
    }

}
