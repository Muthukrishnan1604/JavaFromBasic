package src.main.java.org.example.oops.encapsulation;

public class EncapsulationMain {

    public static void main(String[] args) {

        // Impact of not using the encapsulation
        Player player = new Player();

        player.name = "Muthu";
        player.health = 20;
        player.weapon = "AK47";

        player.loseHealth(10);
        System.out.println("Remaining health = " + player.healthRemaining());
        player.health = 200; // This is the problem with no encapsulating even if we have restore method to restore health
        // system will increase the health by directly accessing the field which leads to bypassing the check which we have for that field
        // And also if we change the field name from name -> fullName or FirstName later then where ever it is accessed will
        // get impacted if application is too big
        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());

        System.out.println("-".repeat(20));
        System.out.println("Benefit of using encapsulation it will provide more control over the class fields");
        EnhacedPlayer enhacedPlayer = new EnhacedPlayer("Divya");
        System.out.println(enhacedPlayer.getHealthPercentage());

        //Even if we give invalid health it won't allow to set that
        enhacedPlayer = new EnhacedPlayer("MuthuDivi", 200, "Sword");
        System.out.printf("Health remaining = %d%n",enhacedPlayer.healthRemaining());
    }

}
