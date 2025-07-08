package src.main.java.org.example.challenges.oops.inheritance.composiition;

public class CompositionChallengeMain {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.setKitchenState(false, true, true);
        kitchen.doKitchenWork();
        System.out.println("-".repeat(20));
        kitchen.getBrewCoffee().setHasWorkToDo(true);
        kitchen.doKitchenWork();
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getIceBox().orderFood();
    }

}
