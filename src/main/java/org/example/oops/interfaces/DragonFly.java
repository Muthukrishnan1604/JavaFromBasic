package src.main.java.org.example.oops.interfaces;

/*
We can implement interface in record but extends is not allowed in Record

same applies for Enum class as well
 */

public record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
