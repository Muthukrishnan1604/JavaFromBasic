package src.main.java.org.example.collections.map.linkedhashmap;

import java.time.LocalDate;
import java.util.*;

public class Main {

    private static Map<String, Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();

    public static void main(String[] args) {
        Course javaCourse = new Course("Java123", "Java Master Class", "Java");
        Course dynatraceCourse = new Course("Dynatrace123", "Dynatrace Master Class", "Dynatrace");

        addPurchase("Muthu", javaCourse, 4000.00);
        addPurchase("Divya", dynatraceCourse, 7000.50);
        addPurchase("Muthu", dynatraceCourse, 7000.50);
        addPurchase("Hema", javaCourse, 4000.00);
        addPurchase("Victor", javaCourse, 3000.00);
        addPurchase("Hepsi", dynatraceCourse, 4000.00);
        addPurchase("Yugan", javaCourse, 3000.00);
        addPurchase("Jashu", dynatraceCourse, 4000.00);
        addPurchase("MyWorld", javaCourse, 2500.00);

        purchases.forEach((courseKey, purchase) -> System.out.println("Key = " + courseKey + " : " + purchase) );
        students.forEach((key, value) -> System.out.println("Key = " + key + " : " + value));

        NavigableMap<LocalDate, List<Purchase>> datedPurchases = new TreeMap<>();

        for(Purchase p : purchases.values()) {
            datedPurchases.compute(p.purchaseDate(), (purchaseDate, purchaseList) -> {
                List<Purchase> list = (purchaseList == null) ? new ArrayList<>() : purchaseList;
                list.add(p);
                return list;
            });
        }

        datedPurchases.forEach((k, v) -> System.out.println(k + " : " + v));

        int currentYear = LocalDate.now().getYear();

        LocalDate firstDay = LocalDate.ofYearDay(currentYear, 1);
        LocalDate week1 = firstDay.plusDays(7);

        Map<LocalDate, List<Purchase>> week1Purchases = datedPurchases.headMap(week1);
        Map<LocalDate, List<Purchase>> week2Purchases = datedPurchases.tailMap(week1);

        /*
        System.out.println("-".repeat(30) + "Week 1 Purchase" + "-".repeat(30));
        week1Purchases.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("-".repeat(30) + "Week 2 Purchase" + "-".repeat(30));
        week2Purchases.forEach((k, v) -> System.out.println(k + " : " + v));
        */

        displayStats(1, week1Purchases);
        displayStats(2, week2Purchases);

        System.out.println("-".repeat(30));

        LocalDate lastDate = datedPurchases.lastKey();

        System.out.println(lastDate);
        var previousEntry = datedPurchases.lastEntry();

        while (previousEntry != null) {
            List<Purchase> lastDayData = previousEntry.getValue();
            System.out.println(lastDate + " purchases : " + lastDayData.size());

            LocalDate prevDate = datedPurchases.lowerKey(lastDate);
            previousEntry = datedPurchases.lowerEntry(prevDate);
            lastDate = prevDate;
        }

        System.out.println("-".repeat(30));
        var reversed = datedPurchases.descendingMap();

        LocalDate firstDate = reversed.firstKey();

        var nextEntry = reversed.firstEntry();

        while (nextEntry != null) {
            List<Purchase> lastDayData = nextEntry.getValue();
            System.out.println(firstDate + " purchases : " + lastDayData.size());

            LocalDate nextDate = datedPurchases.higherKey(firstDate);
            nextEntry = datedPurchases.higherEntry(firstDate);
            firstDate = nextDate;
        }

    }

    private static void addPurchase(String name, Course course, double price) {
        Student existingStudent = students.get(name);

        if(existingStudent == null) {
            existingStudent = new Student(name, course);
            students.put(name, existingStudent);
        } else {
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1, 15);
        String key = course.courseId() + "_" + existingStudent.getId();
        int year = LocalDate.now().getYear();

        Purchase purchase = new Purchase(course.courseId(), existingStudent.getId(), price, year, day);
        purchases.put(key, purchase);
    }

    private static void displayStats(int period, Map<LocalDate, List<Purchase>> periodData) {
        System.out.println("-".repeat(30));
        Map<String, Integer> weeklyCounts = new TreeMap<>();

        periodData.forEach(
                (k, v) -> {
                    System.out.println(k + " : " + v);
                    for(Purchase purchase : v) {
                        weeklyCounts.merge(purchase.courseId(), 1, (prev, curr) -> {
                            return  prev + curr;
                        });
                    }
                }
        );
        System.out.printf("Week %d Purchases = %s%n", period, weeklyCounts);
    }
}
