package src.main.java.org.example.challenges.innerclass;

/*
Challenge 1: The Zoo Management System 🐾
Question: A zoo wants to create a management system. Design a Java class structure that includes a main class Zoo,
a non-static inner class Animal, and a static nested class SpeciesCounter. The Animal class should have name and
species fields. The SpeciesCounter should be able to
count the number of animals of a specific species, independent of any Zoo instance. Provide the complete code.
 */

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Zoo zoo = new Zoo();

        animalList.add(zoo.new Animal("Lion", "Lion Species"));
        animalList.add(zoo.new Animal("Lion", "Lion Species"));
        animalList.add(zoo.new Animal("Lion", "Lion Species"));
        animalList.add(zoo.addAnimal("Tiger", "Cat Species"));

        animalList.get(3).displayInfo();
        Zoo.Animal.displayInfo(animalList.get(0));

        System.out.println("Number of species = " + SpeciesCounter.countSpecies(animalList, "Cat Species"));
        System.out.println("Number of species = " + SpeciesCounter.countSpecies(animalList, "Lion Species"));

    }

    private Animal addAnimal(String animalName, String speciesName) {
        return new Animal(animalName, speciesName);
    }

    private class Animal {

        private String animalName;

        private String species;

        public Animal(String animalName, String species) {
            this.animalName = animalName;
            this.species = species;
        }

        public void displayInfo() {
            System.out.println("Animal Name = " + this.animalName + " Species Name = " + this.species);
        }

        public static void displayInfo(Animal animal) {
            if(animal != null)
                System.out.println("Animal Name = " + animal.animalName + " Species Name = " + animal.species);
            else
                System.out.println("No Animal passed for display");
        }
    }

    private static class SpeciesCounter {

       private static long countSpecies(List<Animal> animals, String speciesToCount) {
           if(animals != null && animals.size() > 0) {
               return animals.stream()
                       .filter(animal -> speciesToCount.equalsIgnoreCase(animal.species))
                       .count();
           }
           return 0;
       }

    }

}
