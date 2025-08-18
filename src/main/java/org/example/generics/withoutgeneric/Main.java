package src.main.java.org.example.generics.withoutgeneric;

import src.main.java.org.example.generics.withgeneric.Team;

public class Main {

    public static void main(String[] args) {

        CricketTeam rockerz1 = new CricketTeam("Rockerz1");
        CricketTeam jokerz1 = new CricketTeam("Jokerz1");
        scoreResult(rockerz1, 3, jokerz1, 5);

        SportsTeam rockerz = new SportsTeam("Rockerz");
        SportsTeam jokerz = new SportsTeam("Jokerz");
        CricketPlayer muthu = new CricketPlayer("Muthu", "Left Hander Batsman");
        CricketPlayer divi = new CricketPlayer("Divi", "Right Hand Bowler");
        rockerz.addTeamMember(muthu);
        rockerz.addTeamMember(divi);
        rockerz.listTeamMembers();
        scoreResult(rockerz, 5, jokerz, 10);

        SportsTeam rockerz2 = new SportsTeam("Rockerz2");
        var chn = new FootballPlayer("Krishna", "Center half forward");

        rockerz2.addTeamMember(chn);
        rockerz2.addTeamMember(muthu); // See in rockerz 2 we have the football player but we are adding cricketplayer due to no check
        rockerz2.listTeamMembers();

    }

    public static void scoreResult(CricketTeam team1, int t1_Score,
                                   CricketTeam team2, int t2_Score) {
        String message = team1.setScore(t1_Score, t2_Score);
        team2.setScore(t2_Score, t1_Score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_Score,
                                   SportsTeam team2, int t2_Score) {
        String message = team1.setScore(t1_Score, t2_Score);
        team2.setScore(t2_Score, t1_Score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_Score,
                                   Team team2, int t2_Score) {
        String message = team1.setScore(t1_Score, t2_Score);
        team2.setScore(t2_Score, t1_Score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}
