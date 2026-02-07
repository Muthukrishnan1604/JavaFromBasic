package src.main.java.org.example.challenges.generics;

import java.util.Arrays;

public class GenericsMainChallenge {

    public static void main(String[] args) {

        var annaPark = new Park("13.1040, 80.2937", "RSRM - Anna Park");

        Park busStandPark = new Park("111.1040, -80.209","Bus Stand - Krishna Park");

        River kRiver = new River("53.1040, 90.2937", "Nappier Bridge - River View");

        Park[] parks = {annaPark, busStandPark};

        Layer<Park> parkLayer = new Layer<>(parks);

        parkLayer.renderLayer();

        River[] rivers = {kRiver};

        River pambai = new River("53.1041, 95.2937", "Pambai");

        Layer<River> riverLayer = new Layer<>(rivers);

        riverLayer.addElement(pambai);

        riverLayer.renderLayer();
    }

}
