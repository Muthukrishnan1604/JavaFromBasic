package src.main.java.org.example.immutableandmutable.unmodifiablecollections;

import java.util.*;

public class UnmodifiableCollectionMain {

    public static void main(String[] args) {
        StringBuilder muthuNotes = new StringBuilder();
        StringBuilder diviNotes = new StringBuilder("I love Muthu");

        Student muthu = new Student("Muthu", muthuNotes);
        Student divi = new Student("Divi", diviNotes);

        List<Student> students = new ArrayList<>(List.of(muthu, divi));
        List<Student> studentsFirstCopy = new ArrayList<>(students);
        List<Student> studentsSecondCopy = List.copyOf(students);
        List<Student> studentThirdCopy = Collections.unmodifiableList(students);

        muthuNotes.append("I love Divi");

        students.add(new Student("Latha", new StringBuilder("I love Durai")));

        studentsFirstCopy.sort(Comparator.comparing(Student::getName));

        students.get(0).getStudentNotes().append(" I love Divi Very Much");

        students.forEach(System.out::println);

        System.out.println("-".repeat(20));

        studentsFirstCopy.forEach(System.out::println);

        System.out.println("-".repeat(20));

        studentsFirstCopy.add(new Student("Durai", new StringBuilder()));

        studentsFirstCopy.get(1).getStudentNotes().append(" I too love Muthu very much");

        students.forEach(System.out::println);

        System.out.println("-".repeat(10) + " ArrayList " + "-".repeat(10));

        studentsFirstCopy.forEach(System.out::println);

        System.out.println("-".repeat(10) + " Copy of List " + "-".repeat(10));

        studentsSecondCopy.forEach(System.out::println);

        System.out.println("-".repeat(10) + " Unmodifiable List " + "-".repeat(10));

        studentThirdCopy.forEach(System.out::println);
    }

}
