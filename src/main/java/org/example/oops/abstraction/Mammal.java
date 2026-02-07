package src.main.java.org.example.oops.abstraction;

/*
A class that extends an abstract class can also be abstract itself. If we extends it in abstract class

--> It can implement all of the parent's abstract methods
--> It can implement some of them
--> or it can implement none of them

*/

public abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        getExplicit();
        System.out.println("slow".equalsIgnoreCase(speed) ? "walks":"runs");
    }

    public abstract void shedHair();
}
