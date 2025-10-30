package src.main.java.org.example.immutableandmutable.constructors.record;

import org.jetbrains.annotations.NotNull;

/*
Point to remember - Instance block won't support in record
 */
public record Person(String name, String dob) {
/*
    public Person(String name, String dob) {
        System.out.println("Inside Canonical Constructor");
        this.name = name;
        this.dob = dob.replace("-", "/");
    }
*/

    public Person {
        System.out.println("Calling Compact Constructor");
        if(dob == null) throw new IllegalArgumentException("Bad Date");
        dob = dob.replace("-", "/");
    }

    public Person(Person person) {
        this(person.name, person.dob);
    }

}
