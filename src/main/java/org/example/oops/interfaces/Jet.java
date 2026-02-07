package src.main.java.org.example.oops.interfaces;

public class Jet implements FlightEnabled, Trackable{
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " is tracking");
    }

    @Override
    public FlightStages transition(FlightStages stages) {
        System.out.println(stages);
        return FlightEnabled.super.transition(stages);
    }
}
