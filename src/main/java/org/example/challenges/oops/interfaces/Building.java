package src.main.java.org.example.challenges.oops.interfaces;

public class Building implements Mappable{

    protected String name;

    protected BuildingType type;

    public Building(String name, BuildingType type) {
        this.name = name;
        this.type = type;
    }


    @Override
    public String getlabel() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {

        return switch (type) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.PUSH_PIN;
            case SPORTS -> Color.ORANGE + " " + PointMarkers.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarkers.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s"}""".formatted(name, type);
    }
}
