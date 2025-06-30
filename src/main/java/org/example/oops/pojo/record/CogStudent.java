package src.main.java.org.example.oops.pojo.record;

/*
Record won't support the setter methods

It will call the constructor and few other methods implicitly
 */

public record CogStudent(int id, String name, String dateOfBirth, String classList) {

}
