package src.main.java.org.example.challenges.oops.interfaces;

public class UtilityLine implements Mappable {

    protected String name;

    protected UtilityType type;

    public UtilityLine(String name, UtilityType type) {
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
            case  ELECTRICAL-> Color.GREEN + " " + PointMarkers.TRIANGLE;
            case  FIBER_OPTIC-> Color.RED + " " + PointMarkers.STAR;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """ 
                , "name": "%s", "utility": "%s"}""".formatted(name, type);
    }
}
