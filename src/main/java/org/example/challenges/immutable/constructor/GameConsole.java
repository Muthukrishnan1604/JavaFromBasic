package src.main.java.org.example.challenges.immutable.constructor;

import java.util.Scanner;

public class GameConsole<T extends Game<? extends Player>> {

    private static final Scanner scanner = new Scanner(System.in);

    private final T game;

    public GameConsole(T game) {
        this.game = game;
    }

    private int addPlayer(String playerName) {
        System.out.println("Enter your playing name: ");
        String name = scanner.nextLine();

        System.out.printf("Welcome to %s, %s!%n".formatted(game.getGameName(), name));
        return game.addPlayer(name);
    }

    private void playGame(int playerIndex) {
        boolean done = false;

        while (!done) {
            var gameActions = game.getGameActions(playerIndex);
        }
    }

}
