package src.main.java.org.example.challenges.stream.geminiproblems;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

record User(int id, String name) {}

public class Merger {

    public static void main(String[] args) {

        List<User> users = List.of(
                new User(1, "Alice"),
                new User(2, "Bob"),
                new User(1, "Alicia"),  // Conflict! ID 1 already exists
                new User(3, "Charlie")
        );

        Map<Integer, String> result = users.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(User::id, User::name,
                        (existing, newValue) -> String.join("-", existing, newValue)));

        System.out.println(result);

    }

}
