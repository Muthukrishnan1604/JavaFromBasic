package src.main.java.org.example.oops.inheritance;

/*
When extending a class, it's important to provide a default (no-argument) constructor
if you've defined any parameterized constructors. This is necessary because
the subclass constructor implicitly calls the superclass's default constructor unless specified otherwise.
*/

public class InheritanceMain {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog Labour = new Dog("Lab", 10);
        doAnimalStuff(Labour, "fast");

        Dog retriever = new Dog("retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldFish = new Fish("Gold Fish", 0.25, 2, 3);
        doAnimalStuff(goldFish, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
