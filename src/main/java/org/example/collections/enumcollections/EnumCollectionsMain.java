package src.main.java.org.example.collections.enumcollections;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class EnumCollectionsMain {

    public static void main(String[] args) {
        List<WeekDay> muthuWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY, WeekDay.TUESDAY, WeekDay.WEDNESDAY,
                WeekDay.THURSDAY, WeekDay.FRIDAY));

        var muthuDaysSet = EnumSet.copyOf(muthuWorkDays);
        System.out.println(muthuDaysSet.getClass().getSimpleName());

        muthuDaysSet.forEach(System.out::println);
        var allDaysSet = EnumSet.allOf(WeekDay.class);
        System.out.println("-".repeat(30));
        System.out.println(allDaysSet);

        Set<WeekDay> newPersonDays = EnumSet.complementOf(muthuDaysSet);
        System.out.println("-".repeat(30));
        newPersonDays.forEach(System.out::println);

        Set<WeekDay> anotherWay = EnumSet.copyOf(allDaysSet);
        anotherWay.removeAll(allDaysSet);
        System.out.println("-".repeat(30));
        anotherWay.forEach(System.out::println);

        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println("-".repeat(30));
        businessDays.forEach(System.out::println);
    }

}
