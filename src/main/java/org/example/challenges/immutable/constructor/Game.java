package src.main.java.org.example.challenges.immutable.constructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class Game<T extends Player> {

    private final String gameName;

    private final List<Player> playerList = new ArrayList<>();

    private Map<Character, GameAction> gameActionMap = null;

    protected Game(String gameName, List<Player> playerList, Map<Character, GameAction> gameActionMap) {
        this.gameName = gameName;
        //this.playerList = playerList;
        //this.gameActionMap = gameActionMap;
    }

    public String getGameName() {
        return gameName;
    }

    public Map<Character, GameAction> getGameActionMap() {
        if (gameActionMap == null) {
            gameActionMap = new LinkedHashMap<>(Map.of('I',
                    new GameAction('I', "Print Player Info", this::printPlayer),
                    'Q', new GameAction('Q', "Quit Game", this::quitGame)));

        }
        return gameActionMap;
    }

    public abstract T createNewPlayer(String name);

    public abstract Map<Character, GameAction> getGameActions(int playerIndex);

    public final int addPlayer(String playerName) {
        T player = createNewPlayer(playerName);
        if(player != null) {
            playerList.add(player);
            return playerList.size() - 1;
        }
        return -1;
    }

    protected final T getPlayer(int playerIndex) {
        return (T) playerList.get(playerIndex);
    }

    public boolean executeGameAction(int player, GameAction gameAction) {
        return gameAction.action().test(player);
    }

    public boolean printPlayer(int playerIndex) {
        Player player = playerList.get(playerIndex);
        System.out.println(player);
        return false;
    }

    public boolean quitGame(int playerIndex) {
        Player player = playerList.get(playerIndex);
        System.out.println("Sorry to see you go, " + player.name());
        return true;
    }

}
