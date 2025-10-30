package src.main.java.org.example.immutableandmutable.copyingclasses;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person yugan = new Person("Yugan", "01/01/2022", null);
        Person victor = new Person("Victor", "16/06/2018", null);
        Person hepsi = new Person("Hepsi", "15/04/2016", null);
        Person muthu = new Person("Muthu", "16/04/1998", new Person[] {yugan, victor});
        Person divi = new Person("Divi", "31/01/1998", new Person[] {yugan, victor});

        Person[] persons = new Person[] {yugan, victor, hepsi, muthu, divi};

        Person[] personShallowCopy = Arrays.copyOf(persons, persons.length);

        System.out.println("-".repeat(10) + " Shallow Copy " + "-".repeat(10));

        /**
         * Below two lines will break the immutability
         */
        var diviKids = personShallowCopy[4].kids();
        diviKids[1] = hepsi;

        for(int i = 0; i < persons.length; i++) {
            if(persons[i] == personShallowCopy[i]) {
                System.out.println("Equal Reference " + persons[i]);
            }
        }

        System.out.println("-".repeat(10) + " Deep Copy " + "-".repeat(10));

        Person[] personDeepCopy = new Person[5];

        /**
         *
         Arrays.setAll(personDeepCopy, i -> new Person(persons[i]));

         */

        for(int i = 0; i < 5; i++) {
            personDeepCopy[i] = new Person(persons[i]);
        }

        for(int i = 0; i < persons.length; i++) {
            if(persons[i] == personDeepCopy[i]) {
                System.out.println("Equal Reference " + persons[i]);
            }
        }

        System.out.println(persons[4]);
        System.out.println(personDeepCopy[4]);
    }

}
