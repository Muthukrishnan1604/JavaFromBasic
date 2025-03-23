package src.main.java.org.example.challenges.controlflow;

/*
In this challenge, we'll be using the NATO alphabet to replace a character or letter, with NATO's standardized word for that letter.
In radio transmissions, the word car, "C", "A", "R", would be read, "Charlie Able Roger", for clarity.
We'll take a single character, and return the matching word from the NATO phonetic alphabet, shown on this slide.
We'll just do this for the letters A, through E.

A -> Able, B -> Baker, C -> Cahrlie, D -> Dog, E -> Easy
 */

public class TraditionalSwitchChallenge {

    public static void main(String[] args) {
        System.out.println(getDataFromTraditionalSwitch('A') + " " + getDataFromTraditionalSwitch('b'));
        System.out.println(getDataFromTraditionalSwitch('F'));
    }

    public static String getDataFromTraditionalSwitch(char input) {
        switch (input) {
            case 'A': case 'a': return "Able";
            case 'B': case 'b': return "Baker";
            case 'C': case 'c': return "Charlie";
            case 'D': case 'd': return "Dog";
            case 'E': case 'e': return "Easy";
            default: return "Not Found";
        }
    }

}
