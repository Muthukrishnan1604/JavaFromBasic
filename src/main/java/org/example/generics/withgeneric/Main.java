package src.main.java.org.example.generics.withgeneric;

import src.main.java.org.example.generics.withoutgeneric.CricketPlayer;
import static src.main.java.org.example.generics.withoutgeneric.Main.scoreResult;

public class Main {

    public static void main(String[] args) {
        Affiliation affiliation = new Affiliation("Muthu", "Royapuram", "Chn");

        Team<CricketPlayer, Affiliation> rockerz = new Team<>("Rockerz");
        Team<CricketPlayer, Affiliation> jokerz = new Team<>("Jokerz");

        scoreResult(rockerz, 5, jokerz, 10);

        var chn = new CricketPlayer("Krishna", "Right Hand Bowler");
        CricketPlayer muthu = new CricketPlayer("Muthu", "Left Hand Batsman");
        TennisPlayer hema = new TennisPlayer("Hema", "Right Hand Player");
        rockerz.addTeamMember(chn);
        rockerz.addTeamMember(muthu);
        //rockerz.addTeamMember(hema); // See in rockerz if we have the tennis player due to generics it is restricting
        rockerz.listTeamMembers();

        /*Below code will throw error because it is not implements player class or extends player class
        Type parameter 'java.lang.String' is not within its bound;
        should implement 'src.main.java.org.example.generics.withoutgeneric.Player'

        Team<String> chennai = new Team<>("Chennai");
        chennai.addTeamMember("MS Dhoni");
        chennai.listTeamMembers();
        */

        var bangalore = new VolleyBallPlayer("Bangalore", "");
        var volleyBallTeam = new Team<VolleyBallPlayer, Affiliation>("Bangalore", affiliation);
        volleyBallTeam.addTeamMember(bangalore);
        volleyBallTeam.listTeamMembers();

        System.out.println(volleyBallTeam.ranking());
    }

}
