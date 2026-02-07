package src.main.java.org.example.immutableandmutable.copyingclasses;

import java.util.Arrays;

public record Person(String name, String dob, Person[] kids) {

    public Person(Person p) {
        this(p.name, p.dob, p.kids == null ? null : p.kids);
    }

    @Override
    public String toString() {
        return "Person { " + " name = ' " + this.name + '\'' +
                ", kids = " + Arrays.toString(this.kids) + '}';
    }

}
