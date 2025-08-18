package src.main.java.org.example.challenges.generics;

public abstract class Line implements Mappable {

    private Location location;

    public Line(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    private static String locationDetails = """
            {
                Latitude = %f,
                Longitude = %f
            }
            """;

    private String location() {
        return (location != null) ? locationDetails.formatted(location.latitude(), location.longitude()) : "No details for location";
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Line ( " + location() + " )");
    }
}
