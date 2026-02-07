package src.main.java.org.example.collections.map.linkedhashmap;

import java.time.LocalDate;

public record Purchase(String courseId, int studentId, double price, int yr, int dayOfYear) {

    public LocalDate purchaseDate() {
        return LocalDate.ofYearDay(yr, dayOfYear);
    }

}
