package src.main.java.org.example.collections.Hashing;

import java.util.*;

public class HashingMain {

    public static void main(String[] args) {
        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        System.out.println(aText == cText);
        System.out.println(bText == dText);
        System.out.println(bText == eText);

        List<String> hellos = Arrays.asList(aText, bText, cText, dText, eText);
        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("My Set = " + mySet);
        System.out.println("# of elements = " + mySet.size());

        for(String val : mySet) {
            System.out.print(val + ": ");
            for (int i = 0; i < hellos.size(); i++) {
                if(val == hellos.get(i)) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }

        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Spade", "Queen");

        List<PlayingCard> cards = Arrays.asList(aceHearts, kingClubs, queenSpades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<PlayingCard> cardSet = new HashSet<>();
        for(PlayingCard val : cards) {
            if(!cardSet.add(val)) {
                System.out.println("Duplicate element found " + val);
            }
        }
        System.out.println(cardSet);
    }
}
