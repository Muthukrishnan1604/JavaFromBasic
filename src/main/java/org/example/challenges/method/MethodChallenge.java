package src.main.java.org.example.challenges.method;

/*
In this challenge we're going to create two methods:
The first method should be named displayHighScorePosition.
This method should have two parameters, one for a player's name, and one for a player's position in a high score list.
This method should print a message like "Tim managed to get into position 2 on the high score list".

The second method should be named calculateHighScorePosition.
This method should have only one parameter, the player's score.
This method should return a number between 1 and 4, based on the score values shown in this table.

condition -

Score greater than or equal to 1000 - 1
Score greater than or equal to 500 but less than 1000 - 2
Score greater than or equal to 100 but less than 500 - 3
All other scores - 4

Finally, we'll call both methods and display the results for the following scores: 1500, 1000, 500, 100, and 25.

 */

public class MethodChallenge {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Hepsi", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Victor", position);

        position = calculateHighScorePositionUsingTernary(1500);
        displayHighScorePosition("Divi", position);

        position = calculateHighScorePositionUsingTernary(100);
        displayHighScorePosition("Krishna", position);

        position = calculateHighScorePositionUsingTernary(-100);
        displayHighScorePosition("Latha", position);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println( playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateHighScorePositionUsingTernary(int score) {
        return (score >= 1000) ? 1 : (score >= 500) ? 2 : (score >= 100) ? 3 : 4;
    }
}
