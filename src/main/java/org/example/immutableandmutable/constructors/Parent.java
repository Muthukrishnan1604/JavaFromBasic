package src.main.java.org.example.immutableandmutable.constructors;

public class Parent {

    private final String name;

    private final String dob;

    protected final int sibilings;

    {
        /*name = "Muthu";
        dob = "16/04/1998";*/
        System.out.println("In parent Initializers");
    }

    static {
        System.out.println("In parent static block");
    }

    public Parent(String name, String dob, int sibilings) {
        this.name = name;
        this.dob = dob;
        this.sibilings = sibilings;
        System.out.println("In Parent Constructor");
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "name = " + name + '\'' + ", dob = " + dob + '\'';
    }
}
