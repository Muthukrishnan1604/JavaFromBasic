package src.main.java.org.example.generics.withgeneric;

import src.main.java.org.example.generics.withoutgeneric.Player;

public record TennisPlayer(String name, String position) implements Player {
}

record VolleyBallPlayer(String name, String position) implements Player {
}
