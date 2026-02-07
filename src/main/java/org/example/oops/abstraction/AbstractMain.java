package src.main.java.org.example.oops.abstraction;

import java.util.ArrayList;

/*
We can't create instance for abstract class

Abstract class can still have a constructor, which will be called by its subclasses during their construction

A class that extends an abstract class can also be abstract itself. If we extends it in abstract class

--> It can implement all of the parent's abstract methods
--> It can implement some of them
--> or it can implement none of them

Abstract class can extend a concrete class [Class with implementation is called concrete class

Abstract method should be always public or protected because child class has to access it to do implementation.
If we keep it as private we can't override it that's why private is not supported with abstract method
 */
public class AbstractMain {

    public static void main(String[] args) {
        Animal dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        /*
            Below is creating an anonymous inner class. Let's break down what that means:

new Animal("German shepard", "big", 150) { ... }: This line is telling the compiler to do two things at once:

Create a new, unnamed class that extends the Animal abstract class.

Immediately create an instance of that new, unnamed class.

@Override public void move(String speed) { ... }: Inside the curly braces {}, you are providing the concrete implementations for the abstract methods move() and makeNoise() for this new, unnamed class. This is the crucial step. By providing these implementations, you are making this new, anonymous class a concrete class.

Analogy:
Think of it this way: The Animal abstract class is like a blueprint for a house that has a section labeled "Build a door here" but doesn't specify what kind of door.

Your code is like saying, "I want to build a house based on the Animal blueprint, but for this specific house, I'm going to put in a move door that says 'Nothing' and a makeNoise door that also says 'Nothing'."

You are not building an "Animal" house; you are building a specific, unnamed "Animal-like" house that satisfies all the requirements of the Animal blueprint.

Why It's Called an "Anonymous Inner Class"
Anonymous: It has no name. You can't refer to this class later in your code.

Inner: It's defined within the context of another expression or method (in this case, within the animals.add() method call).

The "Under the Hood" Equivalent
The code you wrote is a compact way of doing the following:

Java

// 1. Create a concrete class that extends Animal.
class MySpecificAnimal extends Animal {
    public MySpecificAnimal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("Nothing");
    }

    @Override
    public void makeNoise() {
        System.out.println("Nothing");
    }
}

// 2. Create an instance of that concrete class.
Animal myAnimal = new MySpecificAnimal("German shepard", "big", 150);

// 3. Add the instance to the list.
animals.add(myAnimal);
As you can see, your code is a much more concise and elegant way to achieve the same result. The key takeaway remains: You are not instantiating the abstract class directly; you are instantiating a concrete, anonymous subclass of it.
         */
        animals.add(new Animal("German shepard", "big", 150) {
            @Override
            public void move(String speed) {
                System.out.println("Nothing");
            }

            @Override
            public void makeNoise() {
                System.out.println("Nothing");
            }
        });
        animals.add(new Fish("GoldFish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));
        animals.add(new Horse("Clydesdale", "large", 1000));
        for(Animal animal : animals) {
            doAnimalStuff(animal);
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
        animal.getExplicit();

        if(animal instanceof Mammal mammal) {
            mammal.shedHair();
        }
    }
}
