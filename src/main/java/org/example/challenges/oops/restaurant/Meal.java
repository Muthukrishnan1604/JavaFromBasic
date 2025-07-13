package src.main.java.org.example.challenges.oops.restaurant;

import java.util.Scanner;

public class Meal {

    private Burger burger;

    private Drink drink;

    private SideItem sideItem;

    public Meal() {
        System.out.println("Default Meal Combo");
        this.burger = new Burger("Normal Burger", false, "", 0);
        this.drink = new Drink("Regular");
        this.sideItem = new SideItem("French Fries");
    }

    public Meal(boolean isVeg, boolean isToppingsNeeded, int toppingsLimit, String drinkSize, String sideDish) {
        String burgerType = isVeg ? "Veg Burger" : "Non Veg Burger";
        this.burger = new Burger(burgerType, isToppingsNeeded, "", toppingsLimit);
        this.drink = new Drink(drinkSize);
        this.sideItem = new SideItem(sideDish);
    }

    /*
        Factory method to return Meal based on the option selected by user
     */
    public static Meal getMeal(Scanner sc, int mealType, boolean isVeg) {
        return switch (mealType) {
            case 2 -> getMeal(sc, isVeg, false);
            case 3 -> getMeal(sc, isVeg, true);
            default -> new Meal();
        };
    }

    /*
        Method to get all the details to generate the Meal object
     */
    private static Meal getMeal(Scanner sc, boolean isVeg, boolean isDeluxe) {
        boolean isToppingsNeeded = false;
        int toppingsLimit;
        String drinkSize;
        String sideDish;
        if(isVeg) {
            System.out.println("Deliciously green, exceptionally good.");
        } else {
            System.out.println("Exquisite cuts, unforgettable flavors.");
        }
        if (isDeluxe) {
            toppingsLimit = 5;
        } else {
            System.out.println("Do you need toppings ? Click 1 for yes and 0 for No");
            isToppingsNeeded = (sc.nextInt() == 1) ? true : false;
            if(isToppingsNeeded) {
                System.out.println("Select the toppings limit from 1 to 3");
                toppingsLimit = sc.nextInt();
            } else {
                toppingsLimit = 0;
            }
        }
        sc.nextLine(); // Consumes the leftover newline character
        System.out.print("Select the Drink size -> Large, Medium, Regular");
        drinkSize = sc.nextLine();
        if(isVeg) {
            System.out.printf("Pick Your Side Dish from below option %n 1 for French Fries %n 2 for Cheese Balls");
        } else {
            System.out.printf("Pick Your Side Dish from below option %n 1 for French Fries %n 2 for Cheese Balls %n 3 for Chicken Nuggets");
        }
        sideDish = getSideDish(sc.nextInt());

        return new Meal(isVeg, isToppingsNeeded, toppingsLimit, drinkSize, sideDish);
    }

    /*
        Method to get the side dish details based on the int value provided
     */
    private static String getSideDish(int category) {
        String sideDish = "French Fries";
        if(category == 2) {
            sideDish = "Cheese Balls";
        } else if(category == 3) {
            sideDish = "Chicken Nuggets";
        }
        return sideDish;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }
}
