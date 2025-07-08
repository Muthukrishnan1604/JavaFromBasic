package src.main.java.org.example.oops.encapsulation;

/*
Benefits of Encapsulation is Data Hiding. In encapsulation we have control over the data variable.

We can achieve the encapsulation by assigning the variable as private variable and through getter and setter
or through some public methods onnly we can access the variable in the class. In that case overriding the value
with invalid data is not possible
 */

public class EnhacedPlayer {

    private  String fullName;

    private int healthPercentage;

    private String weapon;

    public EnhacedPlayer(String fullName) {
        this(fullName, 100, "pistol");
    }

    public EnhacedPlayer(String fullName, int healthPercentage, String weapon) {
        if(fullName != null && fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            System.out.println("Enter valid name");
        }
        if(healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else if(healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;

        if(healthPercentage <= 0) {
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;

        if(healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }

}
