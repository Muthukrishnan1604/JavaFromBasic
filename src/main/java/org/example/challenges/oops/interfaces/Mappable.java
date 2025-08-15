package src.main.java.org.example.challenges.oops.interfaces;

public interface Mappable {

    public static final String JSON_PROPERTY = """
                   "properties": {%s """;

    String getlabel();

    public abstract Geometry getShape();

    abstract String getMarker();

    default String toJSON() {
        return """
                "type": "%s", "label": "%s", "marker": "%s"
                """.formatted(getShape(), getlabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }

}
