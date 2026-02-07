package src.main.java.org.example.challenges.generics;

public class Park extends Point {

    private String locationName;

    private String type = "Park";

    public Park(String location, String name) {
        super(location);
        this.locationName = name;
    }

    @Override
    public String toString() {
        return locationName + " National Park";
    }

}
