package src.main.java.org.example.challenges.generics;

public abstract class Point implements Mappable {

    private Location location;

    private String locationDetails = """
            {
                Latitude = %f,
                Longitude = %f
            }
            """;

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    private String location() {
        return (location != null) ? locationDetails.formatted(location.latitude(), location.longitude()) : "No details for location";
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Point ( " + location() + " )");
    }
}
