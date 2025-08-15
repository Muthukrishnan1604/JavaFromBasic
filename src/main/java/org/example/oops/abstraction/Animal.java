package src.main.java.org.example.oops.abstraction;

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    //private abstract void move(String speed); This will throw error because abstract don't have the body so in child class we need to do the implementation so it should be public or protected


    public abstract void move(String speed);

    public abstract void makeNoise();

    public final void getExplicit() {
        System.out.println(getExplicitType());
    }

    private String getExplicitType() {
        return this.getClass().getSimpleName() + " (" + type + ")";
    }

}
