package src.main.java.org.example.oops.interfaces;

public class Test {

    public static void main(String[] args) {
        inFlight(new Jet());

        //OrbitEarth.log("Testing " + new Satellite());

        orbit(new Satellite());
    }

    private static void inFlight(FlightEnabled flightEnabled) {
        flightEnabled.takeOff();
        flightEnabled.transition(FlightStages.LAUNCH);
        flightEnabled.fly();

        if(flightEnabled instanceof Trackable tracked) {
            System.out.println("Inside instance of");
            tracked.track();
        }

        flightEnabled.land();
    }

    private static void orbit(OrbitEarth flightEnabled) {
        flightEnabled.takeOff();
        flightEnabled.fly();
        flightEnabled.land();
    }

}
