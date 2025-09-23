package src.main.java.org.example.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public enum DayOfTheWeek {

    SUN("Sunday"),
    MON("Monday"),
    TUES("Tuesday"),
    WED("Wednesday"),
    THURS("Thursday"),
    FRI("Friday"),
    SAT("Saturday");

    private String displayValue;

    public String getDisplayValue() {
        return this.displayValue;
    }

    private DayOfTheWeek(String displayValue) {
        this.displayValue = displayValue;
    }

    public static long doSomething() {
        return Stream.of(DayOfTheWeek.values())
                .peek(System.out::println)
                .filter(day -> day.getDisplayValue().length() > 6 )
                .count();
    }

}
