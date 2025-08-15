package src.main.java.org.example.oops.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();

        Animal animal = bird;

        Trackable tracked = bird;

        FlightEnabled flightEnabled = bird;

        bird.move();

        /*
            Below will throw compiler error:
            flightEnabled.move();
            tracked.move();
         */

        flightEnabled.fly();
        flightEnabled.land();
        flightEnabled.takeOff();

        tracked.track();

        inFlight(flightEnabled);
        inFlight(bird);
        inFlight(new Jet());

        double kmsTravelled = 100;
        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The jet travelled %.2f km or %.2f miles%n", kmsTravelled, milesTravelled);


        ArrayList<FlightEnabled> flightEnableds = new ArrayList<>();
        flightEnableds.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(flightEnableds);
        flyFliers(flightEnableds);
        landFliers(flightEnableds);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void inFlight(FlightEnabled flightEnabled) {
        flightEnabled.takeOff();
        flightEnabled.fly();

        if(flightEnabled instanceof Trackable tracked) {
            System.out.println("Inside instance of");
            tracked.track();
        }

        flightEnabled.land();
    }

    private static void triggerFliers(List<FlightEnabled> flightEnableds) {
        for (var flier : flightEnableds) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> flightEnableds) {
        for (var flier : flightEnableds) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> flightEnableds) {
        for (var flier : flightEnableds) {
            flier.land();
        }
    }}
