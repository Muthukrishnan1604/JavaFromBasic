package src.main.java.org.example.enums;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeek weekDay = getRandomDay();
        System.out.println(weekDay);
        // ordinal will return the order of the enum
        System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());

        for(int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
            switchDayOfWeek(weekDay);
            if(weekDay.equals(DayOfTheWeek.FRI)) {
                System.out.println("Found a Friday");
            }
        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static DayOfTheWeek getRandomDay() {
        Random random = new Random();
        int value = random.nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[value];
    }

    public static void switchDayOfWeek(DayOfTheWeek dayOfTheWeek) {
        int weekDay = dayOfTheWeek.ordinal() + 1;

        switch (dayOfTheWeek) {
            case WED -> System.out.println("Wednesday is Day " + weekDay);
            case SAT -> System.out.println("Saturday is Day " + weekDay);
            default -> System.out.println(dayOfTheWeek.name().charAt(0) + dayOfTheWeek.name().substring(1).toLowerCase() + "day is Day " + weekDay);
        }

    }
}
