package src.main.java.org.example.collections.collectionsclass;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank) {

    public static final String DESCRIPTION = "Current Deck";

    public static Card getNumericCard(Suit suit, int number) {

        if(number > 1 && number < 11) {
            return new Card(suit, String.valueOf(number), number - 2);
        }

        System.out.println("Invalid Input in getNumeric card");
        return null;
    }

    public static Card getFaceCard(Suit suit, char input) {
        int charIndex = "JQKA".indexOf(input);
        if(charIndex > -1) {
            return new Card(suit, "" + input, charIndex + 9);
        }
        System.out.println("Invalid value in getFaceCard method");
        return null;
    }

    public static List<Card> getStandardDeck() {
        List<Card> cardList = new ArrayList<>(52);
        for (Suit suit : Suit.values()) {
            for (int i = 2; i < 11; i++) {
                cardList.add(getNumericCard(suit, i));
            }
            for(char value : new char[] {'J', 'Q', 'K', 'A'}) {
                cardList.add(getFaceCard(suit, value));
            }
        }
        return cardList;
    }

    public static void printDeck(String description, List<Card> cards, int numberOfRows) {
        System.out.println("-".repeat(20));
        if(description != null) {
            System.out.println(description);
        }
        int cardsInRow = cards.size() / numberOfRows;
        for(int i = 0; i < numberOfRows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            cards.subList(startIndex, endIndex).forEach(card -> System.out.print(card + " "));
            System.out.println();
        }
    }

    public static void printDeck(List<Card> cards) {
        printDeck(DESCRIPTION, cards, 4);
    }

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }


}
