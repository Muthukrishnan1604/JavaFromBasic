package src.main.java.org.example.challenges.generics.challenge;

import src.main.java.org.example.generics.util.QueryList;

import java.util.ArrayList;
import java.util.List;

/*
Note inside the diamond bracket we can't pass the different type even if it parent and child classes
 */

public class Main {

    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++) {
            students.add(new Student() {
                @Override
                public int compareTo(Double anotherId) {
                    return 0;
                }
            });
        }

        //printList(students);
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }

        //printList(lpaStudents);
        printMoreList(lpaStudents);

        testList(new ArrayList<String>(List.of("Bharath", "Bharathi", "Sathish", "Sakthi")));
        testList(new ArrayList<Integer>(List.of(1, 2, 6, 7, 8)));


    }

    public static void printMoreList(List<? extends Student> students) {
        for(var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {
        for(var element : list) {
            if(element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if(element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

    /*
    public static <T extends Student> void printList(List<T> students) {
        Student last = students.getLast();
        students.set(0, (T) last);
        for(var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }
    */

}
