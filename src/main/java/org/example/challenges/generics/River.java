package src.main.java.org.example.challenges.generics;

public class River extends Line {

    private String locationName;

    private String type = "River";

    public River(String location, String locationName) {
        super(location);
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return locationName + " River";
    }

}
