package src.main.java.org.example.challenges.generics;

public interface Mappable {

    void render();

    static Location stringToLatLon(String stringInput) {
        String[] loc = (stringInput != null) ?  stringInput.trim().split(",") : null;
        if(loc != null) {
            Location location = new Location(Double.parseDouble(loc[0]), Double.parseDouble(loc[1]));
            return location;
        }
        return new Location(-1.0, -1.0);
    }
}
