package src.main.java.org.example.challenges.oops.interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfaceChallenge {

    public static void main(String[] args) {

        List<Mappable> buildings = new ArrayList<>();
        buildings.add(new Building("Royapuram", BuildingType.GOVERNMENT));
        buildings.add(new Building("MC Road", BuildingType.BUSINESS));
        buildings.add(new Building("RSRM", BuildingType.SPORTS));
        buildings.add(new UtilityLine("Utility", UtilityType.FIBER_OPTIC));

        for(Mappable map : buildings) {
            Mappable.mapIt(map);
        }
    }



}
