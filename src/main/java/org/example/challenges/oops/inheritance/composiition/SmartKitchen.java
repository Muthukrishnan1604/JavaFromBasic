package src.main.java.org.example.challenges.oops.inheritance.composiition;

public class SmartKitchen {

    private CoffeeMaker brewCoffee;

    private DishWasher dishWasher;

    private Refrigerator iceBox;

    public SmartKitchen() {
        brewCoffee = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewCoffee() {
        return brewCoffee;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    private void addWater(boolean hasWorkToDo) {
        brewCoffee.setHasWorkToDo(hasWorkToDo);
    }

    private void pourMilk(boolean hasWorkToDo) {
        iceBox.setHasWorkToDo(hasWorkToDo);
    }

    private void loadDishwasher(boolean hasWorkToDo) {
        dishWasher.setHasWorkToDo(hasWorkToDo);
    }

    public void setKitchenState(boolean isAddWater, boolean isPourMilk, boolean isLoadDishwasher) {
        addWater(isAddWater);
        pourMilk(isPourMilk);
        loadDishwasher(isLoadDishwasher);
    }

    public void doKitchenWork() {
        brewCoffee.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}
