package src.main.java.org.example.collections.collectionsclass;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CardMain {

    public static void main(String[] args) {
        Card[] arrayOfCards = new Card[13];
        System.out.println(Arrays.toString(arrayOfCards));
        Card aceOfHearts = Card.getFaceCard(Suit.HEART, 'A');
        Card aceOfSpade = Card.getFaceCard(Suit.SPADE, 'A');

        Arrays.fill(arrayOfCards, aceOfHearts);

        Card.printDeck("Aces of Hearts", Arrays.asList(arrayOfCards), 1);

        List<Card> cards = new ArrayList<>(52);
        System.out.println("Before adding cards size " + cards.size());
        Collections.fill(cards, aceOfSpade);

        System.out.println(cards);
        System.out.println("Cards size after adding " + cards.size());

        System.out.println("-".repeat(20));

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);

        System.out.println(acesOfHearts);

        Card kingOfClub = Card.getFaceCard(Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClub);
        Card.printDeck("King of Clubs", kingsOfClubs, 1);

        Collections.addAll(cards, arrayOfCards);
        Collections.addAll(cards, arrayOfCards);
        Card.printDeck("Card collection with Aces Added", cards, 2);

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck("Card collection with Kings Added", cards, 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck("List Copy of Kings", cards, 1);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck("Shuffled Cards", deck, 4);

        Collections.reverse(deck);
        Card.printDeck("Reversed Cards", deck, 4);

        Comparator<Card> sortingAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck("Standard Cards sorted by rank", deck, 13);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck("Sublist cards of Kings", kings, 1);

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck("Sublist cards of Tens", tens, 1);

        int indexOfTens = Collections.indexOfSubList(deck, tens);
        System.out.println("Sublist index for tens = " + indexOfTens);

        int lastIndexOfTens = Collections.lastIndexOfSubList(deck, tens);
        System.out.println("Sublist index for tens = " + lastIndexOfTens);

        // Disjoint in collection if the collections are share the same element it will false
        var disJoint = Collections.disjoint(deck, tens);
        System.out.printf("disjoint = %b%n", disJoint);

        var disJoint2 = Collections.disjoint(kings, tens);
        System.out.printf("disjoint = %b%n", disJoint2);

        Card tenOfHearts = Card.getNumericCard(Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithm);
        System.out.println(deck.get(foundIndex));

        Card tenOfClubs = Card.getNumericCard(Suit.CLUB, 10);
        deck.reversed();
        Collections.replaceAll(deck, tenOfHearts, tenOfClubs);
        Card.printDeck("Tens replaced", deck.subList(32, 36), 1);

        if (Collections.replaceAll(deck, tenOfHearts, tenOfClubs)) {
            System.out.println("Replace happened");
        } else {
            System.out.println("No replace happened");
        }

        System.out.println("Frequency of 10 club card = " + Collections.frequency(deck, tenOfClubs));

        System.out.println("Best Card = " + Collections.max(deck, sortingAlgorithm));
        System.out.println("Worst Card = " + Collections.min(deck, sortingAlgorithm));

    }
}
