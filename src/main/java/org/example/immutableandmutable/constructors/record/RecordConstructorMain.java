package src.main.java.org.example.immutableandmutable.constructors.record;

public class RecordConstructorMain {

    public static void main(String[] args) {

        Person divi = new Person("Divya", "31-01-1998");

        System.out.println(divi);

        Person diviCopy = new Person(divi);

        System.out.println(diviCopy);
    }

}
