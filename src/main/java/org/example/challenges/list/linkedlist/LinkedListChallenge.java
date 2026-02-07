package src.main.java.org.example.challenges.list.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Town> towns = new LinkedList<>();
        addTown(towns, new Town("Chennai", 0));
        addTown(towns, new Town("Tenkasi", 600));
        addTown(towns, new Town("Madurai", 450));
        addTown(towns, new Town("Madurai", 450));
        addTown(towns, new Town("Tirchy", 300));
        addTown(towns, new Town("Virudhunagar", 500));
        addTown(towns, new Town("Villupuram", 200));

        System.out.println(towns);

        var iterator = towns.listIterator();
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);
            if(!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            switch (menuItem) {

                case "F" -> {
                    if(!forward) {
                        forward = true;
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    System.out.println("User want to move forward");
                    if(iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    if(forward) {
                        forward = false;
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    System.out.println("User want to move backward");
                    if(iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "M" -> printMenu();
                case "L" -> System.out.println(towns);
                default -> quitLoop= true;
            }
        }

    }

    private static void addTown(LinkedList<Town> list, Town townToBeAdded) {
        ListIterator<Town> iterator = list.listIterator();
        boolean isDuplicate = false;
        while(iterator.hasNext()) {
            Town town = iterator.next();
            if(town != null && townToBeAdded != null && town.getName().equalsIgnoreCase(townToBeAdded.getName())) {
                isDuplicate = true;
                System.out.println("Duplicate found : " + town);
            }
        }
        if(!isDuplicate) {
            int matchedIndex = 0;
            for(var town : list) {
                if(townToBeAdded.getDistanceFromChennai() < town.getDistanceFromChennai()) {
                    list.add(matchedIndex, townToBeAdded);
                    return;
                }
                matchedIndex ++;
            }
            list.add(townToBeAdded);
        }
    }

    private static void printMenu() {
        System.out.println("""
                    Available actions (Select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit""");
    }
}
