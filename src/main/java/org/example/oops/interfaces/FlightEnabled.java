package src.main.java.org.example.oops.interfaces;

/*
 All members on an interface are implicitly public

 if you omit access modifier on an interface member, it's implicitly public but in other scenario it will be default

 We can extends the other interface, we can't implement the interface in other interface
 */

import java.util.Date;

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    private static void log(String description) {
        var today = new Date();
        System.out.println(today + " : " + description);
    }

    /*
    We can have private method inside default method or private method,
    if we assign it to public it will throw error
     */
    private void logStage(FlightStages stages, String description) {
        description = stages + " : " + description;
        log(description);
    }

    @Override
    default FlightStages  transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning transition to " + nextStage);
        return nextStage;
    }
}


public interface FlightEnabled {

    /*
        Implicitly it will set the variable as static final

        Note -> private is not allowed here for static variable
     */

    double MILES_TO_KM = 1.60934;

    double KM_TO_MILES  = 0.621371;

    abstract void takeOff();

    abstract void land();

    void fly(); // Here it will implicity set the value as public and abstract

    default FlightStages transition(FlightStages stages) {
        FlightStages nextStage = stages.getNextStages();
        System.out.println("Transitioning from " + stages + " to " + nextStage);
        return nextStage;
    }

    static String check() {
        return "";
    }
}
