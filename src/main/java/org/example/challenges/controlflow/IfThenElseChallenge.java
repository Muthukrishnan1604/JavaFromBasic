package src.main.java.org.example.challenges.controlflow;

/*
Insert a code segment after the code we've just reviewed:
Set the existing score variable to 10,000.
Set the existing levelCompleted variable to 8.
Set the existing bonus variable to 200.
Use the same if condition. Meaning if gameOver is true,
then you want to perform the same calculation, and print out the value of the finalScore variable.
*/

public class IfThenElseChallenge {

    public static void main(String[] args) {
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;

        boolean gameOver = (levelCompleted >= 8) ? true : false;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        } else {
            System.out.println("Game is still in progress...");
        }
    }

}
