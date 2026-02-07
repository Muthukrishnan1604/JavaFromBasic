package src.main.java.org.example.collections.Hashing;

import java.util.Objects;

public class PlayingCard {

    private String suit;

    private String face;

    private int internalHash;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        internalHash = "Hearts".equals(suit) ? 11 : 12;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCard that = (PlayingCard) o;
        return Objects.equals(suit, that.suit) && Objects.equals(face, that.face);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, face);
    }
}
