package src.main.java.org.example.challenges.oops.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {

        System.out.println("---- Welcome to Div's Burger Shop! ----");

        order();
    }

    private static void order() {
        System.out.printf("Click 1 to Order 0 to Cancel %n");

        Scanner sc = new Scanner(System.in);
        try {
            int orderOrCancel = sc.nextInt();

            if(orderOrCancel == 1) {
                var mealList = new ArrayList<Meal>();
                do {
                    Meal meal = selectMeal(sc);
                    mealList.add(meal);
                    System.out.println("Click 1 to continue order more, 2 for payment, 0 to cancel");
                    orderOrCancel = sc.nextInt();
                    if(orderOrCancel == 0 || orderOrCancel > 2) {
                        break;
                    } else if(orderOrCancel == 2) {
                        makePayment(mealList);
                        break;
                    }
                } while(true);
            } else {
                System.out.println("Thanks for visiting");
                sc.close();
            }
        } catch (Exception e) {
            System.out.println("Input is not valid, Thank You");
        }
    }

    private static void makePayment(List<Meal> mealList) {
        System.out.printf("Thanks for purchasing! Check your order and bill amount before paying %n");
        double totalBill = 0.0d;
        for (Meal meal : mealList) {
            System.out.printf(" %20s with %s = %6.2f %n",meal.getBurger().getType(),  meal.getBurger().getExtraToppings(), meal.getBurger().getPrice());
            System.out.printf("%20s - %s = %6.2f %n", meal.getDrink().getType(), meal.getDrink().getSize(), meal.getDrink().getPrice());
            System.out.printf("%20s = %6.2f %n", meal.getSideItem().getType(), meal.getSideItem().getPrice());
            totalBill = meal.getBurger().getPrice() + meal.getDrink().getPrice() + meal.getSideItem().getPrice();
        }
        System.out.printf("Your total bill = %6.2f", totalBill);
    }

    private static Meal selectMeal(Scanner sc) {
        Meal meal = null;
        System.out.println("Select your Meal from below option:");
        System.out.println("1 --> Regular Veg Meal [Burger, Regular Coke, French Fries]");
        System.out.println("2 --> Your Choice Burger");
        System.out.println("3 --> Deluxe Burger [ With More Toppings....]");
        int selectedMeal = sc.nextInt();
        if(selectedMeal == 1) {
            meal = new Meal();
        }
        if(selectedMeal > 1 && selectedMeal < 4) {
            System.out.println("Click 1 for veg and 0 for non veg");
            boolean isVeg = (sc.nextInt() == 1) ? true : false;
            meal = Meal.getMeal(sc, selectedMeal, isVeg);
        }
        return meal;
    }

}
